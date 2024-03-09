<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Staff Email</title>
</head>
<body>

    <form action="AddstaffEmail" method="post">
    
        Staff First Name          : <input type='text' name='staff_fname' required>
        Staff Last Name          : <input type='text' name='staff_lname' required>
        Staff Email Address : <input type='text' name='staffemail' required>
        <input type='submit' name='addstaff'>
         
    </form>
    
	<%
	    String result = (String)request.getAttribute("result");
	    if (result != null && result.equals("true")) {
	%>
	    <script>alert("successful");</script>
	<%
	    } else if(result != null && result.equals("false")){
	%>
	    <script>alert("error");</script>
	<%
	    }else if(result != null && result.equals("already")){
	%>
		<script>alert("This Email Already Entered");</script>
	<%
	    }
	%>
</body>
</html>