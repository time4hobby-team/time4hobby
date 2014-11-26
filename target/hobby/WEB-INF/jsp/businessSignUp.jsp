<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div id="login" align="center">
    <c:choose>
        <c:when test="${success}">
            Thank you for submitting your business.
            An email has been sent to your account with the details.
            We will send an email to the registered email once your business is approved.
        </c:when>
        <c:otherwise>
            <form:form method="post" action="/business/signup" commandName="business">
                <br>
                <table>
                    <tr><td align="center"><br><b>-.-.-.-.-------------- Contact Details --------------.-.-.-.-</b></td></tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Name<FONT color="red">*</FONT><FONT color="red"><form:errors path="name" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="name" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Street<FONT color="red">*</FONT><FONT color="red"><form:errors path="street" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="street" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Apt #<FONT color="red">*</FONT><FONT color="red"><form:errors path="aptnumber" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="aptnumber" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">City<FONT color="red"><form:errors path="city" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="city" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">State<FONT color="red">*</FONT><FONT color="red"><form:errors path="state" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="state" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Zip<FONT color="red">*</FONT><FONT color="red"><form:errors path="zip" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="zip" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Country<FONT color="red">*</FONT><FONT color="red"><form:errors path="country" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="country" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Phone<FONT color="red">*</FONT><FONT color="red"><form:errors path="phone" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="phone" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Email<FONT color="red">*</FONT><FONT color="red"><form:errors path="email" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="email" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Password<FONT color="red">*</FONT><FONT color="red"><form:errors path="password" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:password path="password" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Confirm Password<FONT color="red">*</FONT><FONT color="red"><form:errors path="confirmPassword" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:password path="confirmPassword" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr><td align="center"><br><b>-.-.-.-.----------------- Experience -----------------.-.-.-.-</b></td></tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Category<FONT color="red">*</FONT><FONT color="red"><form:errors path="category" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="category" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Specialization<FONT color="red">*</FONT><FONT color="red"><form:errors path="specialization" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="specialization" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Website<FONT color="red"><form:errors path="website" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="website" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Classes Duration<FONT color="red">*</FONT><FONT color="red"><form:errors path="duration" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="duration" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Classes per Week<FONT color="red"><form:errors path="classesperweek" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="classesperweek" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Sample Class<FONT color="red">*</FONT><FONT color="red"><form:errors path="sampleclass" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="sampleclass" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center">Years of Experience<FONT color="red">*</FONT><FONT color="red"><form:errors path="yearsofexperience" /></FONT></td>
                    </tr>
                    <tr>
                        <td align="center"><form:input path="yearsofexperience" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td align="center"><input type="submit" value="Submit" /></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                </table>
            </form:form>
        </c:otherwise>
    </c:choose>
</div>
