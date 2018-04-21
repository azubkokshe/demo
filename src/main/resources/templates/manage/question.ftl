<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>后台管理-试题录入</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="js/manage/question.js"></script>
</head>
<body>
<div style="margin-top:20%;margin-left: 25%;">
    <form role="form">
        <div class="form-group">
            <label for="name">模块</label>
            <select id="moduleId" class="selectpicker" data-live-search="true" title="请选择模块">
                <option value="1">基础1</option>
                <option value="2">基础2</option>
                <option value="3">基础3</option>
            </select>
        </div>
        <div class="form-group">
            <label for="name">试题类型</label>
            <div class="btn-group" data-toggle="buttons">
                <label class="btn btn-warning">
                    <input type="radio" name="options" value="0"> 判断题
                </label>
                <label class="btn btn-warning">
                    <input type="radio" name="options" value="1"> 单选题
                </label>
                <label class="btn btn-warning">
                    <input type="radio" name="options" value="2"> 多选题
                </label>
            </div>
        </div>
        <div class="form-group">
            <label for="name">试题权限</label>
            <div class="btn-group" data-toggle="buttons">
                <label class="btn btn-warning">
                    <input type="radio" name="options" id="option1" value="1"> 试用
                </label>
                <label class="btn btn-warning">
                    <input type="radio" name="options" id="option2" value="2"> 非试用
                </label>
            </div>
        </div>
        <div class="form-group">
            <label for="name">试题等级</label>
            <div class="btn-group" data-toggle="buttons">
                <label class="btn btn-warning">
                    <input type="radio" name="options" id="option1" value="1"> 初级
                </label>
                <label class="btn btn-warning">
                    <input type="radio" name="options" id="option2" value="2"> 中级
                </label>
                <label class="btn btn-warning">
                    <input type="radio" name="options" id="option2" value="3"> 高级
                </label>
            </div>
        </div>
        <div class="form-group">
            <label for="name">题干</label>
            <textarea class="form-control" rows="3"></textarea>
        </div>
        <div class="form-group">
            <label for="name">试题选项</label>
            <textarea class="form-control" rows="3"></textarea>
        </div>
        <div class="form-group">
            <div class="btn-group btn-group-lg">
                <button type="button" class="btn btn-default">保存</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>