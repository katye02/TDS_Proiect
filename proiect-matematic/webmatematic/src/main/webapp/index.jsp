<!DOCTYPE html>
<html>
<head>
    <title>Aplicatie Matematica</title>
</head>
<body>

<h2>Aplicatie Matematica</h2>

<form action="evaluare" method="post">

    <label>Tip functie:</label>
    <select name="tip">
        <option value="liniara">Functie liniara</option>
        <option value="patratica">Functie patratica</option>
    </select>

    <br><br>

    a: <input type="text" name="a"><br>
    b: <input type="text" name="b"><br>
    c: <input type="text" name="c">
    <small>(doar pentru patratica)</small>

    <br><br>

    Valori x (separate prin virgula):
    <input type="text" name="valoriX" placeholder="ex: 1,2,3">

    <br><br>

    <button type="submit">Calculeaza</button>

</form>

</body>
</html>
