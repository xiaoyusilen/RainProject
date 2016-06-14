<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
body,td,th {
}
	table.gridtable
	{
		font-family:verdana,arial,sans-serif;
		font-size:12px;
		color:#333333;
		border-width:1px;
		border-color:#666666;
		border-collapse:collapse;
	}
	table.gridtable th
	{
		border-width:1px;
		padding:8px;
		border-style:solid;
		border-color:#666666;
		background-color:#dedede;
	}
	table.gridtable td
	{
		border-width:1px;
		
		border-style:solid;
		border-color:#666666;
		background-color:#ffffff;
	}
	</style>
</head>
<body>
<table class="gridtable" width="280" align="center" action="query.jsp">
		<tr>
			<th>点位</th>
			<th>总磷含量</th>
			<th>氨氮含量</th>
			<th>COD含量</th>
		</tr>
		<c:forEach items="${sessionScope.listPosition }" var="position">
			<tr>
			<td>${position.pno }</td>
			<td>${position.ppv }</td>
			<td>${position.pnv }</td>
			<td>${position.pcod }</td>
			</tr>
		</c:forEach>
		<tr>
		<input type="button" value="返回" onClick="window.location.href='query.jsp'">
		</tr>
</table>
</script>
</body>
</html>