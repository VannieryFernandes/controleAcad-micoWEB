
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

    <title>PROFESSOR</title>

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
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
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
            <li><a href="Cursos.jsp">Cursos</a></li>
            <li><a href="Disciplinas.jsp">Disciplinas</a></li>
            <li><a href="#">Turmas</a></li>
            <li><a href="#">Alunos</a></li>
            <li class="active"><a href="Professores.jsp">Professores <span class="sr-only">(current)</span></a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Atualizar Professor</h1>
	      <div class="modal-body">
	      <div class="form-group">
	      
	      <% 
	        String id_professor = request.getParameter("id_professor");
			String nome_professor = request.getParameter("nome_professor");
			String areaAtuacao_professor = request.getParameter("areaAtuacao_professor");
			String titulacao_professor = request.getParameter("titulacao_professor");
		  %>
		  
	      
	        <form class="form-group" action="ProfessorAtualizarServlet" method="post">
				Id do Professor: <input type="text" class="form-control" name="id_professor" value="<%= id_professor != null ? id_professor : "Erro" %>" readonly="readonly"><br>
				Nome do Professor: <input type="text" class="form-control" name="nome_professor" value="<%= nome_professor != null ? nome_professor : "Erro" %>"> <br>
				Area de Atuação do Professor: <input type="text" class="form-control" name="areaAtuacao_professor" value="<%= areaAtuacao_professor != null ? areaAtuacao_professor : "Erro" %>"> <br>
				Titulação do Professor: <input type="text" class="form-control" name="titulacao_professor" value="<%= titulacao_professor != null ? titulacao_professor : "Erro" %>"> <br>
				<button type="submit" class="btn btn-default">Atualizar</button>
			</form>
			</div>
	      </div>
	      <div class="modal-footer">
	      	<a href="Professores.jsp">
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