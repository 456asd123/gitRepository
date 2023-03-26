<%--
  Created by IntelliJ IDEA.
  User: admi
  Date: 2023/3/26
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <script src="js/jquery.min.js" ></script>
    <script>
        var mvs = ["西施","貂蝉","王昭君","杨贵妃"];
        $(function(){
            $.each(mvs,function(){
                $('#mv').append("<option value='20'>"+this+"</option>");
            });

        });
        function as() {
            alert($("#mv option:checked").val())
        }
    </script>
</head>
<body>
<select id="mv" onchange="as()">
    <option value="1">四大美女</option>
</select>
</body>
</html>