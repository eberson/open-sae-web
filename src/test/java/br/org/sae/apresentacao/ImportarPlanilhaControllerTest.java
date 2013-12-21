package br.org.sae.apresentacao;

import static br.org.sae.service.ImportFileType.XLS;
import static br.org.sae.service.ImportFileType.XLSX;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.caelum.vraptor.interceptor.multipart.UploadedFile;
import br.org.sae.service.ImportService;
import br.org.sae.service.RespostaImportService;

public class ImportarPlanilhaControllerTest {

	@Mock
	private UploadedFile uploadedFileMock;

	@Mock
	private ImportService importServiceMock;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testImportarPlanilhaXLSX(){
		final ImportarPlanilhaController controller = new ImportarPlanilhaController(importServiceMock);
		Mockito.when(uploadedFileMock.getContentType()).thenReturn(XLSX.toString());
		Mockito.when(importServiceMock.importar(XLSX, uploadedFileMock.getFile(), 2013, 1)).thenReturn(RespostaImportService.SUCESSO);
		RespostaImportService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaImportService.SUCESSO, resposta);		
	}
	
	@Test
	public void testImportarPlanilhaXLS(){
		final ImportarPlanilhaController controller = new ImportarPlanilhaController(importServiceMock);
		Mockito.when(uploadedFileMock.getContentType()).thenReturn(XLS.toString());
		Mockito.when(importServiceMock.importar(XLS, uploadedFileMock.getFile(), 2013, 1)).thenReturn(RespostaImportService.SUCESSO);
		RespostaImportService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaImportService.SUCESSO, resposta);		
	}
	
	@Test
	public void testImportarPlanilhaOutroFormato(){
		ImportarPlanilhaController controller = new ImportarPlanilhaController(importServiceMock);
		Mockito.when(uploadedFileMock.getContentType()).thenReturn("image/jpg");
		RespostaImportService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaImportService.ARQUIVO_FORMATO_INVALIDO, resposta);		
	}
	
	@Test
	public void testImportarPlanilhaOutroFormatoDois(){
		ImportarPlanilhaController controller = new ImportarPlanilhaController(importServiceMock);
		Mockito.when(uploadedFileMock.getContentType()).thenReturn("image/png");
		RespostaImportService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaImportService.ARQUIVO_FORMATO_INVALIDO, resposta);		
	}
	@Test
	public void testImportarPlanilhaTextPlain(){
		ImportarPlanilhaController controller = new ImportarPlanilhaController(importServiceMock);
		Mockito.when(uploadedFileMock.getContentType()).thenReturn("text/plain");
		RespostaImportService resposta = controller.importarPlanilha("2013", "1", uploadedFileMock);
		Assert.assertEquals(RespostaImportService.ARQUIVO_FORMATO_INVALIDO, resposta);		
	}
	
	
}
