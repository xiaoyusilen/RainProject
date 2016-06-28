<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Load JQuery -->
    <script type="text/javascript" src="js/jquery-latest.min.js"></script>
    <!-- Load jquery.cookie plugin (optional) -->
    <script type="text/javascript" src="js/jquery.cookie.js"></script>
    <!-- Load jquery.navgoco plugin js and css files -->
    <script type="text/javascript" src="js/jquery.navgoco.js"></script>
    <link rel="stylesheet" href="css/jquery.navgoco.css" type="text/css" media="screen" />
</head>
<body>
<ul class="nav">
    <li><a href="#">雨水系统</a>
        <ul>
            <li>
            <a href="#">2016年</a>
            <ul>
            	<li><a href="GetPositionServlet?year=2016&&month=1" target="mainFrame">一月</a>
            	<li><a href="GetPositionServlet?year=2016&&month=2" target="mainFrame">二月</a>
            	<li><a href="GetPositionServlet?year=2016&&month=3" target="mainFrame">三月</a>
            	<li><a href="GetPositionServlet?year=2016&&month=4" target="mainFrame">四月</a>
            	<li><a href="GetPositionServlet?year=2016&&month=5" target="mainFrame">五月</a>
            	<li><a href="GetPositionServlet?year=2016&&month=6" target="mainFrame">六月</a>
            	<li><a href="GetPositionServlet?year=2016&&month=7" target="mainFrame">七月</a>
            	<li><a href="GetPositionServlet?year=2016&&month=8" target="mainFrame">八月</a>
            	<li><a href="GetPositionServlet?year=2016&&month=9" target="mainFrame">九月</a>
            	<li><a href="GetPositionServlet?year=2016&&month=10" target="mainFrame">十月</a>
            	<li><a href="GetPositionServlet?year=2016&&month=11" target="mainFrame">十一月</a>
            	<li><a href="GetPositionServlet?year=2016&&month=12" target="mainFrame">十二月</a>
            </ul>
            </li>
            <li>
            <a href="#">2017年</a>
            <ul>
            	<li><a href="GetPositionServlet?year=2017&&month=1" target="mainFrame">一月</a>
            	<li><a href="GetPositionServlet?year=2017&&month=2" target="mainFrame">二月</a>
            	<li><a href="GetPositionServlet?year=2017&&month=3" target="mainFrame">三月</a>
            	<li><a href="GetPositionServlet?year=2017&&month=4" target="mainFrame">四月</a>
            	<li><a href="GetPositionServlet?year=2017&&month=5" target="mainFrame">五月</a>
            	<li><a href="GetPositionServlet?year=2017&&month=6" target="mainFrame">六月</a>
            	<li><a href="GetPositionServlet?year=2017&&month=7" target="mainFrame">七月</a>
            	<li><a href="GetPositionServlet?year=2017&&month=8" target="mainFrame">八月</a>
            	<li><a href="GetPositionServlet?year=2017&&month=9" target="mainFrame">九月</a>
            	<li><a href="GetPositionServlet?year=2017&&month=10" target="mainFrame">十月</a>
            	<li><a href="GetPositionServlet?year=2017&&month=11" target="mainFrame">十一月</a>
            	<li><a href="GetPositionServlet?year=2017&&month=12" target="mainFrame">十二月</a>
            </ul>
            </li>
            <li>
            <a href="#">2018年</a>
            <ul>
            	<li><a href="GetPositionServlet?year=2018&&month=1" target="mainFrame">一月</a>
            	<li><a href="GetPositionServlet?year=2018&&month=2" target="mainFrame">二月</a>
            	<li><a href="GetPositionServlet?year=2018&&month=3" target="mainFrame">三月</a>
            	<li><a href="GetPositionServlet?year=2018&&month=4" target="mainFrame">四月</a>
            	<li><a href="GetPositionServlet?year=2018&&month=5" target="mainFrame">五月</a>
            	<li><a href="GetPositionServlet?year=2018&&month=6" target="mainFrame">六月</a>
            	<li><a href="GetPositionServlet?year=2018&&month=7" target="mainFrame">七月</a>
            	<li><a href="GetPositionServlet?year=2018&&month=8" target="mainFrame">八月</a>
            	<li><a href="GetPositionServlet?year=2018&&month=9" target="mainFrame">九月</a>
            	<li><a href="GetPositionServlet?year=2018&&month=10" target="mainFrame">十月</a>
            	<li><a href="GetPositionServlet?year=2018&&month=11" target="mainFrame">十一月</a>
            	<li><a href="GetPositionServlet?year=2018&&month=12" target="mainFrame">十二月</a>
            </ul>
            </li>
        </ul>
    </li>
        <li><a href="#">地表水及泵站系统</a>
        <ul>
            <li>
            <a href="#">2016年</a>
            <ul>
            	<li><a href="GetPointServlet?year=2016&&month=1" target="mainFrame">一月</a>
            	<li><a href="GetPointServlet?year=2016&&month=2" target="mainFrame">二月</a>
            	<li><a href="GetPointServlet?year=2016&&month=3" target="mainFrame">三月</a>
            	<li><a href="GetPointServlet?year=2016&&month=4" target="mainFrame">四月</a>
            	<li><a href="GetPointServlet?year=2016&&month=5" target="mainFrame">五月</a>
            	<li><a href="GetPointServlet?year=2016&&month=6" target="mainFrame">六月</a>
            	<li><a href="GetPointServlet?year=2016&&month=7" target="mainFrame">七月</a>
            	<li><a href="GetPointServlet?year=2016&&month=8" target="mainFrame">八月</a>
            	<li><a href="GetPointServlet?year=2016&&month=9" target="mainFrame">九月</a>
            	<li><a href="GetPointServlet?year=2016&&month=10" target="mainFrame">十月</a>
            	<li><a href="GetPointServlet?year=2016&&month=11" target="mainFrame">十一月</a>
            	<li><a href="GetPointServlet?year=2016&&month=12" target="mainFrame">十二月</a>
            </ul>
            </li>
            <li>
            <a href="#">2017年</a>
            <ul>
            	<li><a href="GetPointServlet?year=2017&&month=1" target="mainFrame">一月</a>
            	<li><a href="GetPointServlet?year=2017&&month=2" target="mainFrame">二月</a>
            	<li><a href="GetPointServlet?year=2017&&month=3" target="mainFrame">三月</a>
            	<li><a href="GetPointServlet?year=2017&&month=4" target="mainFrame">四月</a>
            	<li><a href="GetPointServlet?year=2017&&month=5" target="mainFrame">五月</a>
            	<li><a href="GetPointServlet?year=2017&&month=6" target="mainFrame">六月</a>
            	<li><a href="GetPointServlet?year=2017&&month=7" target="mainFrame">七月</a>
            	<li><a href="GetPointServlet?year=2017&&month=8" target="mainFrame">八月</a>
            	<li><a href="GetPointServlet?year=2017&&month=9" target="mainFrame">九月</a>
            	<li><a href="GetPointServlet?year=2017&&month=10" target="mainFrame">十月</a>
            	<li><a href="GetPointServlet?year=2017&&month=11" target="mainFrame">十一月</a>
            	<li><a href="GetPointServlet?year=2017&&month=12" target="mainFrame">十二月</a>
            </ul>
            </li>
            <li>
            <a href="#">2018年</a>
            <ul>
            	<li><a href="GetPointServlet?year=2018&&month=1" target="mainFrame">一月</a>
            	<li><a href="GetPointServlet?year=2018&&month=2" target="mainFrame">二月</a>
            	<li><a href="GetPointServlet?year=2018&&month=3" target="mainFrame">三月</a>
            	<li><a href="GetPointServlet?year=2018&&month=4" target="mainFrame">四月</a>
            	<li><a href="GetPointServlet?year=2018&&month=5" target="mainFrame">五月</a>
            	<li><a href="GetPointServlet?year=2018&&month=6" target="mainFrame">六月</a>
            	<li><a href="GetPointServlet?year=2018&&month=7" target="mainFrame">七月</a>
            	<li><a href="GetPointServlet?year=2018&&month=8" target="mainFrame">八月</a>
            	<li><a href="GetPointServlet?year=2018&&month=9" target="mainFrame">九月</a>
            	<li><a href="GetPointServlet?year=2018&&month=10" target="mainFrame">十月</a>
            	<li><a href="GetPointServlet?year=2018&&month=11" target="mainFrame">十一月</a>
            	<li><a href="GetPointServlet?year=2018&&month=12" target="mainFrame">十二月</a>
            </ul>
            </li>
        </ul>
    </li>

<script type="text/javascript">
$(document).ready(function() {
    $('.nav').navgoco();
});
</script>
</body>
</html>