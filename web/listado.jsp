<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/estilo1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="cuadro">
            <p id="titulo">Productos</p>
            <hr>
            <br/>
            <p><a id="forma3" href="Inicio?action=add" >Nuevo producto</a></p>
            <br/>
            <table border="1">

                <tr>
                    <th id="forma">Id</th>
                    <th id="forma">Descripcion</th>
                    <th id="forma">Stock</th>
                    <th></th>
                    <th></th>

                </tr>

                <c:forEach var="item" items="${productos}">
                    <tr> 
                        <td id="forma1">${item.id}</td>
                        <td id="forma1">${item.descripcion}</td>
                        <td id="forma1">${item.stock}</td>
                        <td id="forma2"><a id="forma2" href="Inicio?action=edit&id=${item.id}">Editar</a></td>
                        <td id="forma2"><a id="forma2" href="Inicio?action=delete&id=${item.id}" onclick="return(confirm
                                    ('Esta seguro de eliminar??'))">Eliminar</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
