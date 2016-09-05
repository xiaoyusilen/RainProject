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
<!-- <script language="javascript">
	var success='<%=session.getAttribute("success")%>';
	if(success=="1")
	{
		alert("No Data!");
		<%session.removeAttribute("success");%>
	}
</script> -->
<table width="400" align="center">
			<th colspan="6">
			<%out.println(year); %>年<%out.println(month); %>月点位数据信息
			</th><br>
			<tr>
			<th>点位</th>
			<th>总磷含量</th>
			<th>氨氮含量</th>
			<th>COD含量</th>
			<th>综合指数</th>
			<th>操作</th>
			</tr>
			<c:forEach items="${sessionScope.listChart }" var="position">
				<tr>
				<td>${position.pno }</td>
				<td>${position.ppv }</td>
				<td>${position.pnv }</td>
				<td>${position.pcod }</td>
				<td>${position.pcom }</td>
				<td><a href="UpdatePositionServlet?pno=${position.pno }&&month=<%=month%>&&year=<%=year%>">修改</a>&nbsp;<a href="DeletePositionServlet?pno=${position.pno }&&month=<%=month%>&&year=<%=year%>">删除</a></td>
				</tr>
			</c:forEach>
</table>
</body>
</html>