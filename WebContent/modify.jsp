<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/tablecloth.css" type="text/css" media="screen" />
<script type="text/javascript" src="js/tablecloth.js"></script>
<title>Insert title here</title>
</head>
<body>
<%
		if(session.getAttribute("username")==null)
			out.println("<script>alert('未登录，请登录！');top.location.href='index.jsp'</script>");
%>
<form width="200" action="ModifyServlet" method="post" name="modify" onsubmit="return validate(this);">
	<table width="200" align="center">
			<th colspan="2">
			修改管理员密码
			</th><br>
			<tr>
			<td>原始密码</td>
			<td><input onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')" type="password" name="oldpass" size="8"></td>
			</tr>
			<tr>
			<td>新密码</td>
			<td><input onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')" type="password" name="pass" size="8"></td>
			</tr>
			<tr>
			<td>重新输入</td>
			<td><input onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')" type="password" name="newpass" size="8"></td>
			</tr>
			<th colspan="2">
			<input type="submit" value="修改">
			</th>
	</table> 
</form>
		<script type="text/javascript">
		function validate(modify) {
			if (modify.oldpass.value == "") {
				alert("对不起，原始密码不能为空！");
				return false;
			}
			if(modify.pass.value == ""){
				alert("对不起，新密码不能为空！");
				return false;
			}
			if(modify.oldpass.value == modify.pass.value){
				alert("对不起，新更改密码不可和旧密码相同！");
				return false;
			}
			if (modify.pass.value != modify.newpass.value) {
				alert("对不起，两次密码输入不一致！");
				return false;
			}
			return true;
		}
	</script>
</body>
</html>