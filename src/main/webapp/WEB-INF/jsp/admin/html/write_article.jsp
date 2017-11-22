<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    pageContext.setAttribute("path", path);
    pageContext.setAttribute("basePath", basePath);
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <base href="${basePath}">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>新建博客</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/starter-template.css" rel="stylesheet">

    <link href="css/select2.min.css" rel="stylesheet">
    <link href="css/admintest.css" rel="stylesheet" >

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">admin</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">标签1</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<div class="container">
    <div id="left_row" class="list-group">
        <div class="row">
            <a href="#" id="img_st" class="list-group-item thumbnail">
                <img src="images/test.jpg" alt="touxiang">
            </a>
            <!-- id="addArt" 添加日志操作的id值-->
            <a class="list-group-item arti_op" href="javascript:void(0)" id="arti_op">日志操作</a>
            <ul class="list-unstyled menson" id="arti_op_ul">
                <li ><a class="list-group-item child_li" id="addArt" href="/catego">写日志</a></li>
                <li ><a class="list-group-item child_li" href="#">所有日志</a></li>
            </ul>
            <a class="list-group-item arti_op" href="javascript:void(0)" id="cate_op">日志操作</a>
            <ul class="list-unstyled menson">
                <li ><a class="list-group-item child_li" href="#">写博客</a></li>
                <li ><a class="list-group-item child_li" href="#">写博客</a></li>
                <li ><a class="list-group-item child_li" href="#">写博客</a></li>
                <li ><a class="list-group-item child_li" href="#">写博客</a></li>
            </ul>
            <a class="list-group-item arti_op" href="javascript:void(0)" id="rep_op">日志操作</a>
            <ul class="list-unstyled menson">
                <li ><a class="list-group-item child_li" href="#">写博客</a></li>
                <li ><a class="list-group-item child_li" href="#">写博客</a></li>
                <li ><a class="list-group-item child_li" href="#">写博客</a></li>
                <li ><a class="list-group-item child_li" href="#">写博客</a></li>
            </ul>
        </div>
    </div>
    <div id="right_row">
        <div class="jumbotron">
            <table border="0">
                <tr >
                    <td class="td_style"><label>日志标题：</label></td>
                    <td class="td_style"><input type="text" class="input_style" name="title"/></td>
                </tr>
                <tr>
                    <td class="td_style"><label>作者：</label></td>
                    <td class="td_style"><input type="text" class="input_style" name="author" value=""/></td>
                </tr>
                <tr>
                    <td class="td_style"><label>请选择文章分类：</label></td>
                    <td class="td_style">
                        <select id="sel_cat">
                            <c:forEach items="${cateList}" var="cl">
                                <option value="${cl.cate_id}">${cl.categories}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
            </table>
            <br/>
            <textarea id="editor_id" name="content" style="width:700px;height:300px;">
            </textarea>
        </div>
    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="js/ie10-viewport-bug-workaround.js"></script>
<script src="js/index.js"></script>
<script src="js/layer/layer.js"></script>
<script src="js/article/article.js"></script>
<script src="js/select2/select2.min.js"></script>
<script charset="UTF-8" src="js/kindeditor-all.js"></script>
<script>
    KindEditor.ready(function(K) {
        window.editor = K.create('#editor_id');
    });
    $(document).ready(function(){
        $("#sel_cat").select2();
    })
</script>
</body>
</html>

