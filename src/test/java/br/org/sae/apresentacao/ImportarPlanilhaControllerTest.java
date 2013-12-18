package br.org.sae.apresentacao;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.org.sae.service.RespostaService;

public class ImportarPlanilhaControllerTest {

	private UploadedFile uploadedFileMock;
	
	private static final String XLSX = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	private static final String XLS = "application/vnd.ms-excel";
	
	@Before
	public void setUp(){
		uploadedFileMock = Mockito.mock(UploadedFile.class);
	}
	
	
	
	@Test
	public void testImportarPlanilhaXLSX(){
		
		ImportarPlanilhaController controller = new ImportarPlanilhaController();
		Mockito.when(uploadedFileMock.getContentType()).thenReturn(XLSX);
		RespostaService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaService.SUCESSO, resposta);		
	}
	
	@Test
	public void testImportarPlanilhaXLS(){
		
		ImportarPlanilhaController controller = new ImportarPlanilhaController();
		Mockito.when(uploadedFileMock.getContentType()).thenReturn(XLS);
		RespostaService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaService.SUCESSO, resposta);		
	}
	
	@Test
	public void testImportarPlanilhaOutroFormato(){
		
		ImportarPlanilhaController controller = new ImportarPlanilhaController();
		Mockito.when(uploadedFileMock.getContentType()).thenReturn("image/jpg");
		RespostaService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaService.ERRO, resposta);		
	}
	
	@Test
	public void testImportarPlanilhaOutroFormatoDois(){
		
		ImportarPlanilhaController controller = new ImportarPlanilhaController();
		Mockito.when(uploadedFileMock.getContentType()).thenReturn("image/png");
		RespostaService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaService.ERRO, resposta);		
	}
	@Test
	public void testImportarPlanilhaTextPlain(){
		
		ImportarPlanilhaController controller = new ImportarPlanilhaController();
		Mockito.when(uploadedFileMock.getContentType()).thenReturn("text/plain");
		RespostaService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaService.ERRO, resposta);		
	}
	
	
}
