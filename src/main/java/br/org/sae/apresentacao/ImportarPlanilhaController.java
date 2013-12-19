package br.org.sae.apresentacao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.org.sae.service.ImportService;
import br.org.sae.service.RespostaImportService;

@Resource
public class ImportarPlanilhaController {

	private static final String XLSX = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	private static final String XLS = "application/vnd.ms-excel";
	
	@Autowired
	ImportService importService;
	
	@Get
	@Path("/planilha/importar")
	public void index(Result controle) {

	}

	@Post
	@Path("/planilha/importar")
	public RespostaImportService importarPlanilha(String ano, String semestre,
			UploadedFile planilha) {

		String tipoArquivo = planilha.getContentType();

		if (XLSX.equals(tipoArquivo) || XLS.equals(tipoArquivo)) {
			
//			File arquivo = new File("");
//			
//			FileOutputStream fos = new FileOutputStream(arquivo);
//			fos.write(planilha.getFile().);
//			
//			importService.importar(planilha.getFile(), ano, semestre);
//			
			return RespostaImportService.SUCESSO;

		}

		return RespostaImportService.FORMATO_ARQUIVO_INVALIDO;

	}

}
