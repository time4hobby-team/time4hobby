<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:choose>
    <c:when test="${!empty categoryResults}">
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
    </c:when>
    <c:when test="${!empty resultsByCity}">
        <c:forEach items="${resultsByCity}" var="current">
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
    <c:when test="${!empty allResults}">
        <c:forEach items="${allResults}" var="current">
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
    <c:when test="${!empty resultsByHobby}">
        <c:forEach items="${resultsByHobby}" var="current">
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
    <c:when test="${!empty resultsbyHobbyAndCity}">
        <c:forEach items="${resultsbyHobbyAndCity}" var="current">
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
           No results found in the are you searched. Please try a different category/city.
    </c:otherwise>
</c:choose>

                    
