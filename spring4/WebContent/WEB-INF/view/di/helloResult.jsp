<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>helloResult.jsp 페이지 입니다.</title>
</head>
<body>
<%
	List<String> name =
		(List<String>)request.getAttribute("nameList");
	out.print("사람수:"+name.size());
%>
${nameList}
</body>
</html>