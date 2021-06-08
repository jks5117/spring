<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOM조작[setInterval 함수] 실습 </title>
<style type="text/css">
	.clock2 {
		font-size: 38px;
		display: inline-block;
		border: 2px solid green;
	}
</style>
</head>
<body>
<h1 id="clock" class="clock2"></h1>
<script>
	window.onload = function(){
		const clock = document.getElementById('clock');
		const clock2 = document.querySelector('.clock2');
		//익명 함수 처리하는 연습
		setInterval(function(){
			clock2.innerHTML = new Date().toString();
		},1000);
	}
</script>
</body>
</html>