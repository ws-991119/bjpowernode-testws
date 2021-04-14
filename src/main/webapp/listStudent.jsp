<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/10
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function (){
            loadStudentData();
            $("#btnLoader").click(function (){
                loadStudentData();
            })
        })
        function loadStudentData(){
            $.ajax({
                url:"queryStudent.do",
                type:"get",
                dataType:"json",
                success:function (res){
                    $("#info").empty();
                    $.each(res,function (x,y){
                        $("#info").append("<tr><td>"+y.id+"</td><td>"+y.name+"</td><td>"+y.age+"</td></tr>")
                    })
                }
            })
        }
    </script>
</head>
<body>
    <div align="center">
        <table border="1">
            <thead>
            <tr>
                <td>学号</td>
                <td>姓名</td>
                <td>年龄</td>
            </tr>
            </thead>
            <tbody id="info">

            </tbody>
        </table>
        <input type="button" id="btnLoader" value="查询数据">
    </div>

</body>
</html>
