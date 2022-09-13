<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>${title }</h1>
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#"><i
					class="fa fa-dashboard"></i>MEMBER</a></li>
			<li class="breadcrumb-item"><a href="#">전체 회원 조회</a></li>
			<li class="breadcrumb-item active">${title }</li>
		</ol>
	</section>
	<!-- Main content -->
	<section class="content">
		<div class="row">
			<div class="col-lg-3 col-12">
				<!-- Profile Image -->
				<div class="box bg-inverse bg-dark bg-hexagons-white">
					<div class="box-body box-profile">
						<img
							class="profile-user-img rounded-circle img-fluid mx-auto d-block"
							src="../admin_resource/images/5.jpg" alt="User profile picture" />
						<h3 class="profile-username text-center">${dto.memberName }</h3>
						<div class="row social-states">
							<div class="col-6 text-right">
								<a href="#" class="link text-white"><i
									class="ion ion-ios-people-outline"></i>254</a>
							</div>
							<div class="col-6 text-left">
								<a href="#" class="link text-white"><i
									class="ion ion-images"></i>54</a>
							</div>
						</div>
						<div class="row">
							<div class="col-12">
								<div class="profile-user-info">
									<p>이메일 주소</p>
									<h6 class="margin-bottom">${dto.email }</h6>
									<p>전화번호</p>
									<h6 class="margin-bottom">${dto.tel }</h6>
									<p>주소</p>
									<h6 class="margin-bottom">${dto.address }</h6>
									<div class="map-box">
										<iframe
											src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2805244.1745767146!2d-86.32675167439648!3d29.383165774894163!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x88c1766591562abf%3A0xf72e13d35bc74ed0!2sFlorida%2C+USA!5e0!3m2!1sen!2sin!4v1501665415329"
											height="150" class="w-p100 b-0" allowfullscreen></iframe>
									</div>
									<p class="margin-bottom">SNS</p>
									<div class="user-social-acount">
										<button class="btn btn-circle btn-social-icon btn-facebook">
											<i class="fa fa-facebook"></i>
										</button>
										<button class="btn btn-circle btn-social-icon btn-twitter">
											<i class="fa fa-twitter"></i>
										</button>
										<button class="btn btn-circle btn-social-icon btn-instagram">
											<i class="fa fa-instagram"></i>
										</button>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- /.box-body -->
				</div>
				<!-- /.box -->
			</div>
			<!-- /.col -->
			<div class="col-lg-9 col-12">
				<div class="nav-tabs-custom">
					<ul class="nav nav-tabs">
						<li><a class="active" href="#activity" data-toggle="tab">문의
								내역</a></li>
						<li><a href="#settings" data-toggle="tab">정보 수정</a></li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane" id="timeline">
							<li><i class="fa fa-clock-o bg-gray"></i></li>
							</ul>
						</div>
						<!-- /.tab-pane -->
						<div class="active tab-pane" id="activity">
							<!-- Post -->
							<c:forEach var="qna" items="${requestScope.qna }">
							<div class="post">
								<div class="user-block">
									<span class="username"><a href="#">${dto.memberName }</a><a
										href="#" class="pull-right btn-box-tool"><i
											class="fa fa-times"></i></a></span><span class="description">${qna.qnadate }</span>
								</div>
								<!-- /.user-block -->
								<div class="activitytimeline">
									<p>문의내용</p>
									<p>${qna.qnacontent }</p>
									<hr>
									<c:if test="${qna.qnaresponse != null }">
									<p>답변내용</p>
									<p>${qna.qnaresponse }</p>
									<hr>
									</c:if>
									<ul class="list-inline">
										<li></li>
										<li class="pull-right">
										<c:if test="${qna.qnaresponse == null }">
										<a href="#" class="link-black text-sm"><i class="fa fa-comments-o margin-r-5"></i>
										답변대기중</a></li>
										</c:if>
										<c:if test="${qna.qnaresponse != null }">
										<a href="#"
											class="link-black text-sm"><i
												class="fa fa-comments-o margin-r-5"></i>답변완료</a></li>
										</c:if>
									</ul>
									<form class="form-horizontal form-element">
										<div class="form-group row no-gutters">
											<div class="col-sm-9">
												<input class="form-control input-sm" placeholder="답변을 입력하세요" />
											</div>
											<div class="col-sm-3">
												<button type="submit"
													class="btn btn-danger pull-right btn-block btn-sm">
													등록</button>
											</div>
										</div>
									</form>
								</div>
							</div>
							</c:forEach>
							<table>
								<tr>
									<td colspan="7">
										<div class="page_bar">
											<c:if test="${pagging.previousPageGroup }">
												<a href="memberProfile.do?pageNo=${pagging.startPageOfPageGroup - 1 }&email=${dto.email}">◀</a>
											</c:if>
											<c:forEach var="i" begin="${pagging.startPageOfPageGroup}" 
											end="${pagging.endPageOfPageGroup}">
												<a href="memberProfile.do?pageNo=${i }&email=${dto.email}">${ i}</a>
											</c:forEach>
										
											<c:if test="${pagging.nextPageGroup }">
												<a href="memberProfile.do?pageNo=${pagging.endPageOfPageGroup + 1 }&email=${dto.email}">▶</a>
											</c:if>
										</div>
								</tr>
							</table>
							<!-- /.post -->
						</div>
						<!-- /.tab-pane -->
						<div class="tab-pane" id="settings">
							<table width="600px" name="frm" align="center">
								<tr>
									<td align="center">

										<table width="100%" class="table">
											<tr align="center">
												<td><b>회원정보 수정</b></td>
											</tr>
										</table>

										<form action="memberUpdate.do" method="post">
											<table class="table2" width="100%">
												<tr>
													<td width="35%">이메일</td>
													<input type="hidden" value="${dto.email }" name="email">
													<td width="65%">${dto.email }</td>
												</tr>
												<tr>
													<td>비밀번호</td>
													<td><input type="password" name="password" size="40"
														required value="${dto.password }"/></td>
												</tr>

												<!-- 		-----로그인정보-----		 -->

												<tr>
													<td width="35%">이름</td>
													<td width="65%"><input type="text" name="memberName"
														size="40" value="${dto.memberName }" required /></td>
												</tr>
												<tr>
													<td>생년월일</td>
													<td><input type="date" name="birth" size="40"
														value="${dto.birth}" required /></td>
												</tr>
												<tr>
													<td>성별</td>
													<td>
													<c:if test="${dto.gender == 'F' }">
													<input type="text" name="gender" size="40"
														value="여성" />
													</c:if>
													<c:if test="${dto.gender == 'M' }">
													<input type="text" name="gender" size="40"
														value="남성" />
													</c:if>
													</td>
												</tr>
												<tr>
													<td>전화번호</td>
													<td><input type="text" name="tel" size="40"
														value="${dto.tel }" /></td>
												</tr>
												<tr>
													<td>주소</td>
													<td><input type="text" name="address" size="40"
														value="${dto.address }" /></td>
												</tr>
											</table>
											<table>
												<tr>
													<td colspan="2" align="center"><input class="button"
														type="submit" value="회원정보 수정" />
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input class="button"
														type="reset" value="다시쓰기" /></td>
												</tr>
											</table>
										</form>
							</table>
						</div>
						<!-- /.tab-pane -->
					</div>
					<!-- /.tab-content -->
				</div>
				<!-- /.nav-tabs-custom -->
			</div>
			<!-- /.col -->
		</div>
		<!-- /.row -->
	</section>
	<!-- /.content -->
</div>
<style>
.tab-pane table {
	font-size: 18px;
}

.tab-pane .table2 tr td {
	padding-bottom: 10px;
}

.tab-pane .table2 tr td input {
	border: 1px solid gray;
	border-top: none;
	border-left: none;
	border-right: none;
}

.button {
	margin-top: 20px;
	border: none;
	width: 150px;
	height: 50px;
}
.page_bar{
	position:relative;
	display:block;
	text-align: center;
	}
.page_bar a:link,.page_bar a:visited {
	color:black;
	text-decoration: none;
	font-size : 18px;
	margin-left: 10px;
	margin-right: 10px;
	}
.page_bar a:hover{
	font-weight: bold;
	color:red;
	}
.likeHate{
	cursor: pointer;
}
</style>
<script>
	$(function(){
		$('.likeHate').click(function(){
			style.color = 'blue';
		});
	});
</script>