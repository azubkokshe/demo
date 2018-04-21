<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>后台管理-登录</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/manage/index.js"></script>
</head>
<body>
<div style="margin-top:20%;margin-left: 25%;">
    <div>
        <label for="username" class="col-sm-2 control-label">用户名</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="username"
                   placeholder="请输入用户名或手机号" style="width:300px;">
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="password"
                   placeholder="密码" style="width:300px;">
        </div>
    </div>
    <div>
        <div class="col-sm-offset-2 col-sm-10">
            <button onclick="login()">登录</button>
        </div>
    </div>
</div>
</body>
</html>