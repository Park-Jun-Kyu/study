<%@page import="study_0421.MemberDto3"%>
<%@page import="study_0421.MemberDao3"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    request.setCharacterEncoding("utf-8");
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    
    MemberDao3 mdao2 = MemberDao3.getInstance();
    int check = mdao2.userCheck(id,pw);
    if(check == -1){
    
    %>
    
    <script type="text/javascript">
    	alert("아디가 존재하지않음 다시 입력하셈");
    	history.back();
    
    </script>
    
    
    <%}else if(check ==0){ %>
    	<script>
    		alert("패스워드가 틀림 다시 입력하셈");
    		history.back();
    	
    	</script>
    
    
    <%}else if(check ==1){
    		StuDto mdto2 = mdao2.getMember(id);
    		
    		session.setAttribute("id", id);
    		session.setAttribute("pw", pw);
    		session.setAttribute("name", mdto2.getName());
    		session.setAttribute("authUser", id);
    		response.sendRedirect("main.jsp");
    	
    	}%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/custom.js">
</script>
</head>
<body>

</body>
</html>