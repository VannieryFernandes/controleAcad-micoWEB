<%@page import="java.util.List"%>
<%@page import="model.Professor"%>
<%@page import="dao.ProfessorDAO"%>

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

    <title>PROFESSORES</title>

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
          <h1 class="page-header">Lista de Professores</h1>
          
          	<% 
			 List<Professor> professoresLista = (List<Professor>) request.getAttribute("professoresLista");
			 String pesquisa = (String) request.getParameter("pesquisa");
			%>

          <div class="form-group"> 
            <form class="form-inline" action="ProfessorListarServlet" method="post">
	              <div class="form-group">
				    <input type="text" name="pesquisa" class="form-control" placeholder="Pesquise o Professor">
				  </div>
            	<button type="submit" class="btn btn-info">Pesquisar</button>
          	  </form>
           
          </div>
          
          <!-- <h2 class="sub-header">Lista de Professores</h2> -->
          
          <br><br><br><br><br>
          
          <p>
          <a href="ProfessorSalvar.jsp">
			<button type="button" class="btn btn-xs btn-success">Adicionar Novo Professor</button></a>
		  </p>


          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Código</th>
                  <th>Nome</th>
                  <th>Senha</th>
                  <th>Area de Atuação</th>
                  <th>Titulação</th>
                  <th>Ações</th>
                </tr>
              </thead>
             <tbody>
             
             <% if(professoresLista == null || professoresLista.isEmpty()){ %>
             
             <%

				ProfessorDAO professorDAO = new ProfessorDAO();
				List<Professor> listaProfessores = professorDAO.getLista("Professor");
				
			 %>
             
              <%
              	for (Professor professor : listaProfessores) {
              %>
              
                <tr>
                  <td><%= professor.getId() %></td>
                  <td><%= professor.getNome() %></td>
                  <td>*****</td>
                  <td><%= professor.getAreaAtuacao() %></td>
                  <td><%= professor.getTitulacao() %></td>
                  <td> 
	                  <p>
	                  	<a href="ProfessorAtualizar.jsp?id_professor=<%= professor.getId()%>&nome_professor=<%= professor.getNome()%>&areaAtuacao_professor=<%= professor.getAreaAtuacao()%>&titulacao_professor=<%= professor.getTitulacao()%>">
				        <button type="button" class="btn btn-xs btn-warning">Alterar</button>
				        </a>
				        <a href="ProfessorExcluirServlet?id_professor=<%= professor.getId() %>">
				        <button type="button" class="btn btn-xs btn-danger">Excluir </button>
				        </a>
				        <button type="button" class="btn btn-xs btn-success">Redefinir Senha </button>
				      </p>
      			  </td>
                </tr>
			  <% } %>
			  <% } else { %>
			   <%
              	for (Professor professor : professoresLista) {
              %>
              
                <tr>
                  <td><%= professor.getId() %></td>
                  <td><%= professor.getNome() %></td>
                  <td>*****</td>
                  <td><%= professor.getAreaAtuacao() %></td>
                  <td><%= professor.getTitulacao() %></td>
                  <td> 
	                  <p>
	                  	<a href="ProfessorAtualizar.jsp?id_professor=<%= professor.getId()%>&nome_professor=<%= professor.getNome()%>&areaAtuacao_professor=<%= professor.getAreaAtuacao()%>&titulacao_professor=<%= professor.getTitulacao()%>">
				        <button type="button" class="btn btn-xs btn-warning">Alterar</button>
				        </a>
				        <a href="ProfessorExcluirServlet?id_professor=<%= professor.getId() %>">
				        <button type="button" class="btn btn-xs btn-danger">Excluir </button>
				        </a>
				        <button type="button" class="btn btn-xs btn-success">Redefinir Senha </button>
				      </p>
      			  </td>
                </tr>
                <% } %>
			  <% } %>
               </tbody>
            </table>
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