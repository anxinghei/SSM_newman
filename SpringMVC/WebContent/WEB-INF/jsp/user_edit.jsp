<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/editUsers" method="post" id='formid'>
		<table width="30%" border=1>
			<tr>
				<td>选择</td>
				<td>用户名</td>
			</tr>
				<td>
					<input name="users[0].id" value="1" type="checkbox"/>
				</td>
				<td>
					<input name="users[0].username" value="tome" type="text"/>
				</td>
			<tr>
				<td>
					<input name="users[1].id" value="2" type="checkbox"/>
				</td>
				<td>
					<input name="users[1].username" value="jack" type="text"/>
				</td>
			</tr>
		</table>
		<input type="submit" value="修改"/>
	</form>
</body>
</html>