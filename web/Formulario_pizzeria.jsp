<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizzeria</title>
    </head>
    <body>
        <div style="text-align: center">
        <h1>Compra de pizza</h1><br><br>
        <form action="servlet_pizzeria" method="get">
            <label>Tamaño de la pizza : </label><select name="tam">
                <option value="10">Pequeña</option>
                <option value="12">Mediana</option>
                <option value="16">Grande</option>
            </select><br><br>
            <label>Pepinillos </label><input type="checkbox" name="pep" value="Pepinillos"><br><br>
            <label>Champiñones </label><input type="checkbox" name="champ" value="Champi"><br><br>
            <label>Cebolla </label><input type="checkbox" name="cebolla" value="Cebolla"><br><br>
            <input type="submit" value="Comprar pizza">
        </form>
        </div>
    </body>
</html>
