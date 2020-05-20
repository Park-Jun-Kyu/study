<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action="write.do">

글쓴이:<input type="text" name="pName"><br>
글제목:<input type="text" name="pTitle"><br>
글내용:<textarea rows="50" cols="50" name = "pContent"></textarea>


<input type="submit" value="작성">

</form>




</body>
</html>