<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>简单用户注册页面</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
</head>
<body>
	<div class="container">
		<h2>简单用户注册</h2>

		<form action="simpleUserRegister" method="post">
			<div class="biger">
				<div class="input1">
					<p>用户名称:<input type="text" name="name" class="inputBox" placeholder="请输入您的用户名"></p>
					<p>注:用户名称长度必须在2-8之间</p>
					<p>登录密码:<input type="password" name="password" class="inputBox" placeholder="请输入您的密码"></p>
				</div>
			</div>
			<hr>
			<div id="failure" style="text-align:center">${message }</div>
			<div class="buttonDiv">
				<input type="submit" class="button" name="" value="注册">
				<input type="reset" class="button" name="" value="重置">
			</div>	
		</form>	
	</div>
</body>
</html>