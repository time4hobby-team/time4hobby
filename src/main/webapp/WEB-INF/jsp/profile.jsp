    <%-- 
    Document   : music
    Created on : Mar 30, 2013, 11:09:54 AM
    Author     : spalakod
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:forEach items="${profileResults}" var="current">
    <div id="textarea1">

        <a href="#"> <c:out value="${current.name}" /> </a><br>
        <div id="profile-photo">
            <img src="${current.images}" align="right" height="150" width="150"/><br>
        </div>
        <img src="static/images/star${current.rating}.png" align="left" height="25" width="150" />

        <div id="resultarea1">
            <br><br>
            <table>
            <tr><td><b>Category:</b></td><td><c:out value="${current.category}" /></td></tr>
            <tr><td><b>Specialization:</b></td><td><c:out value="${current.specialization}" /></td></tr>
            <tr><td width="70%"><br><b>--------- Contact Details ---------</b></td></tr>
            <tr><td><b>Phone:</b></td><td><c:out value="${current.phone}" /></td></tr>
            <tr><td><b>Email:</b></td><td><c:out value="${current.email}" /></td></tr>
            <tr><td><b>Address:</b></td><td><c:out value="${current.street}," /></td></tr>
            </tr><td></td><td><c:out value="${current.city}," /></td></tr>
            <tr><td></td><td><c:out value="${current.state} ${current.zip}" /></td></tr>
            <tr><td width="70%"><br><b>------------ Experience ------------</b></td></tr>
            <tr><td><b>Website:</b></td><td><c:out value="${current.website}" /></td></tr>
            <tr><td><b>Class Duration:</b></td><td><c:out value="${current.duration}" /></td></tr>
            <tr><td><b>Classes per Week:</b></td><td><c:out value="${current.classesperweek}" /></td></tr>
            <tr><td><b>Sample Class:</b></td><td><c:out value="${current.sampleclass}" /></td></tr>
            <tr><td><b>Years of Experience :</b></td><td><c:out value="${current.yearsofexperience}" /></td></tr>
       
            </table>
            <br>
             <b>Description:</b></td><br><td><c:out value="${current.description}" />
        </div>
    </div>
</c:forEach>