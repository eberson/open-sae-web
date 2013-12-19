package br.org.sae.apresentacao;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

@Resource
public class AlunoController {

	@Get
	@Path("/aluno/consultar")
	public List consultar() {
		return null;
	}

}
