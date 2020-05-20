<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="modify.do" method="post" name="modify">
<input type="hidden" name="pId" value="${modify_view.pId }">
글쓴이:<input type="text" name="pName" value="${modify_view.pName }"readonly><br>
글제목:<input type="text" name="pTitle" value="${modify_view.pTitle }"><br>
글내용:<textarea rows="50" cols="50" name = "pContent" >${modify_view.pContent }</textarea>


<input type="submit" value="작성">


</form>
</body>
</html>