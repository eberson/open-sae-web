package br.org.sae.apresentacao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.org.sae.service.ImportService;
import br.org.sae.service.RespostaImportService;

public class ImportarPlanilhaControllerTest {

	private UploadedFile uploadedFileMock;
	private ImportService importServiceMock;
	
	
	private static final String XLSX = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	private static final String XLS = "application/vnd.ms-excel";
	
	@Before
	public void setUp(){
		uploadedFileMock = Mockito.mock(UploadedFile.class);
		importServiceMock = Mockito.mock(ImportService.class);
	}
	
	@Test
	public void testImportarPlanilhaXLSX(){
		ImportarPlanilhaController controller = new ImportarPlanilhaController();
		Mockito.when(uploadedFileMock.getContentType()).thenReturn(XLSX);
		RespostaImportService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaImportService.SUCESSO, resposta);		
	}
	
	@Test
	public void testImportarPlanilhaXLS(){
		
		ImportarPlanilhaController controller = new ImportarPlanilhaController();
		Mockito.when(uploadedFileMock.getContentType()).thenReturn(XLS);
		RespostaImportService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaImportService.SUCESSO, resposta);		
	}
	
	@Test
	public void testImportarPlanilhaOutroFormato(){
		
		ImportarPlanilhaController controller = new ImportarPlanilhaController();
		Mockito.when(uploadedFileMock.getContentType()).thenReturn("image/jpg");
		RespostaImportService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaImportService.FORMATO_ARQUIVO_INVALIDO, resposta);		
	}
	
	@Test
	public void testImportarPlanilhaOutroFormatoDois(){
		
		ImportarPlanilhaController controller = new ImportarPlanilhaController();
		Mockito.when(uploadedFileMock.getContentType()).thenReturn("image/png");
		RespostaImportService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaImportService.FORMATO_ARQUIVO_INVALIDO, resposta);		
	}
	@Test
	public void testImportarPlanilhaTextPlain(){
		
		ImportarPlanilhaController controller = new ImportarPlanilhaController();
		Mockito.when(uploadedFileMock.getContentType()).thenReturn("text/plain");
		RespostaImportService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaImportService.FORMATO_ARQUIVO_INVALIDO, resposta);		
	}
	
	
}
