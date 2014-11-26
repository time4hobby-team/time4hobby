<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body onload='document.f.j_username.focus();'>

    <div id="login" align="center">
        <br>
        <b>----- LOGIN ----- </b><br/><br>


        <c:if test="${not empty error}">
            <div class="errorblock">
                ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}<br/>
                Please try again
            </div>
        </c:if>

        <form name='f' action="<c:url value='j_spring_security_check'/>" method='POST'>
            Email address<br/>
            <input type='text' name='j_username' value=''><br/><br/>
            Password<br/>
            <input type='password' name='j_password'/><br/><br/>

            <input name="submit" type="submit" value="Login"/>
            <input name="reset" type="reset" value="Reset"/>
            <br/><br/>

        </form>
    </div>
</body>