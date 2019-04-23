<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分页结果</title>
</head>
<body>
	<center>
        <table width="200" border="1">
          <tr>
            <th>ID</th>
            <th>订单名</th>
            <th>价格</th>
            <th>日期</th>
            <th>销售员</th>
          </tr>
		  <c:forEach items="${pageInfo.getList()}" var="order">
          	<tr>
          		<td>${order.getId()}</td>
          		<td>${order.getName()}</td>
          		<td>${order.getPrice()}</td>
          		<td>${order.getDate()}</td>
          		<td>${order.getUserid()}</td>
          	</tr>
          </c:forEach>
        </table>  
        <div style="text-align:center">
                                     一共${pageInfo.getTotal()}条记录，有${pageInfo.getPages()}页，当前页号：${pageInfo.getPageNum()}
      	</div>
      	 <div style="text-align:center">
      		<c:if test="${pageInfo.isIsFirstPage()==true}"><a>首页</a></c:if>
   			<c:if test="${pageInfo.isIsFirstPage()==false}">
        		<a href="findAll.action?pageNum=${pageInfo.getFirstPage()}">首页</a>
    		</c:if>
 
  			<c:if test="${pageInfo.isHasPreviousPage()==false}"><a>上一页</a></c:if>
    		<c:if test="${pageInfo.isHasPreviousPage()==true}">
       	 		<a href="findAll.action?pageNum=${pageInfo.getPrePage()}">上一页</a>
   	 		</c:if>
   
   			<c:if test="${pageInfo.isHasNextPage()==false}"><a>下一页</a></c:if>
   			<c:if test="${pageInfo.isHasNextPage()==true}">
       			<a href="${pageContext.request.contextPath}/findAll.action?pageNum=${pageInfo.getNextPage()}">下一页</a>
    		</c:if>
    
   	 		<c:if test="${pageInfo.isIsLastPage()==true}"><a>末页</a></c:if>
    		<c:if test="${pageInfo.isIsLastPage()==false}">
        		<a href="${pageContext.request.contextPath}/findAll.action?pageNum=${pageInfo.getLastPage()}">末页</a>
    		</c:if>
    	</div>
    </center>
</body>
</html>