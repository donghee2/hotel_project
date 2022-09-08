<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<!-- Header Start -->
	<header>
		<!-- Main Bar Start -->
		<div class="hd-sec">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="row nav-menu-bar">
							<!-- Logo Start -->
							<div class="col-md-3 col-sm-3 col-xs-8">
								<div class="logo">
									<a href="/"><img src="img/logo.png" alt="" /></a>
								</div>
							</div>
							<!-- Logo End -->
							<!-- Main Menu Start -->
							<div class="mobile-nav-menu"></div>
							<div class="col-md-7 col-sm-6 nav-menu">
								<div class="menu">
									<nav id="main-menu" class="main-menu">
										<ul>
											<li class="active"><a href="index.html">객실</a>
											<ul>
													<li><a href="index.html">실시간 예약하기</a></li>
													<li><a href="index-2.html">객실 예약현황</a></li>
													<li><a href="index-3.html">객실정보</a></li>
												</ul></li>
											<li><a href="#">다이닝</a>
											<ul>
													<li><a href="about.html">조식 예약하기</a></li>
													<li><a href="event.html">레스토랑 예약하기</a></li>
											</ul></li>
											<li><a href="room.html">예약하기</a></li>
											<li><a href="wishlist.do">위시리스트</a></li>
											<li><a href="#">오시는길</a></li>
										</ul>
									</nav>
								</div>
							</div>
							<!-- Main Menu End -->
							<!-- Main Apply Button Start -->
							<div class="col-md-2 col-sm-3 applay-button-area">
							<%
						boolean flag = false;
						if(session.getAttribute("login") != null) {
							flag = (boolean)session.getAttribute("login");							
						}
						if(flag){
						%>
						<a>${sessionScope.email }님 환영합니다.</a>
						<c:if test="${sessionScope.email == 'test' }">
							<div class="applay-button">
								<a id="logout_btn"><span class="lnr lnr-phone-handset"></span>로그아웃</a>
							</div>
						</c:if>
						<c:if test="${sessionScope.email != 'test' }">
							<div class="applay-button">
								<a id="logout_btn"><span class="lnr lnr-phone-handset"></span>로그아웃</a>
							</div>
						</c:if>
						<%
						} else {
						%>
						<div class="applay-button">
							<a href="/login"><span class="lnr lnr-phone-handset"></span>로그인</a>
						</div>
						<%
						}
						%>
								
							</div>
							<!-- Main Apply Button End -->
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<!-- Main Bar End -->
	</header>
	<!-- Header End -->
	<script src="js/header.js"></script>
</body>
</html>