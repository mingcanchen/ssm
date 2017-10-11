<%--
  Created by IntelliJ IDEA.
  User: chenmingcan
  Date: 2017/10/9
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<!--dom结构部分-->
<div id="uploader-demo" align="center" style="height: 100px" class="wu-example">
    <%--<div id="filePicker" class="webuploader-container"></div>--%>
    <!--用来存放item-->
    <div id="fileList" class="uploader-list"></div>
    <div id="filePicker">选择图片</div>
</div>

</body>

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
<!--引入CSS-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/webuploader.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/bootstrap-3.3.7/css/bootstrap-theme.css">

<!--引入JS-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/webuploader.js"></script>
<%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap-3.3.7/js/bootstrap.js"></script>--%>

<script>
    $(function () {
        var thumbnailWidth = 100, thumbnailHeight = 100;
        var $list = $("#fileList");
        // 初始化Web Uploader
        var uploader = WebUploader.create({

            // 选完文件后，是否自动上传。
            auto: true,

            // swf文件路径
            swf: '${pageContext.request.contextPath}/js/Uploader.swf',

            // 文件接收服务端。
            server: 'file/upload',

            // 选择文件的按钮。可选。
            // 内部根据当前运行是创建，可能是input元素，也可能是flash.
            pick: '#filePicker',
            // 请求参数
            formData:{code:"2000",name1:"xiaoqiang"},

            //单个文件大小
            fileSingleSizeLimit:1024*1024*2,

            // 只允许选择图片文件。
            accept: {
                title: 'Images',
                extensions: 'gif,jpg,jpeg,bmp,png',
                mimeTypes: 'image/*'
            }
        });

        // 当有文件添加进来的时候
        uploader.on('fileQueued', function (file) {
            var $li = $(
                    '<div id="' + file.id + '" class="file-item thumbnail">' +
                    '<img>' +
                    '<div class="info">' + file.name + '</div>' +
                    '</div>'
                ),
                $img = $li.find('img');


            // $list为容器jQuery实例
            $list.append($li);

            // 创建缩略图
            // 如果为非图片文件，可以不用调用此方法。
            // thumbnailWidth x thumbnailHeight 为 100 x 100
            uploader.makeThumb(file, function (error, src) {
                if (error) {
                    $img.replaceWith('<span>不能预览</span>');
                    return;
                }

                $img.attr('src', src);
            }, thumbnailWidth, thumbnailHeight);

        });

        // 文件上传过程中创建进度条实时显示。
        uploader.on('uploadProgress', function (file, percentage) {
            var $li = $('#' + file.id),
                $percent = $li.find('.progress span');

            // 避免重复创建
            if (!$percent.length) {
                $percent = $('<p class="progress"><span></span></p>')
                    .appendTo($li)
                    .find('span');
            }

            $percent.css('width', percentage * 100 + '%');
        });


        // 文件上传成功，给item添加成功class, 用样式标记上传成功。
        uploader.on('uploadSuccess', function (file,data) {
            $('#' + file.id).addClass('upload-state-done');
            alert(data.code);
        });

        // 文件上传失败，显示上传出错。
        uploader.on('uploadError', function (file) {
            var $li = $('#' + file.id),
                $error = $li.find('div.error');

            // 避免重复创建
            if (!$error.length) {
                $error = $('<div class="error"></div>').appendTo($li);
            }

            $error.text('上传失败');
        });

        uploader.on( 'uploadAccept', function( file, response ) {
            if ( true ) {
                // 通过return false来告诉组件，此文件上传有错。
                return false;
            }
        });

        // 完成上传完了，成功或者失败，先删除进度条。
        uploader.on('uploadComplete', function (file) {
            $('#' + file.id).find('.progress').remove();
        });

    });
</script>
</html>
