<%--
    Document   : music
    Created on : Mar 30, 2013, 11:09:54 AM
    Author     : spalakod
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<form method="get" action="/category/dance" >
    &nbsp;&nbsp;Category:<font color="blue"> Dance </font>  &nbsp;&nbsp;&nbsp;&nbsp; Specialization:&nbsp;&nbsp;

    <c:if test="${not empty selected_spec}">
        <c:set var="spec" value="${selected_spec}" />
    </c:if>
    <select name='specialization' style="color:blue;" size="1" onchange='this.form.submit();' >
        <option value="All" ${spec == 'All' ? 'selected' : ''} > All</option>
        <option value="Vocal" ${spec == 'Vocal' ? 'selected' : ''} > Vocal</option>
        <option value="Piano" ${spec == 'Piano' ? 'selected' : ''}> Piano</option>
        <option value="Guitar" ${spec == 'Guitar' ? 'selected' : ''}> Guitar</option>
        <option value="Trumpet" ${spec == 'Trumpet' ? 'selected' : ''}> Trumpet</option>
    </select>
    <input type="hidden" id="category" name="category" value="music">
</form>
<br>
<c:choose>
    <c:when test="${!empty specResults}">
        <c:forEach items="${specResults}" var="current">
            <div id="textarea1">
                <img src="static/images/star${current.rating}.png" class="floatright1" height="25" width="150" />

                <img src="${current.images}" class="floatleft" height="128" width="128"/>

                <div id="resultarea">

                    <a href="#"> <c:out value="${current.name}" /> </a>
                    <br/>
                    <c:out value="${current.category}" />
                    <br/>
                    <c:out value="${current.specialization}" />
                    <br/>
                    <c:out value="${current.state}" />
                    <br/>
                </div>
            </div>

        </c:forEach>
    </c:when>
    <c:otherwise>
        <c:forEach items="${categoryResults}" var="current">
            <div id="textarea1">
                <img src="static/images/star${current.rating}.png" class="floatright1" height="25" width="150" />

                <img src="${current.images}" class="floatleft" height="128" width="128"/>

                <div id="resultarea">

                    <a href="#"> <c:out value="${current.name}" /> </a>
                    <br/>
                    <c:out value="${current.category}" />
                    <br/>
                    <c:out value="${current.specialization}" />
                    <br/>
                    <c:out value="${current.state}" />
                    <br/>
                </div>
            </div>
        </c:forEach>
    </c:otherwise>
</c:choose>


