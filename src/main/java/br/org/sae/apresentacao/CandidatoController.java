package br.org.sae.apresentacao;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.org.sae.model.Candidato;


@Resource
public class CandidatoController {

	@Get
	@Path("/candidato/listar")
	public List<Candidato> listar(){
		return null;
	}
	
}
