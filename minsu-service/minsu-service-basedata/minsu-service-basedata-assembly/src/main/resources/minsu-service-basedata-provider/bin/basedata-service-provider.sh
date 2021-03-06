#!/bin/bash
# chkconfig: - 66 01
#v1.0#


BASE_DIR=/home/www
PROJECT=`basename $0|sed 's/^S..//g'| tr -d '\r'`
HOME_DIR=${BASE_DIR}/${PROJECT}
CONF_DIR=${BASE_DIR}/${PROJECT}/conf
STDOUT_DIR=${BASE_DIR}/${PROJECT}/logs
LIB_DIR=${HOME_DIR}/lib
LIB_JARS=`ls ${LIB_DIR}|grep .jar|awk '{print "'${LIB_DIR}'/"$0}'|tr "\n" ":"`
if [ ! -d ${STDOUT_DIR} ]; then
	mkdir ${STDOUT_DIR}
fi

JAVA_CLASS=`grep '^java_class' ${CONF_DIR}/dubbo.properties |awk -F"java_class=" '{print $2}' | tr -d '\r'`
SERVER_PORT=`sed '/socket.port/!d;s/.*=//' ${CONF_DIR}/dubbo.properties | tr -d '\r'`
JAVA_OPTS=`grep '^java_opts' ${CONF_DIR}/dubbo.properties |awk -F"java_opts=" '{print $2}' | tr -d '\r'`
JAVA_MEM_OPTS=`grep '^java_mem_opts' ${CONF_DIR}/dubbo.properties|awk -F"java_mem_opts=" '{print $2}' | tr -d '\r'`
JAVA_DEBUG_OPTS=""
if [ "$1" = "debug" ]; then
    JAVA_DEBUG_OPTS=" -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=8000,server=y,suspend=n"
fi
START () {
	PIDS=`ps -ef | grep java | grep "${CONF_DIR}"|grep -v grep |awk '{print $2}'`
	if [ -n "${PIDS}" ];then
	   echo "${PROJECT} is running!"
	else	
	   echo "Starting the ${PROJECT} ..."
	   nohup /usr/local/java/bin/java ${JAVA_OPTS} ${JAVA_MEM_OPTS} ${JAVA_DEBUG_OPTS} -classpath ${CONF_DIR}:${LIB_JARS} ${JAVA_CLASS} > ${STDOUT_DIR}/stdout.log 2>&1 &
	   sleep 10
	PIDA=`ps -ef | grep java | grep "${CONF_DIR}"|grep -v grep |awk '{print $2}'`
	   if [ -z "${PIDA}" ];then
	      echo "${PROJECT} start err!"
	   fi
	fi
}

STOP () { 
	PIDS=`ps -ef | grep java | grep "${CONF_DIR}"|grep -v grep |awk '{print $2}'`
	  if [ -z "${PIDS}" ];then
	     echo "ERROR: The ${PROJECT} does not started!"
	  else 
	     echo "Stopping the ${PROJECT} ..."
	     for PID in ${PIDS};do
	        kill ${PID} > /dev/null 2>&1
	     done
	     sleep 10
	     PIDSA=`ps -ef | grep java | grep "${CONF_DIR}"|grep -v grep |awk '{print $2}'`
	     if [ -n "${PIDSA}" ];then
		for PID in ${PIDSA} ; do
		   kill -9 ${PIDA} > /dev/null 2>&1	
		 done
		   if [ -n "${PIDSA}" ];then
		      echo "${PROJECT} stop err!"
		   fi
	     fi
	  fi
}

STATUS () {
	PIDS=`ps -ef | grep java | grep "${CONF_DIR}"|grep -v grep |awk '{print $2}'`
	  if [ -z "${PIDS}" ]; then
	     echo "${PROJECT} does not started!"
	  else 
	     echo "${PROJECT} is running!"
	  fi
}


case "$1" in 
	start|START)
	START
	;;
	stop|STOP)
	STOP
	;;
	restart|RESTART)
	STOP
	sleep 5
	START
	;;
	status|STATUS)
	STATUS
	;;
	*)
	echo 'Please input start|stop|status|restart'
	;;
esac

