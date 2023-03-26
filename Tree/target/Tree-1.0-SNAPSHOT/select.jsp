<%--
  Created by IntelliJ IDEA.
  User: admi
  Date: 2023/3/26
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="css/sel.css">
<script src="js/jquery.min.js"></script>
<script>
    $(function () {
        $.ajax({
            type:"POST",
            url:"CS",
            success:function (province){
                $("#province").html("<option value=''>-- 请选择省 --</option>");
                $("#city").html("<option value=''>-- 请选择市 --<opton>");
                $("#district ").html( "<option value=''>-- 请选择区/县 --</option>");
                var p3 = JSON.parse(province)
                $.each(p3,function (i,e) {
                    $("#province").append("<option value='"+e.areaid+"'>"+e.areaname+"</option>");
                })
            }
        })

    })
    function getCity() {
        $.ajax({
            type: "POST",
            url: "QU",
                data:{"city":$("#province option:checked").val()},
            success:function (city){
                $("#city").html("<option value=''>-- 请选择市 --<opton>");
                $("#district ").html( "<option value=''>-- 请选择区/县 --</option>");
                var p3 = JSON.parse(city)
                $.each(p3,function (i,e) {
                    $("#city").append("<option value='"+e.areaid+"'>"+e.areaname+"</option>");
                })
            }
        })
    }
    function getdistrict(){
        $.ajax({
            type:"POST",
            url:"xi",
            data: {"district":$("#city option:checked").val()},
                success:function (district) {
                    $("#district ").html( "<option value=''>-- 请选择区/县 --</option>");
                    var p3 = JSON.parse(district)
                    $.each(p3,function (i,e){
                        $("#district").append("<option>"+e.areaname+"</option>");
                    })
            }
        })
    }
</script>
<body>
省:<select id="province" name="province" onchange="getCity(this)">
    <option value=""></option>
</select>
<br>
市:<select id="city" name="city" onchange="getdistrict(this)">
    <option value="">-- 请选择市 --</option>
</select>
<br>
县:<select id="district" name="district" >
   <option value="">-- 请选择区/县 --</option>
</select>
</body>
</html>
