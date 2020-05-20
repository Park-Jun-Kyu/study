<%@ page language="java" contentType="text/html; 
charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="login_ok2.jsp" method="get" name="form">

<% 
String my_user2 = (String)session.getAttribute("Rapang1");
if(my_user2 == null){
%>

아이디<input type="text" name="id3"><br>
비번<input type="password" name="pw3"><br>
<input type="submit" name="button3" value="로그인">

<%}else{%>
<span>환영합니다<span> <%= session.getAttribute("nick_name") %></span></span>
<button id="button"><a href="logout_2.jsp">로그아웃</a></button>

</form>
<%} %>




</body>
</html>


