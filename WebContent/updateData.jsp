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
<%
	String year = (String)session.getAttribute("year");
	String month = (String)session.getAttribute("month");
	String pno = (String)session.getAttribute("pno");
	session.setAttribute("year",year);
	session.setAttribute("month",month);
	session.setAttribute("pno",pno);
%>
<form action="UpdatePositionNextServlet" method="post">
	<table width="800" align="center">
			<th colspan="6">
			<%out.println(year); %>年<%out.println(month); %>月<%out.println(pno); %>点位数据信息
			</th><br>
			<tr>
			<th>点位</th>
			<th>总磷含量</th>
			<th>氨氮含量</th>
			<th>COD含量</th>
			<th>综合指数</th>
			<th>操作</th>
			</tr>
			<c:forEach items="${sessionScope.position }" var="position">
				<tr>
				<td>${position.pno }</td>
				<td><input type="text" name="ppv" value="${position.ppv }"></td>
				<td><input type="text" name="pnv" value="${position.pnv }"></td>
				<td><input type="text" name="pcod" value="${position.pcod }"></td>
				<td><input type="text" name="pcom" value="${position.pcom }"></td>
				<td><input type="submit" value="修改"></td>
				</tr>
			</c:forEach>
	</table> 
</form>
<form action="javascript:history.go(-1)" method="post" align="center">
   <input type="submit" value="返回"> <br>
</form>
</body>
</html>