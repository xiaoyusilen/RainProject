<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/echarts-all.js"></script>
    <script src="js/jquery.js"></script>
</head>
<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom 基于准备好的dom，初始化echarts实例-->
    <div id="main" style="width: 500px;height:500px;"></div>
     <script type="text/javascript">
    // 获取从Servlet中存入ajax的json数据
        $(document).ready(function(){
        var myChart = echarts.init(document.getElementById('main'));
        // 指定图表的配置项和数据
     	option = {
     		title: {
        	 	text: '水位分析图'
     		},    // 图表名称
    		tooltip: {
        		trigger: 'axis'
    		},  
    		legend: {
        		data:['总磷含量','氨氮含量','COD含量']
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
                 data : ['1','2','3','4','5']
        	}],
    		yAxis: {
        		type: 'value'
    		},
    		series : [
              {
                  name:'总磷含量',
                  type:'line',
                  stack:'总量',
                  data:['0.1','0.4','0.7','0.2','1.1']
                  
              },
              {
                  name:'氨氮含量',
                  type:'line',
                  stack:'总量',
                  data:['4.1','2.3','3.3','1.1','2.5']
                  
              },
              {
                  name:'COD含量',
                  type:'line',
                  stack:'总量',
                  data:['2.3','4.3','2.3','1.1','2.3']
                  
              }
          ]};
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        })
    </script>
</body>
</html>