package br.org.sae.apresentacao;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {

	@Get
	@Path("/")
	public void index(Result resultado) {

		resultado.include("mensagem", "mudando essa *");

	}

}
