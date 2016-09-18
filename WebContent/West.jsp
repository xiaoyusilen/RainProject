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
		if(session.getAttribute("username")==null)
			out.println("<script>alert('未登录，请登录！');top.location.href='index.jsp'</script>");
%>
<center><img src="images/West.png" border="0" usemap="#Map"></center>
<map name="Map">
	<area shape="polygon" coords="614,602,516,612,390,576,300,511,251,439,261,429,313,499,399,560,512,593,612,585" href="choose.jsp?t=w1" target="_self">
	<area shape="polygon" coords="609,520,526,537,427,514,360,473,308,418,259,447,248,438,306,407,378,473,433,504,520,521,604,506" href="choose.jsp?t=w2" target="_self">
	<area shape="polygon" coords="404,271,272,338,305,405,249,434,255,449,324,413,287,350,413,286" href="choose.jsp?t=w3" target="_self">
	<area shape="polygon" coords="558,341,366,448,320,405,248,436,258,450,314,418,370,464,572,357" href="choose.jsp?t=w5" target="_self">
	<area shape="polygon" coords="532,438,437,493,325,403,249,435,253,446,319,422,432,511,542,454" href="choose.jsp?t=w7" target="_self">
</map>
</body>
</html>