<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" />
<title>Insert title here</title>
</head>

<body>
<p>${sessionScope.user_id }</p>

<input type="button" value="회원정보수정" class="btn" onclick="location.href='/jk/memberupdate'"><p>
<input type="button" value="회원정보수정" class="btn" onclick="location.href='/jk/memberupdate'"><p>



</body>
</html>