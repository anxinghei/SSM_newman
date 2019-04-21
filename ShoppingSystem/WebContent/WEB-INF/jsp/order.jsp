<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单处理</title>
</head>
<body>
	<br/><br/>
	<form action="${pageContext.request.contextPath }/addOrder.action" method="post">
		产品名： <input type="text" name="name"/><br/>
		总价格： <input type="text" name="price"/><br/>
		销售员： <input type="text" name="userid"/><br/>
		<input type="submit" value="增加订单" />
	</form>
	<br/>${delete}<br/>
	<form action="${pageContext.request.contextPath }/deleteOrder.action" method="post">
		产品Id： <input type="text" name="id"/><br/>
		<input type="submit" value="删除订单" />
	</form>
	<br/>${update}<br/>
	<form action="${pageContext.request.contextPath }/updateOrder.action" method="post">
		订单ID： <input type="text" name="id"/><br/>
		产品名： <input type="text" name="name"/><br/>
		总价格： <input type="text" name="price"/><br/>
		出售日期： <input type="text" name="day"/><br/>
		销售员： <input type="text" name="userid"/><br/>
		<input type="submit" value="修改订单"/>
	</form>
	<br/>${query}<br/>
	<form action="${pageContext.request.contextPath }/queryOrder.action" method="post">
		订单ID： <input type="text" name="id"/><br/>
		产品名： <input type="text" name="name"/><br/>
		总价格： <input type="text" name="price"/><br/>
		出售日期： <input type="text" name="day"/><br/>
		销售员： <input type="text" name="userid"/><br/>
		<input type="submit" value="查询订单"/>
	</form>
</body>
</html>