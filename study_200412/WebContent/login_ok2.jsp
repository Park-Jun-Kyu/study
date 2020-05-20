<%@ page language="java" contentType="text/html; 
charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%

String id3=request.getParameter("id3");
String pw3=request.getParameter("pw3");

if(id3.equals("dailykq1") && pw3.equals("123123")){
	session.setAttribute("Rapang1","id3");
	session.setAttribute("nick_name","라팡2");
	response.sendRedirect("index2.jsp");
	
}else{%>

<script type="text/javascript">


alert("아이디 비번 틀렸슴 다시 입력하셈")
history.back(-1);


	
	
<%} %>
</script>




	





</body>
</html>