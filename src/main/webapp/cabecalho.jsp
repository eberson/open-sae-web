<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Open-sae</title>
<link rel="stylesheet" href="/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="/css/open-sae.css" />
</head>
<body>

	<img alt="logo-open-sae" src="/img/logo.jpg" class="logo" />

	<nav class="navbar navbar-default" role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">

				<li><a href="/">Início</a></li>

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">CRM <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="/planilha/importar">Importar planilha</a></li>
						<li><a href="/candidato/listar">Consultar candidatos</a></li>
					</ul></li>

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Alunos <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="/aluno/consultar">Consultar</a></li>
					</ul></li>

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Cursos<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Cadastro</a></li>
						<li><a href="#">Consulta</a></li>
					</ul></li>

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Professores <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Cadastro</a></li>
						<li><a href="/professor/consultar">Consulta</a></li>
					</ul></li>

			</ul>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Sair</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</nav>
	
	<div id="conteudo">