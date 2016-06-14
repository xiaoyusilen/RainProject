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
    <li><a href="#">2016年1月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="#">氨氮含量折线图</a></li>
            <li><a href="#">总磷含量折线图</a></li>
        </ul>
    </li>
    <li><a href="#">2016年2月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="#">氨氮含量折线图</a></li>
            <li><a href="#">总磷含量折线图</a></li>
        </ul>
    </li>
        <li><a href="#">2016年3月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="">氨氮含量折线图</a></li>
            <li><a href="">总磷含量折线图</a></li>
        </ul>
    </li>
        <li><a href="GetPositionServlet" target="mainFrame">2016年4月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="line.jsp" target="mainFrame">氨氮含量折线图</a></li>
            <li><a href="line.jsp" target="mainFrame">总磷含量折线图</a></li>
        </ul>
    </li>
        <li><a href="#">2016年5月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="#">氨氮含量折线图</a></li>
            <li><a href="#">总磷含量折线图</a></li>
        </ul>
    </li>
        <li><a href="#">2016年6月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="#">氨氮含量折线图</a></li>
            <li><a href="#">总磷含量折线图</a></li>
        </ul>
    </li>
        <li><a href="#">2016年7月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="#">氨氮含量折线图</a></li>
            <li><a href="#">总磷含量折线图</a></li>
        </ul>
    </li>
        <li><a href="#">2016年8月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="#">氨氮含量折线图</a></li>
            <li><a href="#">总磷含量折线图</a></li>
        </ul>
    </li>
        <li><a href="#">2016年9月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="#">氨氮含量折线图</a></li>
            <li><a href="#">总磷含量折线图</a></li>
        </ul>
    </li>
        <li><a href="#">2016年10月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="#">氨氮含量折线图</a></li>
            <li><a href="#">总磷含量折线图</a></li>
        </ul>
    </li>
        <li><a href="#">2016年11月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="#">氨氮含量折线图</a></li>
            <li><a href="#">总磷含量折线图</a></li>
        </ul>
    </li>
        <li><a href="#">2016年12月</a>
        <ul>
            <li><a href="#">COD折线图</a></li>
            <li><a href="#">氨氮含量折线图</a></li>
            <li><a href="#">总磷含量折线图</a></li>
        </ul>
    </li>
    <li><a href="image2.jsp" target="mainFrame">地表水及泵站监测点</a>
    </li>
    <li><a href="shuixi.jsp" target="mainFrame">分水系</a>
    </li>
</ul>

<script type="text/javascript">
$(document).ready(function() {
    $('.nav').navgoco();
});
</script>
</body>
</html>