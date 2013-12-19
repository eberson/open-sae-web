package br.org.sae.apresentacao;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;


@Resource
public class ProfessorController {
	@Get
	@Path("/professor/consultar")
	public List consultar() {
		return null;
		
	}

}
