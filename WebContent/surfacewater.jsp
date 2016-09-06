<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("utf-8");
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="imagetoolbar" content="no">
<title>Insert title here</title>
<link href="css/stylenew.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.js" language="javascript" type="text/javascript"></script>
<script language="javascript" type="text/javascript" src="js/public.js"></script>
</head>
<body> 
<%
		if(session.getAttribute("username")==null)
			out.println("<script>alert('未登录，请登录！');top.location.href='index.jsp'</script>");
%>
<span id="lbresult"> 
<img src="images/4.png" width="726.1" height="487.07" usemap="#Map" border="0" />
  <map name="Map" id="Map">
  	<c:forEach items="${sessionScope.listPoint }" var="point">
		<area class="${point.pcss1 }" shape="circle" coords="${point.px },${point.py },2" href="javascript:void(-1)" />
	</c:forEach>
  </map>
  <c:forEach items="${sessionScope.listPoint }" var="point">
		<div class="${point.pcss2 }">
  		<img class="m2close" src="images/m2close.jpg" width="11" height="11" />
  		<div class="m2map_t">第${point.pno }点地表水位信息</div>
  		<div class="m2mapList">
  			<ul>
   			<li>
   			<div class="m2map_t2"><strong class="fl cor_blue">${point.pname }</div>
   			</li>
   			<li>
   			<div class="m2map_t2"><strong class="fl cor_blue">${point.year }年${point.month }月数据信息</div>		
			pH ${point.rph }<br/>
			氨氮 ${point.rnh }mg/L<br/>
			高锰酸盐指数${point.rkm }mg/L<br/>
			COD ${point.rcod }mg/L<br/>
			DO ${point.rdo }mg/L<br/>
			BOD5 ${point.rbod }mg/L<br/>
			水温 ${point.rwt }℃<br/>
			悬浮物 ${point.rxf }mg/L<br/>
			叶绿素a ${point.ryls }mg/m3<br/>
			TN ${point.rtn }mg/L<br/>
			TP ${point.rtp }mg/L<br/>	
   			</li>
 			</ul>
 		</div>
  		</div>
	</c:forEach>
	</span>


</body>
</html>