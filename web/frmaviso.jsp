<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/estilo2.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="cuadro">
            <h1 id="titulo">
                <c:if test="${producto.id == 0}">Nuevo</c:if>
                <c:if test="${producto.id != 0}">Editar</c:if>

                </h1>
                <form action="Inicio" method="post">
                    <hr>
                    <br/><br/>

                    <table>
                        <input type="hidden" name="id" value="${producto.id}"/>
                    <tr>
                        <th id="subtitulo1">Descripcion</th>
                        <th><input type="text" name="descripcion" class="entrada" value="${producto.descripcion}"></th>
                    </tr>
                    <tr>
                        <td id="subtitulo1">Stock</td>
                        <td><input type="text" name="stock" class="entrada"  value="${producto.stock}"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>   <input type="submit" value="Enviar" id="boton"></td>
                    </tr>

                </table>
            </form>
        </div>
    </body>
</html>
