<%-- 
    Document   : hello
    Created on : Jun 17, 2013, 12:59:47 PM
    Author     : Sindhu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
	<h3>Message : ${message}</h3>	
	<h3>Username : ${username}</h3>	
 
	<a href="<c:url value="/j_spring_security_logout" />" > Logout</a>

</body>
