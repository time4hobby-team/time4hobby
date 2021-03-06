<!-- outer wrapper for the body content -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="ChooseBox">
    <form method="get" action="/results">
        <div>
              &nbsp;&nbsp;Explore your Hobby: &nbsp;&nbsp;
            <select name="hobby" id="optionSetting" size="1">
                <option value="All Categories">All Categories</option>
                <option value="Music">Music</option>
                <option value="Dance">Dance</option>
                <option value="Knitting">Knitting</option>
                <option value="Cooking">Cooking</option>
                <option value="Swimming">Swimming</option>
                <option value="Sculpting">Sculpting</option>
                <option value="Art">Art</option>
                <option value="Sewing">Sewing</option>
                <option value="Glass Blowing">Glass Blowing</option>
                <option value="Yoga">Yoga</option>
                <option value="Photography">Photography</option>
                <option value="Martial Arts">Martial Arts</option>
                <option value="Sports">Sports</option>
            </select> &nbsp;&nbsp;Near:&nbsp;&nbsp; <input type="text"
                                                           id="inputSetting" name="city" size="45" maxlength="55" />
            &nbsp;&nbsp; <input type="submit" id="search" value="Search " />
        </div>
    </form>
</div>

<!-- positioning all elements at the center of the screen -->
<div id="outer">

    <div id="pagecontent">
        <!-- list of menu items -->
        <div id="nav">
            <ul>
                <li class="first"><a href="/index">Home</a></li>
                <li><a href="#">Hobbies</a></li>
                <li><a href="#">Weekly Schedule</a></li>
                <li><a href="#">My Review</a></li>
                  <c:choose>
                        <c:when test="${!empty loggedUser}">
                        <li><a href="/user/profile">My Profile</a></li>
                        </c:when>
                        <c:otherwise>
                        <li><a href="/login">My Profile</a></li>
                        </c:otherwise>
                    </c:choose>
                <li class="last"><a href="#">Contact Us</a></li>
            </ul>
            <br class="clear" />
        </div>


