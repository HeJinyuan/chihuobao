<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
	<form action="doLogin.do" method="post" id="login_form">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="name" id="name" type="text" size="25" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="password" id="password" type="password" size="25" />
			</tr>
			<tr>
				<td><a href="../user/userRegister.do">注册</a></td><td><input type="reset" value="重置" /> <input type="submit" value="登录" /></td>
			</tr>
		</table>
	</form>
</body>
</html>