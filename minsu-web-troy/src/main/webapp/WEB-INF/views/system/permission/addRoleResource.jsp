<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="customtag" uri="http://minsu.ziroom.com" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<base href="${basePath}">
    <title>自如民宿后台管理系统</title>
    <meta name="keywords" content="自如民宿后台管理系统">
    <meta name="description" content="自如民宿后台管理系统">
    
    <link href="${staticResourceUrl}/css/bootstrap.min.css${VERSION}" rel="stylesheet">
    <link href="${staticResourceUrl}/css/font-awesome.css${VERSION}" rel="stylesheet">
	<link href="${staticResourceUrl}/css/plugins/jsTree/style.min.css${VERSION}" rel="stylesheet">
    <link href="${staticResourceUrl}/css/animate.css${VERSION}" rel="stylesheet">
    <link href="${staticResourceUrl}/css/style.css${VERSION}" rel="stylesheet">
    <link href="${staticResourceUrl}/css/plugins/treeview/bootstrap-treeview.css${VERSION}" rel="stylesheet">
</head>
  
 <body class="gray-bg">
    <div class="wrapper wrapper-content  animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-content">
			           <form class="form-horizontal m-t" id="form">
			           		<div class="form-group">
			                   <label class="col-sm-1 control-label">角色名称：</label>
			                   <div class="col-sm-2">
			                       <input id="roleName" name="roleName" type="text" class="form-control">
			                   </div>
			                   <label class="col-sm-1 control-label">角色类型：</label>
			                   <div class="col-sm-2">
			                   	   <select class="form-control m-b" name="roleType"  id="roleType">
			                   	   		<option value="0">普通角色</option>
			                   	   		<option value="1">数据区域角色</option>
			                   	   		<option value="2">区域角色</option>
			                   	   		<option value="3">数据角色</option>
			                   	   </select>
			                   </div>
					           <div class="col-sm-1">
						           <customtag:authtag authUrl="system/permission/saveRoleResource">
						               <button class="btn btn-primary" id="saveBtn" type="button" onclick="saveTree();">保存</button>
						           </customtag:authtag>
					           </div>
					           <label class="col-sm-1 control-label">角色类型描述：</label>
			                   <div class="col-sm-3">
			                   <span style="font-weight:bold;">普通角色：</span>用户不受自己所在区域和用户所属数据的限制，可以操作、浏览所分配到的所有数据。</br>
							   <span style="font-weight:bold;">区域角色：</span>用户不受自己所属数据的限制，可以操作、浏览所分配区域的所有数据。</br>
							   <span style="font-weight:bold;">数据角色：</span>用户不受区域限制，可以操作、浏览自己所属的数据。
			                   </div>
			                </div>
			           </form>
			        </div>
                    <div class="ibox-content">
                        <div id="jstree"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
	

    <!-- 全局js -->
    <script src="${staticResourceUrl}/js/jquery.min.js${VERSION}"></script>

    <!-- jsTree plugin javascript -->
    <script src="${staticResourceUrl}/js/plugins/jsTree/jstree.min.js${VERSION}"></script>
    
    <script src="${staticResourceUrl}/js/plugins/validate/jquery.validate.min.js${VERSION}"></script>
    <script src="${staticResourceUrl}/js/plugins/validate/messages_zh.min.js${VERSION}"></script>
    
    <script src="${staticResourceUrl}/js/minsu/common/custom.js${VERSION}"></script>
    <script src="${staticResourceUrl}/js/plugins/layer/layer.min.js${VERSION}"></script>
    
    <script>
        $(function () {
        	showTree();
        	
        	var icon = "<i class='fa fa-times-circle'></i> ";
            $("#form").validate({
                rules: {
                	roleName: "required"
                }
            });
        });
        
       	var resources = [], // 权限树中被选中节点
       	    root = [];//根节点
        function showTree() {  
            $.ajax({
            	cache: false, 
                type : "post",
                dataType : "json",
                url : 'system/permission/listAllResource',  
                success : function(result) {
                	var list = result.data.list;
                    createTree(list);  
                },  
                error : function(result) {  
                    layer.alert("未知错误", {icon: 5,time: 2000, title:'提示'});
                } 
            });  
        }  
  
        function createTree(data) {  
            $('#jstree').jstree({  
                'plugins' : [ 'themes', 'checkbox' ],  
                'core' : {  
                    'themes' : {  
                        'responsive' : false  
                    },  
                    'data' : data  
                },
                'themes' : {
        			'theme' : 'apple',
        			'dots' : true,
        			'icons' : false
        		},
        		'checkbox' : {
        			three_state:false,
        			cascade:''
        		}
            });      
        }
        
      	//绑定监听事件
        $('#jstree').bind('changed.jstree', function(e, data) {  
        	resources = data.selected;
        }).bind('load_node.jstree', function(e, data) {
        	if(!data.node.parent){
        		root = data.node;
        		root.state.selected = true;
        	}
        }).bind('ready.jstree', function(e, data) {
        	data.instance.close_all();
        	var node = root.children[0];
        	data.instance.open_node(node);
        }).bind('select_node.jstree', function (e, data) {
            if (data.event) {
                data.instance.select_node(data.node.children_d);
                data.instance.select_node(data.node.parents);
            }
        }).bind('deselect_node.jstree', function (e, data) {
            if (data.event) {
                data.instance.deselect_node(data.node.children_d);
            }
        });
          
        function saveTree() {
        	$("#saveBtn").attr("disabled","disabled");
        	
            $.ajax({
            	beforeSend : function(){
		        	var valid = $("#form").valid();
    				if(!valid){
    					$("#saveBtn").removeAttr("disabled");
    					return false;
    				}
    				
		        	if(resources.length == 0){
		        		layer.alert("请选择要授权的菜单", {icon: 6,time: 2000, title:'提示'});
    					$("#saveBtn").removeAttr("disabled");
		        		return false;
		        	}
		        	
    				return true;
            	},
                data : {
                	'roleName' : $("#roleName").val(),
                	'roleType':$("#roleType").val(),
                	'resFids' : resources.join(",")
                },  
                type : "post",  
                dataType : "json",  
                url : 'system/permission/saveRoleResource',  
                success : function(result) {
                	if(result.code === 0){
		        		layer.alert("操作成功", {icon: 6,time: 2000, title:'提示'});
		        		$.callBackParent("system/permission/listRoles",true,callBack);
                	}else{
		        		layer.alert("操作失败", {icon: 5,time: 2000, title:'提示'});
    					$("#saveBtn").removeAttr("disabled");
                	}
                },  
                error : function(result) {  
	        		layer.alert("未知错误", {icon: 5,time: 2000, title:'提示'});
   					$("#saveBtn").removeAttr("disabled");
                }  
            });  
        }
        
        function callBack(parent){
        	parent.refreshData("listTable");
        }
    </script>
</body>
</html>
