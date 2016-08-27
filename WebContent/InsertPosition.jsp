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
<form width="300" action="InsertPositionServlet" method="post">
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
			<td><input type="text" name="pno"></td>
			<td><input type="text" name="ppv"></td>
			<td><input type="text" name="pnv"></td>
			<td><input type="text" name="pcod"></td>
			<td><input type="text" name="pcom"></td>
			<td><input type="text" name="year"></td>
			<td><input type="text" name="month"></td>
			<td><input type="submit" value="添加"></td>
			</tr>
	</table> 
</form>
</body>
</html>