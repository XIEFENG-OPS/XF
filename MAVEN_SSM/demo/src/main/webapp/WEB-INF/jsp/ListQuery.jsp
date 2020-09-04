<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<table align='center' border='1' cellspacing='0'>
    <tr>
    	<td>id</td>
    	<td>uid</td>
        <td>username</td>
        <td>roleid</td>
    </tr>
	<c:forEach items="${list}" var="c" varStatus="st">
		 <tr>
        	<td>${st.index}</td>
        	<td>${c.uid}</td>
            <td>${c.username}</td>
            <td>${c.roleid}</td>     
        </tr>
	</c:forEach>
	</table>
</body>
</html>