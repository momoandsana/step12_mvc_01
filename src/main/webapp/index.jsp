<%-- Created by IntelliJ IDEA. User: swift Date: 2024-10-01 Time: 오전 11:59 To change this template use File | Settings | File Templates. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Web MVC Refactoring TEST</h1>
<h3>
    <a href="${path}/front?key=select">검색하기</a>
    <a href="${path}/front?key=update">수정하기</a>
    <a href="${path}/front?key=delete">삭제하기</a>
    <a href="${path}/front?key=insert">등록하기</a>

    <a href="${pageContext.request.contextPath}/test">테스트하기</a>
</h3>
</body>
</html>
