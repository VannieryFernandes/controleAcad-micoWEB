<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  
  
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
  
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body class="align">

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
        
        
      </div>
    </nav>

  <div class="grid">

    <form action="LoginServlet" method="post" class="form login">

      <header class="login__header">
        <h3 class="login__title">Login</h3>
      </header>

      <div class="login__body">

        <div class="form__field">
          <input type="text" name="username" placeholder="Usuário" required>
        </div>

        <div class="form__field">
          <input type="password" name="password" placeholder="Senha" required>
        </div>

      </div>

      <footer class="login__footer">
        <input type="submit" value="Login">

        <p><span class="icon icon--info">?</span><a href="#">Esqueceu senha?</a></p>
      </footer>

    </form>

  </div>


</body>
  
  
</body>
</html>