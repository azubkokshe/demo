// 初始化 app
var myApp = new Framework7();

// 为便于使用，自定义DOM库名字为$$
var $$ = Dom7;

// 添加视图
var mainView = myApp.addView('.view-main', {
    // 让这个视图支持动态导航栏
    dynamicNavbar: true
});

myApp.onPageInit('view_detail', function (page) {
    $$('.back').html("返回");
});

$$('.next-question').on('click', function () {
    mainView.router.loadContent(
        '<div class="pages navbar-through toolbar-through">' +
        '  <!-- Page, data-page contains page name-->' +
        '  <div class="page">' +
        '    <!-- Scrollable page content-->' +
        '    <div class="page-content">' +
        '        <div class="paper-title">' +
        '            2、教育技术应用到教育和教学领域，使教育的观念、内容、方法、手段和管理都发生了深刻变化，引起了人类思维方式和学习方式的变革。请指出下列选项中哪些是应用教育技术带来的教学方式和方法发生的变化？' +
        '        </div>' +
        '        <div class="list-block">' +
        '            <ul>' +
        '                <li>' +
        '                    <label class="label-checkbox item-content">' +
        '                        <input type="checkbox" name="my-checkbox" value="A">' +
        '                        <div class="item-media">' +
        '                            <i class="icon icon-form-checkbox"></i>' +
        '                        </div>' +
        '                        <div class="item-inner">' +
        '                            <div class="item-title" style="white-space:normal;">' +
        '                                A. 教师是教学过程的设计者、指导者； 教学媒体是学生学习的认知工具；以学生为主体' +
        '                            </div>' +
        '                        </div>' +
        '                    </label>' +
        '                </li>' +
        '                <li>' +
        '                    <label class="label-checkbox item-content">' +
        '                        <input type="checkbox" name="my-checkbox" value="A">' +
        '                        <div class="item-media">' +
        '                            <i class="icon icon-form-checkbox"></i>' +
        '                        </div>' +
        '                        <div class="item-inner">' +
        '                            <div class="item-title" style="white-space:normal;">' +
        '                                A. 教师是教学过程的设计者、指导者； 教学媒体是学生学习的认知工具；以学生为主体' +
        '                            </div>' +
        '                        </div>' +
        '                    </label>' +
        '                </li>' +
        '                <li>' +
        '                    <label class="label-checkbox item-content">' +
        '                        <input type="checkbox" name="my-checkbox" value="A">' +
        '                        <div class="item-media">' +
        '                            <i class="icon icon-form-checkbox"></i>' +
        '                        </div>' +
        '                        <div class="item-inner">' +
        '                            <div class="item-title" style="white-space:normal;">' +
        '                                A. 教师是教学过程的设计者、指导者； 教学媒体是学生学习的认知工具；以学生为主体' +
        '                            </div>' +
        '                        </div>' +
        '                    </label>' +
        '                </li>' +
        '                <li>' +
        '                    <label class="label-checkbox item-content">' +
        '                        <input type="checkbox" name="my-checkbox" value="A">' +
        '                        <div class="item-media">' +
        '                            <i class="icon icon-form-checkbox"></i>' +
        '                        </div>' +
        '                        <div class="item-inner">' +
        '                            <div class="item-title" style="white-space:normal;">' +
        '                                A. 教师是教学过程的设计者、指导者； 教学媒体是学生学习的认知工具；以学生为主体' +
        '                            </div>' +
        '                        </div>' +
        '                    </label>' +
        '                </li>' +
        '          </ul>' +
        '      </div>' +
        '      <div>' +
        '          <a class="back" style="float:left;font-size:1.2rem;margin-left:10px;">上一题</a>' +
        '          <a class="next-question">下一题</a>' +
        '          <a href="view_detail.html" class="view-detail">查看解析</a>' +
        '      </div>' +
        '    </div>' +
        '  </div>' +
        '</div>')
});
// $$.ajax({
//     url:'http://localhost/get',
//     dataType:'json',
//     success:function (result) {
//         myApp.alert(result.content);
//     }
// });