<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri= "http://www.springframework.org/tags/form" %>

<html>
<head>
  <style>
    .error{
      color:red;
      font-style: italic;
    }
  </style>
    <title>Head To Head Stats</title>
</head>
<body>
<h2>Head To Head Statics</h2>

<form:form action="showPlayerStatsDetails" modelAttribute="playerStats">
  <label>Player1</label>
  <form:input path="player1" />
  <form:errors path="player1" cssClass="error"/>
  <br>
  <label>Player2</label>
  <form:input path="player2" />
  <form:errors path="player2" cssClass="error"/>
  <br>
  <label>Player3</label>
  <form:input path="player3" />
  <form:errors path="player3" cssClass="error"/>

  <br>
  <label>headToHead</label>
  <form:input path="headToHead" />
  <form:errors path="headToHead" cssClass="error"/>


  <input type="submit" value="Enter" />
</form:form>



</body>
</html>
