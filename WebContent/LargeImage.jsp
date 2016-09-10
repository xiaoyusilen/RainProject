<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("utf-8");
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.rain.entity.Position"%>
<%@page import="java.util.*"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="imagetoolbar" content="no">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.js" language="javascript" type="text/javascript"></script>
<script language="javascript" type="text/javascript" src="js/public.js"></script>
<style type="text/css">
	.div1{ width: 728.2px; height: 499.4px;  float: left; position:absolute; z-index:4; }
	.div2{ width: 728.2px; height: 499.4px;  float: left;}
	.div3{ width: 728px; height: 499px; float: left; position:absolute; z-index:10;}
</style>
</head>
<body>
<%
		if(session.getAttribute("username")==null)
			out.println("<script>alert('未登录，请登录！');top.location.href='index.jsp'</script>");
%>
<div class="div3">
<span id="lbresult"> 
<img src="images/5.png" width="1324" height="908" usemap="#Map" border="0" />
  <map name="Map" id="Map">
  	<c:forEach items="${sessionScope.listPosition }" var="position">
		<area class="${position.pcss1 }" shape="circle" coords="${position.px },${position.py },2" href="javascript:void(-1)" />
	</c:forEach>
  </map>
  	<c:forEach items="${sessionScope.listPosition }" var="position">
		<div class="${position.pcss2 }">
  		<img class="m2close" src="images/m2close.jpg" width="11" height="11" />
  		<div class="m2map_t">第${position.pno }点的水位信息</div>
  		<div class="m2mapList">
  			<ul>
   			<li>
   			<div class="m2map_t2"><strong class="fl cor_blue">${position.pinfo }</div>
   			</li>
   			<li>
   			<div class="m2map_t2"><strong class="fl cor_blue">${position.year }年${position.month }月数据信息</div>		
			总磷含量 ${position.ppv } mg/L<br/>
   			氨氮含量 ${position.pnv } mg/L<br/>
   			COD含量 ${position.pcod } mg/L<br/>
   			综合污染指数  ${position.pcom }<br/>
   			</li>
   			<li>
   			<a href="GetLineServlet?pno=${position.pno }&&type=ppv" target="_self"><u>>>总磷含量折线图<<</u></a><br/>
   			<a href="GetLineServlet?pno=${position.pno }&&type=pnv" target="_self"><u>>>氨氮含量折线图<<</u></a><br/>
   			<a href="GetLineServlet?pno=${position.pno }&&type=pcod" target="_self"><u>>>COD含量折线图<<</u></a><br/>
   			</li>
 			</ul>
 		</div>
  		</div>
	</c:forEach>
	<br>
    <form action="javascript:history.go(-1)" method="post">
    	<input style="height:30px;width:100px;font-size:18px;" type="submit" value="缩小"> <br>
    </form>
	</span>
</div>
<div class="div2">
<img src="images/1.jpg" width="1324" height="908" border="0" />
</div>
</body>
</html>