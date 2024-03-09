<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>hi</h1>
   <jsp:forward page="../http://localhost:8083/oopproject/WEB-INF/classes/oopproject/ShowStaffEmail" />
   ${requestScope.Staffdetail}
</body>
</html>