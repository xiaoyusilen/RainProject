<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
    <head>  
    <script type="text/javascript">
    $(document).ready(function(){
    	$.ajax({
            type : "get",  // Servlet中的方法为post方法
            async : false, //同步执行
            url : "GetLineServlet",  // Servlet路径
            data : {},
            dataType : "json", //返回数据形式为json
            success : function(result) {
            	alert("成功");
            },
            error : function(errorMsg) {
                alert("图表请求数据失败");
            }
        })
        });
    </script>
    </head>  
<body>
 <div>  
          
        <input type="button" onclick="kk()" value="点击" />  
</body>
</html>