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
<form width="300" action="InsertPositionServlet" method="post" name="addpoint" onsubmit="return validate(this);">
	<table width="300" align="center">
			<th colspan="8">
			增加点位信息
			</th><br>
			<tr>
			<th>点位</th>
			<th>总磷含量</th>
			<th>氨氮含量</th>
			<th>COD含量</th>
			<th>综合指数</th>
			<th>年份</th>
			<th>月份</th>
			<th>操作</th>
			</tr>
			<tr>
			<td><input onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')" type="text" name="pno" size="6"></td>
			<td><input onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')" type="text" name="ppv" size="6"></td>
			<td><input onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')" type="text" name="pnv" size="6"></td>
			<td><input onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')" type="text" name="pcod" size="6"></td>
			<td><input onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')" type="text" name="pcom" size="6"></td>
			<td><input onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')" type="text" name="year" size="6"></td>
			<td><input onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')" type="text" name="month" size="6"></td>
			<td><input onkeyup="value=value.replace(/[^\d{1,}\.\d{1,}|\d{1,}]/g,'')" type="submit" value="添加"></td>
			</tr>
	</table> 
</form>
		<script type="text/javascript">
		function validate(addpoint) {
			if (addpoint.pno.value == "") {
				alert("对不起，点位不能为空！");
				return false;
			}
			if (addpoint.ppv.value == "") {
				alert("对不起，总磷含量不能为空！");
				return false;
			}
			if (addpoint.pnv.value == "") {
				alert("对不起，氨氮含量不能为空！");
				return false;
			}
			if (addpoint.pcod.value == "") {
				alert("对不起，COD含量不能为空！");
				return false;
			}
			if (addpoint.pcom.value == "") {
				alert("对不起，综合指数	不能为空！");
				return false;
			}
			if (addpoint.year.value == "") {
				alert("对不起，年份不能为空！");
				return false;
			}
			if (addpoint.month.value == "") {
				alert("对不起，月份不能为空！");
				return false;
			}
			return true;
		}
	</script>
</body>
</html>