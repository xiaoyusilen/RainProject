jQuery(function(){
$(".map_btn").hover(function(){$(".m2mapCon").hide();var ctInx=$(".map_btn").index(this);$(".m2mapCon"+(ctInx+1)).show();},function(){});
$(".m2close").click(function(){$(".m2mapCon").fadeOut(200);});

})
//屏蔽页面错误
jQuery(window).error(function(){
  return true;
});
jQuery("img").error(function(){
  $(this).hide();
});