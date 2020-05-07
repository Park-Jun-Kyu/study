<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    	
    	<%
    	int listcount = ((Integer)request.getAttribute("listcount")).intValue();
    	// int listcount = Integer.parseInt(request.getAttribute("listcount").tostring());
    	// int listcount = Integer.parseInt((String)request.getAttribute("listcount")); //error
  		int nowpage = ((Integer)request.getAttribute("page")).intValue();
    	int maxpage = ((Integer)request.getAttribute("maxpage")).intValue();
    	int startpage = ((Integer)request.getAttribute("startpage")).intValue();
    	int endpage = ((Integer)request.getAttribute("endpage")).intValue();
    	
    	%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/notice_list.css">
</head>
<body>
  <header>
    <ul>
      <li>회원가입</li> <span>|</span>
      <li>로그인</li> <span>|</span>
      <li>고객행복센터</li> <span>|</span>
      <li>배송지역검색</li> <span>|</span>
      <li>기프트카드 등록</li>
    </ul>
  </header>

  <nav>
    <div class="logo"></div>

    <div id="search">
      <div class="search"></div><br>
      <span>메뉴찾기</span>
    </div>

    <div id="cart">
      <div class="cart"></div><br>
      <span>장바구니</span>
    </div>

    <div class="nav-menu">
      <ul>
        <li>COOKIT소개</li>
        <li>COOKIT 메뉴</li>
        <li>리뷰</li>
        <li>이벤트</li>
        <li>MY쿡킷</li>
      </ul>  
    </div>
  </nav>

  <section>
    <h1>NOTICE</h1>
    <div class="wrapper">
      <form action="search.do" name="searchFrom" method="post">
        <select name="opt" id="category">
          <option value="all">전체</option>
          <option value="tit">제목</option>
          <option value="con">내용</option>
        </select>

        <div class="search">
          <input type="text" name="search" size="16">
        </div>
  
        <button type="submit"><i class="fas fa-search"></i></button>
      </form>
    </div>

    <table>
      <colgroup>
        <col width="18%">
        <col width="50%">
        <col width="18%">
        <col width="10%">
      </colgroup>
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>작성일</th>
        <th>조회수</th>
      </tr>
      <!--  리스트 출력 -->
      <c:forEach var="dto" items="${list }">
      
      <tr>
        <td><span class="table-notice">${dto.bId }</span></td>
        <td class="table-title">
      	<a href = "content_view.do?bId=${dto.bId }">
          <c:forEach begin="1" end="${dto.bIndent }">▶</c:forEach>
          ${dto.bTitle }</a></td>
        <td>${dto.bDate }</td>
        <td>${dto.bHit }</td>
      </tr>
   </c:forEach>
      
      
      
    </table>
    
    
    
    
    
    
    
    <!--  searchflag 가 있을때  -->
    <c:choose>
	    <c:when test="${searchflag !=null }">
	    	 <ul class="page-num">
    <!--  첫페이지 이동  -->
      <a href="list.do?searchflag=${searchflag }&opt=${opt }&search=${search }&page=1"><li class="first"></li></a>
      <!-- 이전페이지 이동버튼 -->
      <c:if test="${page<=1 }">
      	<li class="prev"></li>
      </c:if>
      <c:if test="${page>1 }">
      	<a href="list.dosearchflag=${searchflag }&opt=${opt }&search=${search }&?page=${page-1 }"><li class="prev"></li></a>
      </c:if>
      <!--  순차적으로 페이지 출력 -->
      <c:forEach var="a" begin="${startpage }" end="${endpage }" step="1">
      	<c:choose>
      <c:when test="${a == page }">
      	<li class="num"><div>${a}</div></li> 
      
      </c:when>
      <c:when test = "${a != page }">
      	 <a href="list.do?searchflag=${searchflag }&opt=${opt }&search=${search }&page=${a }"><li class="num"><div>${a}</div></li> </a>
      </c:when>
      
      
   	</c:choose>
   	
   	
      </c:forEach>
      
      <!--  다음페이지 이동 -->
      <c:if test="${page>=maxpage }">
    	  <li class="next"></li>
      </c:if>
      <!--  마지막 페이지 이동 -->
      <c:if test="${page<maxpage }">
     	 <a href="list.do?searchflag=${searchflag }&opt=${opt }&search=${search }&page=${page+1 }"><li class="next"></li></a>
      </c:if>
     
    </ul>
	    
	    
	    </c:when>
	    
	    <c:otherwise>
	<!--  searchflag가 없을때  -->
    <ul class="page-num">
    <!--  첫페이지 이동  -->
      <a href="list.do?searchflag=${searchflag }&opt=${opt }&search=${search }&page=1"><li class="first"></li></a>
      <!-- 이전페이지 이동버튼 -->
      <c:if test="${page<=1 }">
      	<li class="prev"></li>
      </c:if>
      <c:if test="${page>1 }">
      	<a href="list.do?searchflag=${searchflag }&opt=${opt }&search=${search }&page=${page-1 }"><li class="prev"></li></a>
      </c:if>
      <!--  순차적으로 페이지 출력 -->
      <c:forEach var="a" begin="${startpage }" end="${endpage }" step="1">
      	<c:choose>
      <c:when test="${a == page }">
      	<li class="num"><div>${a}</div></li> 
      
      </c:when>
      <c:when test = "${a != page }">
      	 <a href="list.do?searchflag=${searchflag }&opt=${opt }&search=${search }&page=${a }"><li class="num"><div>${a}</div></li> </a>
      </c:when>
      
      
   	</c:choose>
      </c:forEach>
      
      <!--  다음페이지 이동 -->
      <c:if test="${page>=maxpage }">
    	  <li class="next"></li>
      </c:if>
      <!--  마지막 페이지 이동 -->
      <c:if test="${page<maxpage }">
     	 <a href="list.do?searchflag=${searchflag }&opt=${opt }&search=${search }&page=${page+1 }"><li class="next"></li></a>
      </c:if>
     
    </ul>
	    
	    
	    </c:otherwise>
    
    
    </c:choose>
    

    <a href="content_view.jsp"><div class="write">쓰기</div></a>
  </section>

  <footer>
    <div class="wrapper">
      <div class="footer-left">
        <div class="footer-logo"></div>
        <div class="copyright">© COOKIT ALL RIGHTS RESERVED</div>
      </div>
  
      <div class="footer-center">
        <ul class="footer-nav">
          <li class="first-list">이용약관</li>
          <li class="green">개인정보처리 방침</li>
          <li>법적고지</li>
          <li>사업자정보 확인</li>
        </ul>
  
        <ul class="footer-info">
          <li class="first-list">씨제이제일제당(주)</li>
          <li>대표이사 : 손경식,강신호,신현재</li>
          <li>사업자등록번호 : 104-86-09535</li>
          <li class="first-list">주소 : 서울 중구 동호로 330 CJ제일제당 센터 (우) 04560</li>
          <li>통신판매업신고 중구 제 07767호</li>
          <li class="first-list">개인정보보호책임자 : 조영민</li>
          <li>이메일 : cjon@cj.net</li>
          <li>호스팅제공자 : CJ올리브네트웍스㈜</li>
        </ul>
  
        <div id="check">고객님은 안전거래를 위해 현금등으로 결제시 LG U+ 전자 결제의 매매보호(에스크로) 서비스를 이용하실 수 있습니다. <span class="check">가입 사실 확인</span></div>
      </div>
  
      <div class="footer-right">
        <div id="shortcut">
          <span>CJ그룹계열사 바로가기</span>
          <div class="shortcut"></div>
        </div>
  
        <div class="call">고객행복센터 1668-1920</div>
        <div class="inquery">1:1 문의</div>
      </div>
  
    </div>
  </footer>
</body>
</html>