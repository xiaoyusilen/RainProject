<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>空港经济区排水管网水质数据管理系统 </title>
<link rel="stylesheet" href="css/bootstrap-combined.min.css" type="text/css" />
<style type="text/css">
.ss{
	margin:15% 30% 30% 35%;
}
.title{
	background-color:#333;
	font-size:34px;
	color:#fff;
	font-style:"微软雅黑";
	text-align:center;
	height:80px;
	length:100%;
}
</style>
</head>
<body>
	<div class="title">
	<br>
	空港经济区排水管网水质数据管理系统
	</div>
	<div class="ss">
	<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<form name="login" action="LoginServlet" method="post" class="form-horizontal">
				<div class="control-group">
					<label class="control-label" for="inputEmail">用户名</label>
					<div class="controls">
						<input id="username" name="username" type="text" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputPassword">密码</label>
					<div class="controls">
						<input id="password" name="password" type="password" />
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<button class="btn" type="submit">登陆</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	</div>
	</div>
</body>
</html>