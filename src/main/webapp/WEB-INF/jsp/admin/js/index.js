$(function(){
    //跳转到添加日志的界面
    //是对日志操作子菜单的监听
        $(".arti_op").click(function () {
           var $ul = $(this).next("ul");
            $('div').find('.menson').slideUp();
            if($ul.is(':visible')){
                $(this).next(".menson").slideUp();
            }else{
                $(this).next(".menson").slideDown();
            }
        });
})