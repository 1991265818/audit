$(function(){
    $('#dotime').css('display', 'none');
    $('#oId').css('display', 'none');
    $('#no').click(function () {
        cancleBtn();
    });
    $('#yes').click(function () {
        $('.zhezhao').css('display', 'none');
        $('#removeBi').fadeOut();
        document.getElementById("suggestion_sub").click();
    });
 });
    $('#cancel').click(function () {
        cancleBtn();
    })

function openYesOrNoDLG(){
    $('.zhezhao').css('display', 'block');
    $('#removeBi').fadeIn();
}
function myFunction(operationId,blid){
    document.getElementById("operationId").value = document.getElementById(operationId).value;
    document.getElementById("blid").value = blid.toString();
    document.getElementById("oId").value = operationId.toString();
    changeDLGContent("你确定要修改该事项吗？");
    openYesOrNoDLG();
}
function cancleBtn() {
    $('.zhezhao').css('display', 'none');
    $('#removeBi').fadeOut();
    var select_var = document.getElementById(document.getElementById("oId").value);
    if (select_var) {
        var options = select_var.options;
        if (options) {
            var len = options.length;
            for (var i = 0; i < len; i++) {
                if (options[i].value == 3) {
                    options[i].defaultSelected = true;
                    options[i].selected = true;
                    return true;
                }
            }
        }
    }
}
function changeDLGContent(contentStr){
    var p = $(".removeMain").find("p");
    p.html(contentStr);
}