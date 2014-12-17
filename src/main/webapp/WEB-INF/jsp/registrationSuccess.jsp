<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<h3>Welcome Registration Successfully.</h3>
<table>
<tr>
<td>First Name :</td>
<td><core:out value="${registration.firstName}" /></td>
</tr>
<tr>
<td>Password :</td>
<td><core:out value="${registration.password}" /></td>
</tr>
</table>
