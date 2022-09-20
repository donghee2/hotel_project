<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=	c107017d3c78a41473933d3434b2865b"></script>
<style>
	.tab-container {
		display: flex;
		justify-content: center;
		padding: 150px 0px;
	}
	.tab-container ul{
		height: 30px;
		border-bottom: none;
	}
	.tab-container ul li {
		height: 30px;
	}
	.tab-container button {
		width: 200px;
		height: 30px;
	}
	.tab-content {
		display: flex;
		justify-content: center;
	}
	#map {
		margin: 50px auto;
	}
	.result {
		width: 600px;
		margin: 40px auto;
	}
	.hotelView-container {
		width: 1200px;
		margin: 0 auto;
		border: 1px solid black; 
		background-image: url(img/slider-1);
	}
</style>

</head>
<body>
	<div class="room-list-sec bg-gray pt-100 pb-70">
		<div class="container">
			<!-- Section Title Start -->
			<div class="row">
				<div class="col-md-6">
					<div class="sec-title">
						<h1>
							<span class="title_border"></span>객실.
						</h1>
						<p>객실소개</p>
					</div>
				</div>
			</div>
			<!-- Section Title End -->
			<div class="row">
				<!-- Single Room Start -->
				<c:forEach var="room" items="${requestScope.roomlist }">
				<input type="hidden" name="roomno" value="${room.roomno }">
				<div class="col-md-4 col-sm-6">
					<p>${room.hotelname }</p>
					<div class="room-list-inner">
						<div class="room-list-img">
							<img src="../img/roomimg.jpg" alt="" />
							<div class="room-list-img-overlay">
								<a href="#">${room.price }</a>
							</div>
						</div>
						<div class="room-list-text">
							<h2>
								<a href="#">${room.roomtype }</a><span class="room-rating"><i
									class="icofont-ui-rating"></i><i class="icofont-ui-rating"></i><i
									class="icofont-ui-rating"></i><i class="icofont-ui-rate-blank"></i><i
									class="icofont-ui-rate-blank"></i></span>
							</h2>
							<p>${room.roomsimplemanual }</p>
							<a href="#" class="booking-btn">예약하기</a>
							<a href="#" class="booking-btn">찜하기</a>
						</div>
					</div>
				</div>
				</c:forEach>
				<!-- Single Room End -->
				
			</div>
		</div>
	</div>
</body>
</html>