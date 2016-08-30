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
		if(session.getAttribute("username")==null)
			out.println("<script>alert('未登录，请登录！');top.location.href='index.jsp'</script>");
%>
<%
	String year = (String)session.getAttribute("year");
	String month = (String)session.getAttribute("month");
%>
<table width="700" align="center">
			<th colspan="13">
			<%out.println(year); %> 年<%out.println(month); %>月点位数据信息
			</th><br>
			<tr>
			<th>点位</th>
			<th>pH</th>
			<th>氨氮</th>
			<th>高锰酸盐指数</th>
			<th>COD</th>
			<th>DO</th>
			<th>BOD</th>
			<th>水温</th>
			<th>悬浮物</th>
			<th>叶绿素a</th>
			<th>TN</th>
			<th>TP</th>
			<th size="9">操作</th>
			</tr>
			<c:forEach items="${sessionScope.listChart }" var="point">
				<tr>
				<td>${point.pno }</td>
				<td>${point.rph }</td>
				<td>${point.rnh }</td>
				<td>${point.rkm }</td>
				<td>${point.rcod }</td>
				<td>${point.rdo }</td>
				<td>${point.rbod }</td>
				<td>${point.rwt }</td>
				<td>${point.rxf }</td>
				<td>${point.ryls }</td>
				<td>${point.rtn }</td>
				<td>${point.rtp }</td>
				<td><a href="QueryPointServlet?pno=${point.pno }&&year=<%=year%>&&month=<%=month%>">修改</a>&nbsp;<a href="DeletePointServlet?pno=${point.pno }&&year=<%=year%>&&month=<%=month%>">删除</a></td>
				</tr>
			</c:forEach>
</table>
</body>
</html>