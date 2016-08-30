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
<center><img src="images/North.png" border="0" usemap="#Map"></center>
<map name="Map">
  <area shape="rect" coords="0,55,542,102" href="choose.jsp?t=n1" target="_self">
  <area shape="polygon" coords="93,256,493,83,510,122,111,297" href="choose.jsp?t=n2" target="_self">
  <area shape="polygon" coords="221,273,230,297,248,297,531,185,519,154" href="choose.jsp?t=n3" target="_self">
</map>
</body>
</html>