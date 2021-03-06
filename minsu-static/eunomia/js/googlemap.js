var map;
setMap(39.904211,116.40739499999995,15);
//前段通过关键词查询 地名
function getGoogleLocationByKeyword(keyWStr){
 	if(keyWStr){
        var geocoder = new google.maps.Geocoder();
        if (geocoder) {
             geocoder.geocode({'address': keyWStr}, function (results, status) {
                 if (status == google.maps.GeocoderStatus.OK) {
                     if (results[0]) {
                         try {
                             var addr = '';
                             if(results[0].geometry){
                                 var location = results[0].geometry.location;
                                 if(location){
                              	     var longitude = location.lng();
                                       var latitude = location.lat();
                                       setMap(latitude,longitude,15);
                                 }
                              }
                             if(results[0].address_components){
                                 var nameLength = results[0].address_components.length;
                                 for(var i = nameLength - 1; i >= 0 ; i --){
                                     if(results[0].address_components[i].types[0] != 'country' && results[0].address_components[i].types[0] != 'postal_code'){
                                         if(i == 0){
                                             addr += results[0].address_components[i]['long_name'];
                                         }
                                         else {
                                             addr += results[0].address_components[i]['long_name']+',';
                                         }
                                     }
                                     else {
                                     }
                                 }
                             }

                         }
                         catch (e){
                             console.log(e);
                         }
                         displayAddressTag(addr);
                     }
                 }
                 else {

                 }
             });
         }
    }
 }


//初始化地图,加上拖动结束监听事件
function setMap(latitude,longitude,zoom){
    var myLatlng = new google.maps.LatLng(latitude, longitude);
    var mapOptions = {
        zoom: zoom,
        center: myLatlng,
        panControl: true,
        zoomControl: true,
        mapTypeControl: false,  //右上角的地图形式
        scaleControl: true,
        streetViewControl: false,
        overviewMapControl: true,
        disableDragging: false
    }
    map = new google.maps.Map(document.getElementById('container'), mapOptions);
    map.setOptions({draggable: true});
    
    var keyword = document.getElementById("text_").value;
	 document.getElementById("location").value = longitude + "," + latitude;
    if(keyword !=undefined && keyword !=null&&keyword!=''){
    	 displayAddressTag(keyword);
    }
	
    //拖动地图结束后触发
    var timeoutflag=null;
    //idle 第一次进入和拖动后触发
    //为了防止idle第一次触发
    var firstIdle = 0;
    var idleSwich = true;
    google.maps.event.addListener(map,'idle',function() {

        if(firstIdle == 0){
            firstIdle ++;
            return ;
        }
        //将地图中心点保存到父页面的元素里,再调用父元素方法保存
        var longitude = map.getCenter().lng();
        var latitude = map.getCenter().lat();
        //经度超过-180,180时候的处理
        if(longitude>180 || longitude<-180){
            if(longitude>180){
                longitude = longitude - Math.floor((longitude+180) / 360) * 360;
            }
            else if(longitude<-180){
                longitude = longitude - Math.ceil((longitude-180) / 360) * 360;
            }
        }
      
    	document.getElementById("location").value = longitude + "," + latitude;
        //原方法
        var geocoder = new google.maps.Geocoder();
        if (geocoder) {
            geocoder.geocode({'location': map.getCenter()}, function(results, status) {
                if (status == google.maps.GeocoderStatus.OK) {
                    if (results[0]) {
                        try {
                            var address = '';
                            if(results[0].geometry){
                                var location = results[0].geometry.location;
                                if(location){
                             	     var longitude = location.lng();
                                     var latitude = location.lat();
                                  	document.getElementById("location").value = longitude + "," + latitude;
                                }
                             }
                            if(results[0].address_components){
                                var nameLength = results[0].address_components.length;
                                for(var i = nameLength - 1; i >= 0 ; i --){
                                    if(results[0].address_components[i].types[0] != 'country' && results[0].address_components[i].types[0] != 'postal_code'){
                                        if(i == 0){
                                            address += results[0].address_components[i]['long_name'];
                                        }
                                        else {
                                            address += results[0].address_components[i]['long_name']+',';
                                        }
                                    }
                                    else {
                                    }
                                }
                            }
                        }
                        catch (e){
                            console.log(e);
                        }
                        displayAddressTag(address);
                    }
                    else {
                        console.log('status != google.maps.GeocoderStatus.OK');
                    }
                } else {
                }

            });
        }

    });
    //去掉底部的跳转谷歌的链接
   // waitChangeGoogleInfor();
}

//显示名称标签
function displayAddressTag(Str) {
    $('.addressTag').css('margin-left','-170px');
    $('.addressArrow').show();
    $('.addressTag').html(Str);
    $('.addressTag').css('margin-left','-'+($('.addressTag').width()/2+20)+'px');
}

function copy(){
	var location=document.getElementById("location");
	if(location.value != ''){
		location.select(); // 选择对象
		document.execCommand("Copy"); // 执行浏览器复制命令
		layer.alert("复制成功", {icon: 6,time: 2000, title:'提示'});
	}
}

function searchByStationName(){
	try {
		var keyword = document.getElementById("text_").value;
		if(keyword !=undefined && keyword !=null&&keyword!=''){
			getGoogleLocationByKeyword(keyword);
		}
				
	} catch (e) {
		console.log(e);
	}
}