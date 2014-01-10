package br.org.sae.apresentacao;

import java.util.ArrayList;
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
	@Path("/candidato/pesquisar")
	public List<Candidato> pesquisar(){

		final List<Candidato> candidatos = candidatoService.findAll();

		return candidatos;

	}

	@Post
	@Path("/candidato/pesquisar")
	public List<Candidato> pesquisar(String cpf, String nome){

		//final List<Candidato> candidatos = candidatoService.find(nome, cpf);
		final Candidato candidato = candidatoService.find(cpf);
		
		if(candidato != null){
	
			final List<Candidato> candidatos = new ArrayList<Candidato>();

			candidatos.add(candidato);

			return candidatos;

					
		}
		
		final List<Candidato> candidatos = candidatoService.findAll(nome);
				
		
		return candidatos;
	}

}
