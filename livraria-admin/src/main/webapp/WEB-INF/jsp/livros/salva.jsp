
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Livro adicionado com sucesso!</h1>
        <p>Veja aqui a
            <a href="${linkTo[LivrosController].lista}">
                lista de todos os livros
            </a>
        </p>
    </body>
</html>
