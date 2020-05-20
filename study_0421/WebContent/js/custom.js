function delete_check(delete_id){
	

    var check = confirm("삭제해주시겠습니까?\n(삭제하시면 데이터 복구가 어렵습니다.)");
    	
    if(check == true){
    	alert("삭제를 진행하겠습니다");
    	location.href="delete.jsp?id="+update_join.id.value;
    }else{
    	alert("다시 수정페이지로 이동합니다.");
    	history.back();
    	return false;
    }
    
}


function update_check(){
	
	var id_ch=/^[a-zA-Z][a-zA-Z0-9]{2,14}$/;
	var name_check = /^[가-힣]*$/;
	var age_check = /^[0-9][1-3]$/;

	
	
	if(update_join.id.value==""){
		alert("아이디를 입력해주세요");
		update_join.id.focus();
		return false;
	}
	if(!(id_ch.test(update_join.id.value))){
		alert("3자리이상 문자와 숫자만 입력 가능합니다");
		update_join.id.focus();
		return false;
		
	}
	
	
	return update_join.submit();
	
	
	
	
	
}





function join_check(){
	//유효성 검사
	//id 대문자,소문자만 가능
	//pw 대문자,소문자,특수문자
	
	var id_ch=/^[a-zA-Z][a-zA-Z0-9]{2,14}$/;
	var name_check = /^[가-힣]*$/;
	var age_check = /^[0-9][1-3]$/;

	
	
	if(join.id.value==""){
		alert("아이디를 입력해주세요");
		join.id.focus();
		return false;
	}
	if(!(id_ch.test(join.id.value))){
		alert("3자리이상 문자와 숫자만 입력 가능합니다");
		join.id.focus();
		return false;
		
	}
	
	
	return join.submit();
}


function login_check(){
	//유효성 검사
	//id 대문자,소문자만 가능
	//pw 대문자,소문자,특수문자
	
	var id_ch=/^[a-zA-Z][a-zA-Z0-9]{2,14}$/;
	var name_check = /^[가-힣]*$/;
	var age_check = /^[0-9][1-3]$/;

	
	
	if(login2.id.value==""){
		alert("아이디를 입력해주세요");
		login2.id.focus();
		return false;
	}
	if(!(id_ch.test(login2.id.value))){
		alert("3자리이상 문자와 숫자만 입력 가능합니다");
		login2.id.focus();
		return false;
		
	}
	
	
	return login2.submit();
}




