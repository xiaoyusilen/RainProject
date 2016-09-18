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
<center><img src="images/East.png" border="0" usemap="#Map"></center>
<map name="Map">
	<area shape="polygon" coords="89,224,146,183,223,230,304,266,371,309,430,370,488,316,494,321,426,378,367,319,296,273,221,238,151,200,104,235" href="choose.jsp?t=e1" target="_self">
	<area shape="polygon" coords="72,332,224,231,312,269,375,310,426,369,487,314,495,322,426,386,365,320,292,274,224,244,82,350" href="choose.jsp?t=e2" target="_self">
	<area shape="polygon" coords="121,396,295,263,372,308,430,371,488,315,498,325,430,386,372,326,301,279,133,408" href="choose.jsp?t=e3" target="_self">
	<area shape="polygon" coords="220,526,484,317,494,322,230,539" href="choose.jsp?t=e4" target="_self">
	<area shape="polygon" coords="133,72,190,24,513,300,490,328,478,317,492,300,191,48,143,85" href="choose.jsp?t=e5" target="_self">
	<area shape="polygon" coords="433,820,506,752,558,637,564,523,548,401,503,314,487,328,479,316,503,290,566,390,589,520,579,643,524,761,446,836" href="choose.jsp?t=e6" target="_self">
</map>
</body>
</html>