<%@ page contentType="text/html;charset=UTF-8" language="java"
         trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>
</head>
<body>
    <form action="/board/save" method="post">
        <input type="text" name="boardWriter" placeholder="작성자" /><br><br>
        <input type="text" name="boardPass" placeholder="비밀번호" /><br><br>
        <input type="text" name="boardTitle" placeholder="제목" /><br><br>
        <textarea name="boardContents" cols="30" rows="10" placeholder="내용을입력하세요"></textarea><br><br>
        <input type="submit" value="작성">
    </form>
</body>
</html>
