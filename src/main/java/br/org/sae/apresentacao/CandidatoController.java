package br.org.sae.apresentacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.org.sae.model.Candidato;
import br.org.sae.service.CandidatoService;


@Resource
public class CandidatoController {

	@Autowired
	private CandidatoService candidatoService;
	
	@Get
	@Path("/candidato/listar")
	public List<Candidato> listar(){
		
		final List<Candidato> candidatos = candidatoService.findAll();
		
		return candidatos;
		
	}
	
	@Post
	@Path("/candidato/pesquisar")
	public List<Candidato> pesquisar(String cpf, String nome, int ano, int semestre){
		return null;
	}
	
}
