<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<form action="list.do">

	<label>������ : ${content_view.pId }</label><br>
	<label>�۾��� : ${content_view.pName }</label><br>
	<label>������ : ${content_view.pTitle }</label><br>
	<textarea rows="30" cols="50">${content_view.pContent }</textarea>
	
<input type="submit" value="�ۼ�">
<a href="modify_view.do?pId=${content_view.pId }"><div>����</div></a>

	</form>
	
</body>
</html>