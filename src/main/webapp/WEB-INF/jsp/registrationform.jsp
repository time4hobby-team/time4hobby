<%--
    Document   : registrationform
    Created on : Jun 20, 2013, 9:53:34 PM
    Author     : Sindhu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div id="login" align="center">
    <form:form method="post" action="signup" commandName="registration">
        <br>
        <table>
            <tr>
                <td align="center">First Name<FONT color="red">*</FONT><FONT color="red"><form:errors path="firstName" /></FONT></td>
            </tr>
            <tr>
                <td><form:input path="firstName" /></td>
            </tr>
            <tr>
                <td><br></td>
            </tr>
            <tr>
                <td align="center">Last Name<FONT color="red">*</FONT> <FONT color="red"><form:errors path="lastName" /></FONT></td>
            </tr>
            <tr>
                <td><form:input path="lastName" /></td>
            </tr>
            <tr>
                <td><br></td>
            </tr>
            <tr>
                <td align="center">Password<FONT color="red">*</FONT><FONT color="red"><form:errors path="password" /></FONT></td>
            </tr>
            <tr>
                <td><form:password path="password" /></td>
            </tr>
            <tr>
                <td><br></td>
            </tr>
            <tr>
                <td align="center">Confirm Password<FONT color="red">*</FONT><FONT color="red"><form:errors path="confirmPassword" /></FONT></td>
            </tr>
            <tr>
                <td><form:password path="confirmPassword" /></td>
            </tr>
            <tr>
                <td><br></td>
            </tr>
            <tr>
                <td align="center">Email<FONT color="red">*</FONT><FONT color="red"><form:errors path="email" /></FONT></td>
            </tr>
            <tr>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td><br></td>
            </tr>
            <tr>
                <td align="center">City<FONT color="red"><form:errors path="city" /></FONT></td>
            </tr>
            <tr>
                <td><form:input path="city" /></td>
            </tr>
            <tr>
                <td><br></td>
            </tr>
            <tr>
                <td align="center"><input type="submit" value="Submit" /></td>
            </tr>
        </table>
    </form:form>
</div>
