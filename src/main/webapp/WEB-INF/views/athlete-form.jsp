<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<style>
   .error{
        color: red;
        font-style: italic;
        }
</style>
    <title>Athlete Form</title>
</head>
<body>

<h2><i>Athlete form</i></h2>
<form:form action="showAthleteDetails" modelAttribute="athlete">
<label>Name</label>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/>
    <form:select path = "country">
        <form:option label = "IN" value = "INDIA"/>
        <form:option label = "UK" value = "ENGLAND"/>
        <form:option label = "US" value = "USA"/>
    </form:select>

    <form:radiobutton path="rank" label = "Grade 1" value="A"/>
    <form:radiobutton path="rank" label = "Grade 2" value="B"/>
    <br><br>
    <form:checkbox path="tournaments" label="Indian Open Tour" value="Indian Open Tour"/>
    <form:checkbox path="tournaments" label="UK Open Tour" value="UK Open Tour"/>
    <form:checkbox path="tournaments" label="USA Open Tour" value="USA Open Tour"/>

    <input type="submit" value="Enter" />
</form:form>


</body>
</html>
