<jsp:include page="/cabecalho.jsp"></jsp:include>

<div class="panel panel-default">
	<div class="panel-heading">Importar Planilha</div>
	<div class="panel-body">

		<form method="POST" action="/planilha/importar" enctype="multipart/form-data">
			<div class="form-group">
				<label class="quebra" for="ano">Ano</label><input type="text"
					name="ano" id="ano" class="form-control tamanho">
			</div>

			<div class="form-group">
				<label class="quebra" for="semestre">Semestre</label><input
					type="text" name="semestre" id="semestre"
					class="form-control tamanho">
			</div>


			<label class="quebra" for="planilha">Planilha</label> <input
				type="file" name="planilha" id="planilha">


			<button type="submit" class="btn btn-primary right">Importar</button>
		</form>

	</div>
</div>



<jsp:include page="/rodape.jsp"></jsp:include>