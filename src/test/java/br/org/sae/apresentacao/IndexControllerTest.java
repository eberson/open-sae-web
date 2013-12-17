package br.org.sae.apresentacao;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.vraptor.util.test.MockResult;

/**
 * Teste para o IndexController
 * 
 * @author Lázaro
 */
public class IndexControllerTest {

	@Test
	public void testIndex(){
		
		MockResult resultado = new MockResult();
		IndexController controller = new IndexController();
		controller.index(resultado);
		String mensagem = resultado.included("mensagem");
		Assert.assertEquals(mensagem, "Bem vindo ao Open-SAE!");
		
	}
	
}
