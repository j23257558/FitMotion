<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록[WEB-INF]</title>
</head>
<body>
<%
	List<Map<String,Object>> memList = (List<Map<String,Object>>)request.getAttribute("memberList");
	for(int i=0; i<memList.size();i++){
		out.print(memList.get(i));
	}
%>

${memberList}
</body>
</html>