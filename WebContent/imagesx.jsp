<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/echarts-all.js"></script>
    <script src="js/jquery.js"></script>
<title>Insert title here</title>
</head>
<body>
<%
		if(session.getAttribute("username")==null)
			out.println("<script>alert('未登录，请登录！');top.location.href='index.jsp'</script>");
%>
<!-- 为ECharts准备一个具备大小（宽高）的Dom 基于准备好的dom，初始化echarts实例-->
    <div id="main" style="width: 700px;height:500px;"></div>
     <script type="text/javascript">
    	var data = [];
    	var position = []; 
    	var type;
    	<%
    		ArrayList<Double> data = (ArrayList<Double>)session.getAttribute("sxdata");
    		for(double x:data)
    		{
    			%>data.push('<%=x%>');<%
    		}
    	%>
    	<%
    		ArrayList<Integer> Position = (ArrayList<Integer>)session.getAttribute("Position");
    		for(int x:Position)
    		{
    			%>position.push('<%=x%>');<%
    		}
    	%>
    	var type = '<%=session.getAttribute("type")%>';
    	var title = '<%=session.getAttribute("title")%>';
        var myChart = echarts.init(document.getElementById('main'));
        // 指定图表的配置项和数据
     	option = {
     		title: {
        	 	text: title
     		},    // 图表名称
    		tooltip: {
        		trigger: 'axis'
    		},  
    		legend: {
        		data: [type]
    		}, // 图例名称
    		grid: {
        		left: '0%',
        		right: '0%',
        		bottom: '0%',
        		containLabel: true
    		}, // 样式
    		toolbox: {
        		feature: {
            		saveAsImage: {}
       	 		}
    		},
    		xAxis : [
             {
                 type : 'category',
                 boundaryGap: false,
                 data : position
        	}],
    		yAxis: {
        		type: 'value',
                axisLabel: {
                    formatter: '{value} mg/L'
                }
    		},
    		series : [
              {
                  name:type,
                  type:'line',
                  stack:'总量',
                  data:data
              },
          ]
        }
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
        <form action="javascript:history.go(-1)"  method="post">
    <input type="submit" value="返回"> <br>
    </form>
</body>
</html>