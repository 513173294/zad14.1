<%--
  Created by IntelliJ IDEA.
  User: Waleria Waśko
  Date: 2018-07-05
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kalkulator</title>
</head>
<body>
<h1>Przelicznik metryczny</h1>
<form method="post" action="policzOdleglosc">
    <input type="text" name="metry">        <-- metry<br>
    <input type="text" name="centymetry">   <-- centymetry<br>
    <input type="text" name="milimetry">    <-- milimetry<br>

    <input type="submit" value="Przelicz">
    </form>
    <h1>Przelicznik wag</h1>
    <form method="post" action="policz">
    <input type="text" name="kilogramy">    <--- kilogramy<br>
    <input type="text" name="gramy">        <--- gramy<br>
    <input type="text" name="miligramy">    <---miligramy<br>

    <input type="submit" value="Przelicz">
    </form>

</body>
</html>
