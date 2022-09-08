<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="input_wrap">
	<div class="title">${title }</div>
	<div class="mypage_area">
		<div class="btn_area no-margin-top">
			<button class="mypage_btn" id="like_btn">찜</button>
			<button class="mypage_btn" id="inquiry_write_btn">1:1 문의하기</button>
			<button class="mypage_btn" id="inquiry_btn">1:1 문의내역</button>
			<button class="mypage_btn" id="review_btn">리뷰내역</button>
		</div>
	</div>
</div>

<script>
	$(() => {
		$(document).on('click', '#like_btn', function(e) {
			alert('찜');
		});
		
		$(document).on('click', '#inquiry_write_btn', function(e) {
			location.href = '/inquiry-form';
		});
		
		$(document).on('click', '#inquiry_btn', function(e) {
			location.href = '/inquiry-list';
		});
		
		$(document).on('click', '#review_btn', function(e) {
			alert('리뷰내역');
		});
	});
</script>