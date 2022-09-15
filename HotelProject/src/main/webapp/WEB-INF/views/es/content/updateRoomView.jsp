<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

</style>

</head>
<body>
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>객실 정보 수정</h1>
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="admin.do"><i
							class="fa fa-dashboard"></i>Main</a></li>
					<li class="breadcrumb-item"><a href="#">객실 관리</a></li>
					<li class="breadcrumb-item active"><a href="insertHotelView.do">객실 등록</a></li>
				</ol>
			</section>
			<!-- Main content -->
			<section class="content">
			<form class="hotelfrm" action="updateRoom.do" method="post" enctype="multipart/form-data">
				<div class="row">
					<!-- /.col -->
					<div class="col-xl-8 col-lg-7">
						<div class="box box-solid bg-black">
							<div class="box-header with-border">
								<h3 class="box-title"></h3>
							</div>
							<!-- /.box-header -->
							<div class="box-body">
								<div class="row">
									<div class="col-12">
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Room No</label>
											<div class="col-sm-6">
												<input class="form-control" type="text" placeholder="객실 코드 입력" name="roomNo"
												value="${requestScope.dto.roomNo }">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">From Hotel</label>
											<div class="col-sm-6">
												<div class="form-group">
													<select class="form-control select2 w-p100">
													<c:set var="hotelNo" value="${requestScope.dto.hotelNo }"></c:set>
													<c:forEach var="h" items="${requestScope.dto.hotellist }">
														<c:choose>
															<c:when test="${h.hotelNo eq hotelNo}">
								                        		<option selected="selected">${h.hotelName }(${h.hotelNo })</option>
															</c:when>
															<c:otherwise>
								                        		<option>${h.hotelName }(${h.hotelNo })</option>
															</c:otherwise>
														</c:choose>
							                      	</c:forEach>
							                      	</select></div>
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Name/Type</label>
											<div class="col-sm-6">
												<input class="form-control" type="text"
													placeholder="객실 이름 입력" name="roomType"
													value="${requestScope.dto.roomType }">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Price</label>
											<div class="col-sm-10">
												<input class="form-control" type="text"
													placeholder="객실 가격 입력" name="roomPrice"
													value="${requestScope.dto.price }">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Room Image</label>
											<div class="col-sm-10">
												<input class="form-control" type="file"
													placeholder="객실 이미지 등록" accept="image/*" name="file">
												<input class="form-control" type="hidden" name="roomImage"
												value="../admin_resource/images/">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Simple Manual</label>
											<div class="col-sm-10">
												<input class="form-control" type="text"
													placeholder="호텔 간단 소개 입력" name="roomSimpleManual"
													value="${requestScope.dto.roomSimpleManual }">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Detail Manual</label>
											<div class="col-sm-10">
												<input class="form-control" type="text"
													placeholder="호텔 상세 소개 입력" name="hotelDetailManual"
													value="${requestScope.dto.roomDetailManual }">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label"></label>
											<div class="col-sm-10">
												<button type="submit" class="btn btn-warning btn-lg mx-auto">수정하기</button>
											</div>
										</div>
									</div>
									<!-- /.col -->
								</div>
								<!-- /.row -->
							</div>
							<!-- /.box-body -->
						</div>
						<!-- /.box -->
					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
				</form>
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->
		
<!-- 우편 번호 주소 API -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript">

</script>
		
</body>
</html>