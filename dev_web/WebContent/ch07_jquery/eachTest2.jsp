<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOM조작[img] 실습 - 2-2</title>
<!-- 	<script type="text/javascript" src="/js/jquery.min.js" defer></script> -->
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js?1"></script>
	<script type="text/javascript" src="/js/jquery.easyui.min.js?23"></script>
	<style type="text/css">
		.high-light {
			background: yellow;
		}
		.high-light1-0 { background: yellow;}
		.high-light1-1 { background: orange;}
		.high-light1-2 { background: blue;}
		.high-light1-3 { background: green;}
		.high-light1-4 { background: red;}
	</style>
</head>
<body>
<script>
	'use strict'
	$(document).ready(function(){
		$('h1').each(function (index, item){
			$(this).addClass('high-light1-'+index);
		});
	});
</script>
<h1>item - 0</h1>
<h1>item - 1</h1>
<h1>item - 2</h1>
<h1>item - 3</h1>
<h1>item - 4</h1>
</body>
</html>