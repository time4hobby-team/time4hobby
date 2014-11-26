<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div id="textarea1">
    Upload your photo :<br>
    <div id="profile-photo2">
        <img src="${user.image}" align="right" height="150" width="150"/><br>
    </div>

    <div id="editphoto">
        <form:form method="POST" commandName="fileUploadForm"
                   enctype="multipart/form-data">

            <form:errors path="*" cssClass="errorblock" element="div" />

            <br>
            <input type="file"/>
            <br>
            <br>
            <input type="submit" value="upload" />
            <span><form:errors path="file" cssClass="error" />
            </span>

        </form:form>
    </div>

    <p id="demo"></p>
    <form:form action="editProfile" commandName="user" method="post" id="userform">
        <div id="resultarea1">
            <table width="70%">
                <tr>
                    <td><b>First Name:</b></td>
                    <td><form:input path="firstname" /></td>
                </tr>
                <tr>
                    <td><b>Last Name:</b></td>
                    <td><form:input path="lastname" /></td>
                </tr>
                <tr>
                    <td><b>Phone:</b></td>
                    <td><form:input path="phone" /></td>
                </tr>
                <tr>
                    <td><b>Email:</b></td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td width="60%"><b>Street:</b></td>
                    <td><form:input path="address1"/></td>
                </tr>
                <tr>
                    <td><b>Apt #:</b></td>
                    <td><form:input path="address2" /></td>
                </tr>
                <tr>
                    <td><b>City:</b></td>
                    <td><form:input path="city" /></td>
                </tr>
                <tr>
                    <td><b>State:</b></td>
                    <td><form:input path="state" /></td>
                </tr>
                <tr>
                    <td><b>Zip:</b></td>
                    <td><form:input path="zip" /></td>
                </tr>
                <tr>
                    <td><b>Describe yourself:&nbsp;</b></td>
                    <td><br><form:textarea path="description" cols="35" rows="3" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <br>
                        <div id="aligncenter">
                            <input type="submit" value="Submit"/>
                        </div>
                    </td>
                </tr>
            </table>
        </div>
    </form:form>

</div>
