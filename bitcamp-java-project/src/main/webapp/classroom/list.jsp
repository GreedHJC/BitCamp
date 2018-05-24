<%@page import="bitcamp.java106.pms.domain.Classroom"%>
<%@page import="java.util.List"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>수업 목록</title>
</head>
<body>
<div id='header'>
<a href='/bitcamp-java-project/auth/login'>로그인</a></div>
<h1>수업 목록(MVC)</h1>
<p><a href='form.html'>새 글</a></p>
<table border='1'>
<tr>
    <th>번호</th><th>제목</th><th>등록일</th>
</tr>
<%
List<Classroom> list = (List<Classroom>)request.getAttribute("list");
for (Classroom classroom : list) {
%>
<tr>
    <td><%=classroom.getNo()%></td>
    <td><a href='view?no=<%=classroom.getNo()%>'><%=classroom.getTitle()%></a></td>
    <td><%=classroom.getStartDate()%>~<%=classroom.getEndDate()%></td>

</tr>
<%}%>
</table>
</body>
</html>