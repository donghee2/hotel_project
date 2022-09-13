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
<style>
	.tab-container {
		display: flex;
		justify-content: center;
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
	
</style>
</head>
<body>
	<!-- Nav tabs -->
	<div class="tab-container">
		<ul class="nav nav-tabs" id="myTab" role="tablist">
		  <li class="nav-item" role="presentation">
		    <button class="nav-link active" id="home-tab" data-bs-toggle="tab" data-bs-target="#home" type="button" role="tab" aria-controls="home" aria-selected="true">신촌점</button>
		  </li>
		  <li class="nav-item" role="presentation">
		    <button class="nav-link" id="profile-tab" data-bs-toggle="tab" data-bs-target="#profile" type="button" role="tab" aria-controls="profile" aria-selected="false">마포점</button>
		  </li>
		  <li class="nav-item" role="presentation">
		    <button class="nav-link" id="messages-tab" data-bs-toggle="tab" data-bs-target="#messages" type="button" role="tab" aria-controls="messages" aria-selected="false">홍대점</button>
		  </li>
		</ul>
	</div>
	<!-- Tab panes -->
	<div class="tab-content">
	  <div class="tab-pane active" id="home" role="tabpanel" aria-labelledby="home-tab">ㅇㅇㅇㅇㄴㅇㅇㅇㅇㄷㄷㅇㅇㅇㅇㅇㅇ..</div>
	  <div class="tab-pane" id="profile" role="tabpanel" aria-labelledby="profile-tab">..ㅇㅇㅇㅇㅇㅇㅇㅇㄴㄴㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ.</div>
	  <div class="tab-pane" id="messages" role="tabpanel" aria-labelledby="messages-tab">.ㅇㅇㅇㅇㅇㅇㅇㅇㅇㄴㄴㅇㅇㅇㅇㅇㅇㅇㅇㅇ..</div>
	</div>
</body>
</html>