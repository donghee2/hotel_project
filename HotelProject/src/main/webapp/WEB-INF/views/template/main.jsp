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
	<!-- Booking Section End -->
	
	<!-- Booking Section End -->
	<!-- Room List Section Start -->
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
				<c:forEach var="room" items="${requestScope.mainlist }">
				<input type="hidden" name="roomno" value="${room.roomNo }">
				<div class="col-md-4 col-sm-6">
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
	<!-- Room List Section End -->
	<!-- Room Call To Action Section Start -->
	<div class="room-call-to-action-sec pt-100 pb-100">
		<div class="room-call-overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-sm-7">
					<div class="room-call-desc">
						<span class="room-subtitle">Early Bird</span>
						<h1>Book Directly with us and</h1>
						<h1>
							<span class="border_left"></span>Purchase In Advance
						</h1>
						<p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit
							amet, consectetur, adipisci velit, sed quia non numquam eius
							tempora incidunt ut labore et dolore magnam aliquam quaerat
							voluptatem. Ut enim ad minima veniam,</p>
					</div>
				</div>
				<div class="col-md-6 col-sm-5">
					<div class="room-discount">
						<p>15 Days Before Arrival</p>
						<h1>25% Off</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Room Call To Action Section End -->
	<!-- Service Section Start -->
	<div class="service-sec pt-100 pb-70">
		<div class="container">
			<!-- Section Title Start -->
			<div class="row">
				<div class="col-md-6">
					<div class="sec-title">
						<h1>
							<span class="title_border"></span>What You Get.
						</h1>
						<p>Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut
							odit aut fugit, sed quia consequuntur magni dolores eos qui
							ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui
							dolorem</p>
					</div>
				</div>
			</div>
			<!-- Section Title End -->
			<div class="row">
				<!-- Single Service Start -->
				<div class="col-md-4 col-sm-6">
					<div class="service-inner">
						<h3>
							<a href="#"><span class="service-icon"><img
									src="img/icon/wifi.png" alt="" /></span><span class="service_border"></span>Free
								Wifi</a>
						</h3>
						<p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit
							amet, consectetur, adipisci velit, sed quia non numquam eius modi
							tempora incidunt ut labore et dolore magnam</p>
					</div>
				</div>
				<!-- Single Service End -->
				<!-- Single Service Start -->
				<div class="col-md-4 col-sm-6">
					<div class="service-inner">
						<h3>
							<a href="#"><span class="service-icon"><img
									src="img/icon/fruit.png" alt="" /></span><span class="service_border"></span>Free
								Breakfast</a>
						</h3>
						<p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit
							amet, consectetur, adipisci velit, sed quia non numquam eius modi
							tempora incidunt ut labore et dolore magnam</p>
					</div>
				</div>
				<!-- Single Service End -->
				<!-- Single Service Start -->
				<div class="col-md-4 col-sm-6">
					<div class="service-inner">
						<h3>
							<a href="#"><span class="service-icon"><img
									src="img/icon/wave.png" alt="" /></span><span class="service_border"></span>Private
								Pool</a>
						</h3>
						<p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit
							amet, consectetur, adipisci velit, sed quia non numquam eius modi
							tempora incidunt ut labore et dolore magnam</p>
					</div>
				</div>
				<!-- Single Service End -->
				<!-- Single Service Start -->
				<div class="col-md-4 col-sm-6">
					<div class="service-inner">
						<h3>
							<a href="#"><span class="service-icon"><img
									src="img/icon/plalyground.png" alt="" /></span><span
								class="service_border"></span>Kids Playground</a>
						</h3>
						<p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit
							amet, consectetur, adipisci velit, sed quia non numquam eius modi
							tempora incidunt ut labore et dolore magnam</p>
					</div>
				</div>
				<!-- Single Service End -->
				<!-- Single Service Start -->
				<div class="col-md-4 col-sm-6">
					<div class="service-inner">
						<h3>
							<a href="#"><span class="service-icon"><img
									src="img/icon/taxi.png" alt="" /></span><span class="service_border"></span>Airport
								Taxi</a>
						</h3>
						<p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit
							amet, consectetur, adipisci velit, sed quia non numquam eius modi
							tempora incidunt ut labore et dolore magnam</p>
					</div>
				</div>
				<!-- Single Service End -->
				<!-- Single Service Start -->
				<div class="col-md-4 col-sm-6">
					<div class="service-inner">
						<h3>
							<a href="#"><span class="service-icon"><img
									src="img/icon/waiter.png" alt="" /></span><span class="service_border"></span>Butler
								Service 24/7</a>
						</h3>
						<p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit
							amet, consectetur, adipisci velit, sed quia non numquam eius modi
							tempora incidunt ut labore et dolore magnam</p>
					</div>
				</div>
				<!-- Single Service End -->
			</div>
		</div>
	</div>
	<!-- Service Section End -->
	<!-- About V2 Section Start -->
	<div class="about-v2-sec pt-100 pb-100">
		<div class="about-v2-overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-sm-7">
					<div class="about-v2-desc">
						<h1>Watch the video to find out</h1>
						<h1>
							<span class="border_left"></span>more about our services
						</h1>
						<p>Omnis dolor repellendus. Temporibus autem quibusdam et aut
							officiis debitis aut rerum necessitatibus saepe eveniet ut et.</p>
					</div>
				</div>
				<div class="col-md-6 col-sm-5">
					<div class="video-inner">
						<div class="vedio-button">
							<a href="https://www.youtube.com/watch?v=7e90gBu4pas"
								class="mfp-iframe vedio-play"><i class="fa fa-play"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- About V2 Section End -->
	<!-- Room Gallary Section Start -->
	<div class="room-gallary-v2-sec pt-100 pb-70">
		<div class="container">
			<!-- Section Title Start -->
			
			<!-- Section Title End -->
			
			
				
				</div>
			</div>
		</div>
	</div>
	<!-- Room Gallary Section End -->
</body>
</html>