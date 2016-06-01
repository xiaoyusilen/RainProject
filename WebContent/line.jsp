<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>ECharts</title>
    <!-- 引入 echarts.js -->
    <script src="js/echarts-all.js"></script>
    <script src="js/jquery.js"></script>
</head>
<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom 基于准备好的dom，初始化echarts实例-->
    <div id="main" style="width: 3000px;height:500px;"></div>
     <script type="text/javascript">
    // 获取从Servlet中存入ajax的json数据
        $(document).ready(function(){
        	// 定义四个数组, arr用于存储json中的点位pno, 用于x轴, pnv、ppv、pcod用于存储三个值
        	arr=[];
        	pnv=[];
        	ppv=[];
        	pcod=[];
        	$.ajax({
                type : "post",  // Servlet中的方法为post方法
                async : false, //同步执行
                url : "GetLineServlet",  // Servlet路径
                data : {},
                dataType : "json", //返回数据形式为json
                success : function(result) {
                if (result) {
                       for(var i=0;i<result.length;i++){
                    	  // 将获取到的数据存入数组
                          arr.push(result[i].pno);
                          pnv.push(result[i].pnv);
                          ppv.push(result[i].ppv);
                          pcod.push(result[i].pcod);
                        }
                }
            },
            error : function(errorMsg) {
                alert("图表请求数据失败");
                myChart.hideLoading();
            }
        })
           drawChart();   //获取数据成功之后
}) 
        function drawChart()
{
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
                 data : arr
        	}],
    		yAxis: {
        		type: 'value'
    		},
    		series : [
              {
                  name:'总磷含量',
                  type:'line',
                  stack:'总量',
                  data:ppv
                  
              },
              {
                  name:'氨氮含量',
                  type:'line',
                  stack:'总量',
                  data:pnv
                  
              },
              {
                  name:'COD含量',
                  type:'line',
                  stack:'总量',
                  data:pcod
                  
              }
          ]};
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
}
    </script>
</body>
</html>