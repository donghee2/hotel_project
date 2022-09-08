<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="input_wrap">
	<div class="title">${title }</div>
	<div class="semi_title">가입정보를 입력하시면 아이디를 확인하실 수 있습니다.</div>
	<div class="login_area">
		<div class="input_area">
			<div><input type="text" placeholder="아이디(이메일)" /></div>
			<div><input type="text" placeholder="이름" /></div>
			<div><input type="password" placeholder="휴대폰번호" /></div>
		</div>
		<div class="btn_area">
			<button id="find_btn" data-type="pw">비밀번호 찾기</button>
		</div>
	</div>
</div>

<script src="js/login/find.js"></script>