<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	String type=(String)session.getAttribute("type");
	int size=(Integer)session.getAttribute("size");
	Double rate=size/110.0;
%>
<table width="280" align="center" action="query.jsp">
		<c:choose>
			<c:when test="${sessionScope.type=='ppv'}">
			<th colspan="4">
			本次查询超标率为<%out.print((double)((int)(rate*100))/100); %>
			</th><br>
			<tr>
			<th>点位</th>
			<th bgcolor="#e5f1f4">总磷含量</th>
			<th>氨氮含量</th>
			<th>COD含量</th>
			</tr>
			<c:forEach items="${sessionScope.listPosition }" var="position">
				<tr>
				<td><a href="GetColorPositionServlet?pno=${position.pno }&&year=${position.year}&&month=${position.month}" target="mainFrame">${position.pno }</a></td>
				<td bgcolor="#e5f1f4">${position.ppv }</td>
				<td>${position.pnv }</td>
				<td>${position.pcod }</td>
				</tr>
			</c:forEach>
			<tr>
				<input type="button" value="返回" onClick="window.location.href='query.jsp'">
			</tr>
			</c:when>
			<c:when test="${sessionScope.type=='pnv'}">
			<th colspan="4">
			本次查询超标率为<%out.print((double)((int)(rate*100))/100); %>
			</th><br>
			<tr>
			<th>点位</th>
			<th>总磷含量</th>
			<th bgcolor="#e5f1f4">氨氮含量</th>
			<th>COD含量</th>
			</tr>
			<c:forEach items="${sessionScope.listPosition }" var="position">
				<tr>
				<td><a href="GetColorPositionServlet?pno=${position.pno }&&year=${position.year}&&month=${position.month}" target="mainFrame">${position.pno }</a></td>
				<td>${position.ppv }</td>
				<td bgcolor="#e5f1f4">${position.pnv }</td>
				<td>${position.pcod }</td>
				</tr>
			</c:forEach>
			<tr>
				<input type="button" value="返回" onClick="window.location.href='query.jsp'">
			</tr>
			</c:when>
			<c:when test="${sessionScope.type=='pcod'}">
			<th colspan="4">
			本次查询超标率为<%out.print((double)((int)(rate*100))/100); %>
			</th><br>
			<tr>
			<th>点位</th>
			<th>总磷含量</th>
			<th>氨氮含量</th>
			<th bgcolor="#e5f1f4">COD含量</th>
			</tr>
			<c:forEach items="${sessionScope.listPosition }" var="position">
				<tr>
				<td><a href="GetColorPositionServlet?pno=${position.pno }&&year=${position.year}&&month=${position.month}" target="mainFrame">${position.pno }</a></td>
				<td>${position.ppv }</td>
				<td>${position.pnv }</td>
				<td bgcolor="#e5f1f4">${position.pcod }</td>
				</tr>
			</c:forEach>
			<tr>
				<input type="button" value="返回" onClick="window.location.href='query.jsp'">
			</tr>
			</c:when>
		</c:choose>
</table>
</body>
</html>