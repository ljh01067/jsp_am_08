<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style type="text/css">
</style>

<div><%=loginedMemberId%>번 회원 로그인 중
</div>
<div><%=loginedMember%></div>

<%
if (isLogined) {
%>
<div>
	<a href="../member/doLogout">로그아웃</a>
</div>
<%
}
%>

<%
if (!isLogined) {
%>
<div>
	<a href="../member/login">로그인</a>
</div>
<%
}
%>