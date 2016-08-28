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
<form name="addpoint" width="300" action="InsertPointServlet" method="post" onsubmit="return validate(this);">
	<table width="300px" align="center">
			<th width=300 colspan="15">
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
			<td><input type="text" name="pno" size="6"></td>
			<td><input type="text" name="rph" size="6"></td>
			<td><input type="text" name="rnh" size="6"></td>
			<td><input type="text" name="rkm" size="10"></td>
			<td><input type="text" name="rcod" size="6"></td>
			<td><input type="text" name="rdo" size="6"></td>
			<td><input type="text" name="rbod" size="6"></td>
			<td><input type="text" name="rwt" size="6"></td>
			<td><input type="text" name="rxf" size="6"></td>
			<td><input type="text" name="ryls" size="6"></td>
			<td><input type="text" name="rtn" size="6"></td>
			<td><input type="text" name="rtp" size="6"></td>
			<td><input type="text" name="year" size="6"></td>
			<td><input type="text" name="month" size="6"></td>
			<td><input type="submit" value="添加"></td>
			</tr>
	</table> 
</form>
		<script type="text/javascript">
		function validate(addpoint) {
			if (addpoint.pno.value == "") {
				alert("对不起，点位不能为空！");
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