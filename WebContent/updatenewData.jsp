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
	String year = (String)session.getAttribute("year");
	String month = (String)session.getAttribute("month");
	String pno = (String)session.getAttribute("pno");
	session.setAttribute("year",year);
	session.setAttribute("month",month);
	session.setAttribute("pno",pno);
%>
<form action="UpdatePointServlet" method="post" align="center">
	<table width="1000" align="center">
			<th colspan="13">
			<%out.println(year); %>年<%out.println(month); %>月<%out.println(pno); %>点位数据信息
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
			<c:forEach items="${sessionScope.point }" var="point">
				<tr>
				<td>${point.pno }</td>
				<td><input type="text" name="rph" value="${point.rph }"  size="3"></td>
				<td><input type="text" name="rnh" value="${point.rnh }"  size="6"></td>
				<td><input type="text" name="rkm" value="${point.rkm }" size="10"></td>
				<td><input type="text" name="rcod" value="${point.rcod }" size="6"></td>
				<td><input type="text" name="rdo" value="${point.rdo }" size="6"></td>
				<td><input type="text" name="rbod" value="${point.rbod }" size="6"></td>
				<td><input type="text" name="rwt" value="${point.rwt }" size="6"></td>
				<td><input type="text" name="rxf" value="${point.rxf }" size="6"></td>
				<td><input type="text" name="ryls" value="${point.ryls }" size="6"></td>
				<td><input type="text" name="rtn" value="${point.rtn }" size="6"></td>
				<td><input type="text" name="rtp" value="${point.rtp }" size="6"></td>
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