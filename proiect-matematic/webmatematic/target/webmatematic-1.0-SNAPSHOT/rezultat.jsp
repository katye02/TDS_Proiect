<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="tds.proiect.evaluare.date.RezultatEvaluare" %>

<html>
<head>
    <title>Rezultate evaluare</title>
</head>
<body>

<h2>Rezultate evaluare</h2>

<p>
    <strong>Functie:</strong>
    f(x) = <%= request.getAttribute("functie") %>
</p>

<hr>

<%
    List<RezultatEvaluare> rezultate =
            (List<RezultatEvaluare>) request.getAttribute("rezultate");

    for (RezultatEvaluare r : rezultate) {
%>
    <p>
        x = <%= r.getX() %> → f(x) = <%= r.getValoare() %>
    </p>
<%
    }
%>

<br>
<a href="index.jsp">Inapoi</a>

</body>
</html>
