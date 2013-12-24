<jsp:include page="/cabecalho.jsp"></jsp:include>

<div class="panel panel-default">
	<div class="panel-heading">Lista de Candidatos</div>
	<div class="panel-body">

		<div class='panel panel-info'>
			<div class='panel-heading'>
				<h3 class='panel-title'>
					<a href='#' data-toggle='collapse' data-target='#painel-pesquisa'><span class='glyphicon glyphicon-filter'></a></a>
					Pesquisar
				</h3>
			</div>
			<div class='panel-body collapse in' id='painel-pesquisa'>
			<form method='post'>
				<div class='row'>
					<div class='col-lg-2'>
						<label for="cpf" class='como-bloco'>CPF</label><input name="cpf" id="cpf" class="form-control">
					</div>
					<div class='col-lg-2'>
						<label for="nome">Nome</label><input name="nome" id="nome" class="form-control">
					</div>
					<div class='col-lg-2'>
						<label for="semestre">Semestre</label><input name="semestre" id="semestre" class="form-control">
					</div>
					<div class='col-lg-2'>
						<label for="ano">Ano</label><input name="ano" id="ano" class="form-control">
					</div>
				</div>
				<div class="row margem-top-10">
					<div class='col-lg-1 col-lg-offset-10'>
						<button type="reset" class="btn btn-info" name="btnLimpar" id="btnLimpar">Limpar</button>
					</div>
					<div class='col-lg-1'>
						<button type="submit" class="btn btn-primary" name="btnPesquisar" id="btnPesquisar">Pesquisar</button>
					</div>
				</div>
			</form>
			</div>
		</div>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>CPF</th>
					<th>Nome</th>
					<th>Telefone</th>
					<th>E-mail</th>
					<th>Opções</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>CPF</td>
					<td>Nome</td>
					<td>Telefone</td>
					<td>E-mail</td>
					<td>
						<div class="dropdown">
							<button class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								Ação <span class="caret"></span>
							</button>
							<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
								<li><a href="#">Visualizar</a></li>
								<li><a href="#">Matricular</a></li>
							</ul>
						</div>
					</td>
				</tr>
				<tr>
					<td>CPF</td>
					<td>Nome</td>
					<td>Telefone</td>
					<td>E-mail</td>
					<td>
						<div class="dropdown">
							<button class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								Ação <span class="caret"></span>
							</button>
							<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
								<li><a href="#">Visualizar</a></li>
								<li><a href="#">Matricular</a></li>
							</ul>
						</div>
					</td>
				</tr>
			</tbody>
			<tfoot>
			</tfoot>



		</table>

	</div>
</div>

<jsp:include page="/rodape.jsp"></jsp:include>