package br.org.sae.apresentacao;

import static br.org.sae.service.ImportFileType.XLS;
import static br.org.sae.service.ImportFileType.XLSX;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.org.sae.service.ImportFileType;
import br.org.sae.service.ImportService;
import br.org.sae.service.RespostaImportService;

@Resource
public class ImportarPlanilhaController {

	private ImportService importService;
	
	@Autowired
	public ImportarPlanilhaController(final ImportService importService){
		this.importService = importService;
	}
	
	@Get
	@Path("/planilha/importar")
	public void index(Result controle) {

	}

	@Post
	@Path("/planilha/importar")
	public RespostaImportService importarPlanilha(final String ano, final String semestre, final UploadedFile planilha) {

		try{
			final ImportFileType tipo = ImportFileType.from(planilha.getContentType());
			
			if (XLS.equals(tipo) || XLSX.equals(tipo)) {
				return importService.importar(tipo, planilha.getFile(), Integer.valueOf(ano), Integer.valueOf(semestre));
			}else{
				return RespostaImportService.ARQUIVO_FORMATO_INVALIDO;
			}
		}catch(IllegalArgumentException iae){
			return RespostaImportService.ARQUIVO_FORMATO_INVALIDO;
		}catch(Exception e){
			e.printStackTrace();			
			return RespostaImportService.ERRO_DESCONHECIDO;
		}
		
	}
	
}