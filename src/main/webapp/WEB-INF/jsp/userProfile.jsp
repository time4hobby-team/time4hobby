<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div id="textarea1">

    <div id="edit-profile-button">
        <a href="#"><camel><c:out value="${user.firstname}" /></camel> &nbsp;<camel><c:out value="${user.lastname}" /></a></camel>
        <br><br>
        <form method="get" action="/user/editProfile">
            <input type="submit" id="search" value="Edit your profile" />
        </form>
    </div>
        <div id="profile-photo1">
            <!--<img src="${user.image}" align="right" height="150" width="150"/><br>-->
            <form>
                <input type="file" multiple />
                <div class="photos">
                </div>
            </form>

            <script src="static//upload.js"></script>
        </div>

    <br>

    <div id="resultarea1">

        <table>
            <c:choose>
                <c:when test="${empty user.phone}">
                    <tr><td width="60%"><b>Phone:</b></td><td><a href="/user/editProfile"> Enter your phone number </a></td></tr>
                </c:when>
                <c:otherwise>
                    <tr><td width="60%"><b>Phone:</b></td><td><c:out value="${user.phone}" /></td></tr>
                </c:otherwise>
            </c:choose>
            <tr><td width="60%"><b>Email:</b></td><td><c:out value="${user.email}" /></td></tr>
            <c:choose>
                <c:when test="${empty user.address1}">
                    <tr><td width="60%"><b>Address:</b></td><td><a href="/user/editProfile">Enter your street</a></td></tr>
                </c:when>
                <c:otherwise>
                    <tr><td width="60%"><b>Address:</b></td><td><c:out value="${user.address1}," /></td></tr>
                </c:otherwise>
            </c:choose>

            <c:choose>
                <c:when test="${empty user.address2}">
                    <tr><td width="60%"></td><td><a href="/user/editProfile">Enter your apt#</a></td></tr>
                        </c:when>
                        <c:otherwise>
                    <tr><td width="60%"></td><td><c:out value="${user.address2}," /></td></tr>
                        </c:otherwise>
                    </c:choose>

            <c:choose>
                <c:when test="${empty user.city}">
                    <tr><td width="60%"></td><td><a href="/user/editProfile">Enter your city</a></td></tr>
                        </c:when>
                        <c:otherwise>
                    <tr><td width="60%"></td><td><c:out value="${user.city}," /></td></tr>
                        </c:otherwise>
                    </c:choose>

            <c:choose>
                <c:when test="${empty user.state}">
                    <tr><td width="60%"></td><td><a href="/user/editProfile">Enter your state and zip code</a></td></tr>
                        </c:when>
                        <c:otherwise>
                    <tr><td width="60%"></td><td><c:out value="${user.state} ${user.zip}" /></td></tr>
                        </c:otherwise>
                    </c:choose>
        </table>
        <br>
        <br>
        <c:choose>
            <c:when test="${empty user.description}">
                <b>Description:</b><br>
                <a href="/user/editProfile">Describe your interests, hobbies so that we can help you pursue them.</a>
            </c:when>
            <c:otherwise>
                <b>Description:</b><br>
                <c:out value="${user.description}" />
            </c:otherwise>
        </c:choose>
        <br><br>
        <a href="/user/editProfile?business=true"> Want to post your own business?</a>
    </div>
</div>
