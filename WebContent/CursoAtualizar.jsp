
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>



<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>CURSOS</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Bootstrap theme -->
    <link href="../../dist/css/bootstrap-theme.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">CONTROLE ACADÊMICO</a>
        </div>
        
        <!-- MUDAR DEPOIS -->
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
          <%
          	String usuario = (String) session.getAttribute("user");
          %>
            <li><a>Bem Vindo,</a></li>
            <li><a><%= usuario %></a></li>
            <li></li>
            <li></li>
          </ul>
        </div>
        
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="Cursos.jsp">Cursos <span class="sr-only">(current)</span></a></li>
            <li><a href="Disciplinas.jsp">Disciplinas</a></li>
            <li><a href="#">Turmas</a></li>
            <li><a href="#">Alunos</a></li>
            <li><a href="Professores.jsp">Professores</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Atualizar Curso</h1>
	      <div class="modal-body">
	      <div class="form-group">
	      
	      <% 
	      String id_curso = (String) request.getParameter("id_curso"); 
	      String nome_curso = (String) request.getParameter("nome_curso"); 
	      String tipo_curso = (String) request.getParameter("tipo_curso"); 
	      %>
	      
	        <form class="form-group" action="CursoAtualizarServlet" method="get">
				Id do Curso: <input type="text" class="form-control" name="id_curso" value="<%= id_curso != null ? id_curso : "Erro" %>" readonly="readonly"><br>
				Nome do Curso: <input type="text" class="form-control" name="nome_curso" value="<%= nome_curso != null ? nome_curso : "Erro" %>"> <br>
				Tipo do Curso: <input type="text" class="form-control" name="tipo_curso" value="<%= tipo_curso != null ? tipo_curso : "Erro" %>"> <br>
				<button type="submit" class="btn btn-default">Atualizar</button>
			</form>
			</div>
	      </div>
	      <div class="modal-footer">
	      	<a href="Cursos.jsp">
	        <button type="button" class="btn btn-default">Voltar</button></a>
	      </div>
	    </div>

 </div>
      </div>
      

      
      
    
    <hr class="featurette-divider">
    
    <div class="col-md-10 col-md-offset-2">
      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2017 Desenvolvido por Jaqueline e Vanniery</p>
      </footer>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="js/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>