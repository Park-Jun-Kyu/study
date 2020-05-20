

<%@page import="study_200423.StudyDao"%>
<%@page import="study_200423.StudyDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    request.setCharacterEncoding("utf-8");
    String r_id = request.getParameter("r_id");
    String r_pw = request.getParameter("r_pw");
    
    StudyDao studa = StudyDao.getinstance();
    
    int check = studa.userCheck(r_id,r_pw);
    if(check == -1){
    
    %>
	<script>
	alert("아이디 없음 다시 입력하셈2");
	history.back();
	
	</script>
<%}else if(check ==0){ %>
   <script>
   alert("패스워드 없음 다시 입력하셈");
   history.back();

   </script>
	<%}else if(check == 1) {
   	StudyDto stud = studa.getmember(r_id);
   	
   	session.setAttribute("r_id", r_id);
   	session.setAttribute("r_pw", r_pw);
   	session.setAttribute("r_name", stud.getR_name());
   	session.setAttribute("authUser", r_id);
   	response.sendRedirect("main.jsp");
   
		
	}%>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>