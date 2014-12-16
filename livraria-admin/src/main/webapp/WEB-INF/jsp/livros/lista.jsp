<%-- 
    Document   : lista
    Created on : Dec 16, 2014, 8:17:54 PM
    Author     : nogsantos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Lista de Livros</h3>
        <ul>
            <c:forEach items="${livroList}" var="livro">
                <li>
                    ${livro.titulo} - ${livro.descricao}
                    <a href="${linkTo[LivrosController].edita}">Modificar</a>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
