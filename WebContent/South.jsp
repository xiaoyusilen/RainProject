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
<center><img src="images/South.png" border="0" usemap="#Map"></center>
<map name="Map">
	<area shape="polygon" coords="9,222,497,74,527,176,43,323" href="choose.jsp?t=s1" target="_self">
</map>
</body>
</html>