function signUp(){
	var name_check = /^[가-힣]{3,}$/;
	var id_check = /^[a-zA-Z]+[a-zA-Z0-9!@#$%<>^&*]{4,16}$/;
	var pw_check = /^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^*<>?]).{10,}$/;
	var tel_check = /^[0-9]&/;
	var ch_memNum = /[0-9]$/;
	var ch_MemNum = /[0-9]{4}$/;
	
	if(form.j_name.value == ""){
		alert('이름을 입력해주세요.');
		form.j_name.focus();
		return false;
	}
	
	if(!(name_check.test(form.j_name.value))){
		alert('이름은 한글로 3글자이상 입력해주세요.');
		form.j_name.value = "";
		form.j_name.focus();
		return false;
	}
	
	if(form.j_id.value == ""){
		alert('아이디를 입력해주세요.');
		form.j_id.focus();
		return false;
	}
	

	
	if(!(id_check.test(form.j_id.value))){
		alert('4~15자리의 영문,숫자,특수기호(_)만 사용하실 수 있습니다.첫글자는 영문으로 입력해주세요.')
		form.j_id.value = "";
		form.j_id.focus();
		return false;
	}
	
	if(form.j_pw.value == ""){
		alert('비밀번호를 입력해주세요.');
		form.j_pw.focus();
		return false;
	}
	
	if(!(pw_check.test(form.j_pw.value))){
		alert('영문, 숫자, 특수문자를 조합하여 10자리 이상 입력해주세요.');
		form.j_pw.value="";
		form.j_pw.focus();
		return false;
	}
	
	if(form.j_pw2.value == ""){
		alert('비밀번호 확인을 입력해주세요.');
		form.j_pw2.focus();
		return false;
	}
	
	if(!(form.j_pw2.value == form.j_pw.value)){
		alert('비밀번호와 일치하지 않습니다.');
		form.j_pw2.value = "";
		form.j_pw2.focus();
		return false;
	}
	
	if(form.j_mail.value == ""){
		alert('이메일을 입력해주세요.');
		form.j_mail.focus();
		return false;
		
	} else if (form.j_mail2.value == ""){
		alert('이메일 주소를 입력 혹은 선택해주세요.');
		form.j_mail2.focus();
		return false;
	}
	
	if(form.j_address.value == ""){
		alert("주소를 입력해주세요.");
		form.j_adrress.focus();
		return false;
	}
	
	if(form.j_tel1.value == "" || form.j_tel2.value == "" || form.j_tel3.value == ""){
		alert('전화번호를 입력해주세요.');
		form.j_tel1.focus();
		return false;
		
		
	}
	
	var birth = document.getElementsByName("birthPM");
	var chk = false;
	for(var i = 0; i<birth.length;i++){
		if(birth[i].checked){
			chk = true;
		}
	}
	if(!chk){
		alert('양력과 음력중 하나를 체크해주세요.');
		birth[0].checked = true;
		return false;
	}
	
	var gender = document.getElementsByName("gender");
	var chk = false;
	for(var i = 0 ; i<gender.length; i++){
		if(gender[i].checked){
		 chk = true;
		}
	}
	
	if(!chk){
		alert('성별을 선택해주세요.');
		gender[0].checked = true;
		return false;
	}
	
	var news = document.getElementsByName("news");
	var chk = false;
	for(var i = 0; i<news.length; i++){
		if(news[i].checked){
			chk = true;
		}
	}
	if(!chk){
		alert('뉴스레터 수신여부를 체크해주세요.');
		news[0].checked = true;
		return false;
	}
	
	var sms = document.getElementsByName("sms");
	var chk = false;
	for(var i = 0; i<sms.length; i++){
		if(sms[i].checked){
			chk = true;
		}
	}
	if(!chk){
		alert('sms수신 여부를 체크해주세요.');
		sms[0].checked = true;
		return false;
	}
	
	if(form.memNum.value == ""){
		alert('회원번호를 입력해주세요.');
		form.memNum.focus();
		return false;
	}
	
	if(!(ch_memNum.test(form.memNum.value))){
		alert('회원번호는 숫자만 입력해주세요.');
		form.memNum.value = "";
		form.memNum.focus();
		return false;
	}
	
	if(form.checkMemNum.value == ""){
		alert('회원인증번호를 입력해주세요.')
		form.checkMemNum.focus();
		return false;
	}
	
	if(!(ch_MemNum.test(form.checkMemNum.value))){
		alert('회원인증번호는 숫자만 입력해주세요.');
		form.checkMemNum.value = "";
		form.checkMemNum.focus();
		return false;
	}
	
	var marry = document.getElementsByName("marriage");
	var chk = false;
	for(var i = 0; i<marry.length; i++){
		if(marry[i].checked){
			chk = true;
		}
	}
	
	if(form.jobOpt.value == "null"){
		alert('직업을 선택해주세요.');
		return false;
	}
	
	if(!chk){
		alert('결혼 여부를 체크해주세요.');
		marry[0].checked = true;
		return false;
	}
	
	var chk = false;
	for(var i = 0; i<form.interest.length;i++){
		if(form.interest[i].checked){
			chk = true;
		}
	}
	if(!chk){
		alert('관심사를 체크해주세요.');
		form.interest[0].checked = true;
		return false;
	}
	
	return form.submit();
	
}

