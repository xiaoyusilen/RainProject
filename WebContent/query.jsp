<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="QueryServlet"  method="post">
			<br>
			年份：
			<select name="year">
				<option>--请选择年份--</option>
				<option value="2016">2016</option>
			</select>
	  		<br>
			<br>
			月份：
			<select name="month">
				<option>--请选择月份--</option>
				<option value="4">四月</option>
			</select>
			<br>
			<br>
			数据类型：
			<select name="type">
				<option>--请选择数据类型--</option>
				<option value="ppv">总磷含量</option>
				<option value="pnv">氨氮含量</option>
				<option value="pcod">COD含量</option>
			</select>
	  		<br>
			<br>
			计算方式：
			<select name="way">
				<option>--请选择方式--</option>
				<option value=">">></option>
				<option value="<"><</option>
				<option value="=">=</option>
			</select>
			<br>
			<br>
			范围：
			<input type="text" name="view"><br><br>
		<input type="submit" value="查询">&nbsp;
		<input type="reset" value="重置"><br>
		</form>
</body>
</html>