<jsp:include page="/cabecalho.jsp"></jsp:include>

<div class="panel panel-default">
	<div class="panel-heading">Lista de Candidatos</div>
	<div class="panel-body">


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
							<button class="btn btn-primary dropdown-toggle" data-toggle="dropdown">Ação <span class="caret"></span></button>
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
							<button class="btn btn-primary dropdown-toggle" data-toggle="dropdown">Ação <span class="caret"></span></button>
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