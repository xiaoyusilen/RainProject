<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.rain.entity.Position"%>
<%@page import="com.rain.dao.impl.PositionDaoimpl"%>
<%@page import="com.rain.dao.PositionDao"%>
<%@page import="java.util.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/echarts-all.js"></script>
    <script src="js/jquery.js"></script>
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
    	var time = []; 
    	var type;
    	<%
    		ArrayList<Double> data = (ArrayList<Double>)session.getAttribute("data");
    		for(double x:data)
    		{
    			%>data.push('<%=x%>');<%
    		}
    	%>
    	<%
    		ArrayList<Double> time = (ArrayList<Double>)session.getAttribute("time");
    		for(double x:time)
    		{
    			%>time.push('<%=x%>');<%
    		}
    	%>
    	var type = '<%=session.getAttribute("type")%>';
    	var title = '<%=session.getAttribute("title")%>';
    	var t1,t2;
    	var x = 0;
    	for(var i=0;i<time.length;i++){
    		if(i==0)
    		{
    			t1=time[i];
    		}
    		if(i==time.length-1)
    		{
    			t2=time[i];
    		}
    	}
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
                 data : time
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