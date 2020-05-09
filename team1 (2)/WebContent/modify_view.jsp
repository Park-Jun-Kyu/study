<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="css/write.css">
		<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR&display=swap" rel="stylesheet">
		<script type="text/javascript" src="js/prefixfree.dynamic-dom.min.js"></script>
		<script type="text/javascript" src="js/jquery-ui.min.js"></script>
		<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="js/write.js"></script>
		<script type="text/javascript"></script>
		
		
		
		
	</head>
	<body>
	<form action="modify.do" name="form" method="get">
		<header>
			<div id="nav_up">
				<ul>
					<li>회원가입</li>
					<li>로그인</li>
					<li>고객행복센터</li>
					<li>배송지역검색</li>
					<li><a href="adminLogin.html">ADMINISTRATOR</a></li>
					
				</ul>
			</div>
			<nav>
				<h1></h1>
				<ul>
					<li>COOKIT소개</li>
					<li>COOKIT메뉴</li>
					<li>리뷰</li>
					<li>이벤트</li>
					<li>MY쿡킷</li>
				</ul>
				<ul>
				<li><a href="#"><span>장바구니</span></a></li>
				<li><a href="#"><span>메뉴찾기</span></a></li>
			</ul>
			</nav>
		
		</header>
	<section>
		
		
			<h4>게시글 작성</h4>
		<div id="big_box">
			<dl>
				<dt>제목</dt>
			<dd>
				<div>
					<div>
					 <input type="hidden" name="pId" value="${modify_view.pId }">
						<input type="text" id="txt" name="pTitle" value="${modify_view.pTitle }" placeholder="문의할 주문번호 또는 상품을 선택해주세요.">
					</div>
					
				</div>
				
			</dd>
			</dl>
			</div>
			
		
			<dl id="second_box">
				<dt>문의내용</dt>
				<dd><textarea id="question" name="pContent" cols="87" rows="12" title="문의 내용 작성란" placeholder="문의 내용을 입력해주세욧" maxlength="1000">
				
				${modify_view.pContent }
				
				</textarea>
					
			
			
			
			
				</dd>
			</dl>
	
			<dl id="third_box">
				<dt>작성자</dt>
					<div>
						<span><input type="text" id="txt1" name="pName" placeholder="닉네임을 입력하세요."></span>
					</div>
	
			</dl>
			

		
		<div id="check_button2">
		<input type = "button" id="btn_white" onclick="javascript:window.history.back(-1)" value ="취소">
		<button id="btn_green"><span>확인</span></button>
		</div>
		
		
		
		</section>
		
		<div id="bot_box">
        <input type="button" id="bot" class="chatbot" onclick="javascript:cj.chatbot.open('//cookit.oli-va.com');">
            <span id="bot_span">챗봇으로 문의하기</span>
       
   		 </div>
		
		
		
	<footer>
		<div id="big">
			<div>
				<div></div>
				<div>
					<p>©COOKITALL RIGHTS RESERVED</p>
				</div>
			</div>
			<div>
				<ul>
					<li>이용약관</li>
					<li>개인정보처리방침</li>
					<li>법적고지</li>
					<li>사업</li>
				</ul>
				<div>
					<p>씨제이제일제당(주) | 대표이사:손경식,강신호,신현재 | 사업자등록번호:104-86-09535</p>
					<p>주소:서울 중구 동호로330CJ제일제당 센터(우)04560 | 통신판매업신고중고 제07767호 |
						개인정보보호책임자:조영민</p>
					<p>이메일:cjon@cj.net | 호스팅제공자:CJ올리브네트웍스(주)</p>
					<P>고객님은 안전거래를 위해 현금등으로 결제시 LGU+전자 결제의 매매보호(에스크로) 서비스를 이용하실 수
						있습니다.
				</div>

			</div>

			<div>
				<div>
					<span>CJ그룹계열사 바로가기</span>
				</div>
				<div>고객행복센터 1668-1920</div>
			</div>

		</div>



	</footer>
	
	</form>
	
	</body>
</html>