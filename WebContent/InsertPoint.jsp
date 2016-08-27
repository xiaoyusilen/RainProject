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
<form width="300" action="InsertPointServlet" method="post">
	<table width="300px" align="center">
			<th width=300 colspan="14">
			增加点位信息
			</th><br>
			<tr>
			<th width=90>点位</th>
			<th width=90>pH</th>
			<th width=90>氨氮</th>
			<th width=90>高锰酸盐指数</th>
			<th width=90>COD</th>
			<th width=90>DO</th>
			<th width=90>BOD5</th>
			<th width=90>水温</th>
			<th width=90>悬浮物</th>
			<th width=90>叶绿素a</th>
			<th width=90>TN</th>
			<th width=90>TP</th>
			<th width=90>年份</th>
			<th width=90>月份</th>
			<th width=90>操作</th>
			</tr>
			<tr>
			<td width=90><input type="text" name="pno"></td>
			<td width=90><input type="text" name="rph"></td>
			<td width=90><input type="text" name="rnh"></td>
			<td width=90><input type="text" name="rkm"></td>
			<td width=90><input type="text" name="rcod"></td>
			<td width=90><input type="text" name="rdo"></td>
			<td width=90><input type="text" name="rbod"></td>
			<td width=90><input type="text" name="rwt"></td>
			<td width=90><input type="text" name="rxf"></td>
			<td width=90><input type="text" name="ryls"></td>
			<td width=90><input type="text" name="rtn"></td>
			<td width=90><input type="text" name="rtp"></td>
			<td width=90><input type="text" name="year"></td>
			<td width=90><input type="text" name="month"></td>
			<td><input type="submit" value="添加"></td>
			</tr>
	</table> 
</form>
</body>
</html>