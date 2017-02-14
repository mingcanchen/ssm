<%--
  Created by IntelliJ IDEA.
  User: chenmingcan
  Date: 2017/2/14
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"/>--%>

<script type="text/javascript">

    window.onload = function () {
        var lessThenIE8 = function () {
            var UA = navigator.userAgent,
                isIE = UA.indexOf('MSIE') > -1,
                v = isIE ? /\d+/.exec(UA.split(';')[1]) : 'no ie';
            return v <= 8;
        }();

        if (lessThenIE8) {
            var ieAddr = 'https://support.microsoft.com/zh-cn/help/17621/internet-explorer-downloads';
            var res = confirm("IE浏览器版本过低,请升级至少IE9版本!");
            if (res == true) {
                window.open(ieAddr);
            }
        }
    }

</script>
<html>
<head>
    <title>Title</title>
    IE浏览器测试
</head>
<body>

</body>
</html>
