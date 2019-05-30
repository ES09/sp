<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jquery</title>
</head>
<script src="/resources/js/jquery-3.4.1.min.js"></script>
<script>
	$(document).ready(function(){
		$('[type=button]').click(function(){
			var param = {
				uiId : $('#id').val(),
				uiPwd : $('#pwd').val()
			};	
			$.ajax({				
				url : '/login',
				method : 'POST',
				headers : {'Content-Type' : 'application/json'},
				data : JSON.stringify(param),
				success : function(res){
					console.log(res);
					alert('로그인 되었습니다.');
					}
			});
		});
	})
</script>
<body>
	<form id="LoginForm">
		<label for="id">아이디 : </label>
		<input type="text" id="id"><br>
		<label for="pwd">비밀번호 : </label>
		<input type="password" id="pwd"><br>
		<button type="button">로그인</button>
	</form>	
</body>
</html>