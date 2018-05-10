
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta charset="utf-8">
<title>Vendor Entry</title>
</head>
<body>
    <div><h2>Vendor Entry</h2></div>
    <div id ="form">
    <form:form modelAttribute="vendor" action="vendor" >
    <fieldset><legend>Vendor Information</legend>
    <label for="vendorName">Vendor Name</label>
    <form:input path="VendorName"/>
    </fieldset>
     </form:form>
     </div>
</body>
</html>
