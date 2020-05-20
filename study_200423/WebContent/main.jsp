

<%@page import="study_200423.StudyDto"%>
<%@page import="study_200423.StudyDao"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<% if(session.getAttribute("authUser")==null){ %>
	<script type="text/javascript">
	alert("로그인을 하지 않았습니다.로그인하셈")
	location.href='login.jsp';
	</script>
	
	<% } 

	
	ArrayList list = new ArrayList(); 
	String id = (String) session.getAttribute("id"); 
	StudyDao studa = StudyDao.getinstance(); 
	list = studa.getMembers(); 
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>아이디</th>
		<th>패스워드</th>
		<th>이름</th>
	
	</tr>
	
	<%for(int i=0; i<list.size(); i++){ 
	
		StudyDto stud = (StudyDto)list.get(i);
	%>
	
	<tr>
		<td><%=stud.getR_pw() %></td>
		<td><%=stud.getR_name() %></td>
		<td><%=stud.getR_id() %></td>
	</tr>
	<%} %>
	
	</table>
	
</body>
</html>