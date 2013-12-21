<jsp:include page="/cabecalho.jsp"></jsp:include>

<div class="panel panel-default">
	<div class="panel-heading">Lista de Candidatos</div>
	<div class="panel-body">

		<div class='panel panel-info'>
			<div class='panel-heading'>Pesquisar</div>
			<div class='panel-body'>
			<form>
				<div>
					<label for="cpf">CPF</label><input name="cpf" id="cpf" class="form-control tamanho">
					<label for="nome">Nome</label><input name="nome" id="nome" class="form-control tamanho">
					<label for="semestre">Semestre</label><input name="semestre" id="semestre" class="form-control tamanho">
					<label for="ano">Ano</label><input name="ano" id="ano" class="form-control tamanho">
				</div>
				<div class="right">
					<button class="btn btn-info" name="btnPesquisar" id="btnPesquisar">Pesquisar</button>
					<button class="btn btn-info" name="btnLimpar" id="btnLimpar">Limpar</button>
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