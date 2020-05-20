<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">



</style>
</head>
<body>


	<table>
	
	<tr>
		<th>번호</th>
		<th>작성자</th>
		<th>제목</th>
		<th>날짜</th>
		<th>조회수</th>	
	</tr>
	<c:forEach var="dto" items="${list }">
	<tr>
		<td>${dto.pId }</td>
		<td>${dto.pName }</td>
		<td><a href="content_view.do?pId=${dto.pId }">${dto.pTitle }</a></td>
		<td>${dto.pDate }</td>
		<td>${dto.pHit }</td>
	
	</tr>
	
	</c:forEach>
	
	<div><a href="write_view.jsp">글쓰기</a></div>
	
	
	
	</table>






</body>
</html>