<jsp:include page="/cabecalho.jsp"></jsp:include>

<div class="panel panel-default">
	<div class="panel-heading">Importar Planilha</div>
	<div class="panel-body">

		<form method="POST" action="/planilha/importar"
			enctype="multipart/form-data" id="formPlanilha">

			<div class="row">
				<div class='col-lg-2'>
					<label class="como-bloco" for="ano">Ano</label> 
					<input type="text" name="ano" id="ano" class="form-control">
				</div>
				<div class='col-lg-2'>
					<label class="como-bloco" for="semestre">Semestre</label>
					<input type="text" name="semestre" id="semestre" class="form-control">
				</div>
				<div class='col-lg-3'>
					<label class="como-bloco" for="planilha">Planilha</label>
					<input type="file" name="planilha" id="planilha" />
				</div>
			</div>

			<div class="row margem-top-10">
				<div class="col-lg-1 col-lg-offset-11">
					<button type="button" class="btn btn-primary"
						onclick="importacaoAjax()">Importar</button>
				</div>
			</div>
			
		</form>

		<div class="row margem-top-20 hidden" id="linha-progress-bar">
		<div class="progress progress-striped active col-lg-10 col-lg-offset-1">
			<div class="progress-bar progress-bar-info" id="progressoEnvio"
				role="progressbar" aria-valuenow="0" aria-valuemin="0"
				aria-valuemax="100">
				<span class="sr-only"></span>
			</div>
		</div>
		</div>

	</div>
</div>

<jsp:include page="/rodape.jsp"></jsp:include>

<script>
	function importacaoAjax() {

		$("#linha-progress-bar").removeClass("hidden");
		$("#progressoEnvio").css("width", 0);
		$("#progressoEnvio").attr("aria-valuenow", 0);

		dados = new FormData($("#formPlanilha")[0]);
		xhr = new XMLHttpRequest();
		xhr.upload.addEventListener('progress', function() {
			var porcentagem = 0;
			var posicao = event.loaded || event.position;
			var total = event.total;
			if (event.lengthComputable) {
				porcentagem = Math.ceil(posicao / total * 100);
			}
			porcentagemString = porcentagem + "%";
			$("#progressoEnvio").css("width", porcentagemString);
			$("#progressoEnvio").attr("aria-valuenow", porcentagem);
		});
		xhr.open("POST", $("#formPlanilha")[0].action);
		xhr.send(dados);
		xhr.onreadystatechange = function() {
			if (this.status == 200 && this.readyState == 4) {
				$("#conteudo").html(xhr.responseText);
			}
		}
	}
</script>
