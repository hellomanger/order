$(function(){
    // nav收缩展开
    $('.nav-item>a').on('click',function(){
    	$('.nav>ul ul li').removeClass('show')
        if (!$('.nav').hasClass('nav-mini')) {
            if ($(this).next().css('display') == "none") {
                //展开未展开
                $('.nav-item').children('ul').slideUp(300);
                $(this).next('ul').slideDown(300);
                $(this).parent('li').addClass('nav-show').siblings('li').removeClass('nav-show');
                $(this).css('color','#3e86fa').parent().siblings().find('a').css('color','#FFF');
                console.log(111)
            }else{
                //收缩已展开
                $(this).next('ul').slideUp(300);
                $(this).css('color','#3e86fa').parent().siblings().find('a').css('color','#FFF');
                $('.nav-item.nav-show').removeClass('nav-show');
                console.log(222)
            }
        }
    });
    //nav-mini切换
    $('#mini').on('click',function(){
    	
        if (!$('.nav').hasClass('nav-mini')) {
            $('.nav-item.nav-show').removeClass('nav-show');
            $('.nav-item').children('ul').removeAttr('style');
            $('.nav').addClass('nav-mini');
        }else{
            $('.nav').removeClass('nav-mini');
        }
    });

    $('.nav>ul ul').on('click','li',function () {
        console.log(333)
        $('.nav-item a').css('color','#FFF');
        $(this).parents('.nav-item').find('a').eq(0).css('color','#3e86fa')
        $(this).addClass('show').siblings().removeClass('show').parent().parent().siblings().find('li').removeClass('show')
    })
//     $('.nav>ul').on('click','li',function () {
//         $(this).find('ul').find('li').removeClass('show')
//     })
});