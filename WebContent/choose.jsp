<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String t=request.getParameter("t");
%>
<script language="javascript">
	var success='<%=session.getAttribute("success")%>';
	if(success=="1")
	{
		alert("No Data!");
		<%session.removeAttribute("success");%>
	}
</script>
<form style="float:left" action="GetSXServlet?t=<%=t %>"  method="post">
	<br>
	年份：
	<select name="year">
		<option value="2016">2016</option>
		<option value="2017">2017</option>
		<option value="2018">2018</option>
	</select>
	&nbsp;&nbsp;
	月份：
	<select name="month">
		<option value="1">一月</option>
		<option value="2">二月</option>
		<option value="3">三月</option>
		<option value="4">四月</option>
		<option value="5">五月</option>
		<option value="6">六月</option>
		<option value="7">七月</option>
		<option value="8">八月</option>
		<option value="9">九月</option>
		<option value="10">十月</option>
		<option value="11">十一月</option>
		<option value="12">十二月</option>
	</select>
	&nbsp;&nbsp;
	折线图类型：
	<select name="type">
		<option value="ppv">总磷含量</option>
		<option value="pnv">氨氮含量</option>
		<option value="pcod">COD含量</option>
	</select>
	&nbsp;&nbsp;
	<input type="submit" value="查询">&nbsp;
</form>&nbsp;&nbsp;
<form action="javascript:history.go(-1)" method="post">
	&nbsp;&nbsp;
   <input type="submit" value="返回"> <br>
</form>
</body>
</html>