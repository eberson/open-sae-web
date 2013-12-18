package br.org.sae.apresentacao;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.org.sae.service.RespostaService;

@Resource
public class ImportarPlanilhaController {

	@Get
	@Path("/planilha/importar")
	public void index(Result controle) {

	}

	@Post
	@Path("/planilha/importar")
	public RespostaService importarPlanilha(String ano, String semestre,
			UploadedFile planilha) {

		String tipoArquivo = planilha.getContentType();

		if ("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
				.equals(tipoArquivo)
				|| "application/vnd.ms-excel".equals(tipoArquivo)) {
			return RespostaService.SUCESSO;

		}

		return RespostaService.ERRO;

	}

}
