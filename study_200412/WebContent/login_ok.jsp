<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<script type="text/javascript">
			
	
	
	</script>


<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	// db에서 id,pw가지고 와서 비교
	if(id.equals("admin") && pw.equals("1234")){
		//섹션추가
		session.setAttribute("auth_User", "id");
		session.setAttribute("nick_name", "라팡");
		response.sendRedirect("index.jsp");
	}else{ %>
	
	<script type="text/javascript">
		alert("아이디,패스워드가 잘못됨 다시 입력하셈")
		history.back(-1);
	</script>
		
<% 
// 	response.sendRedirect("login.html");
	}
%>






%>