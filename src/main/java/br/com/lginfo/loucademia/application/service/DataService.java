package br.com.lginfo.loucademia.application.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.lginfo.loucademia.domain.aluno.Estado;
import br.com.lginfo.loucademia.domain.aluno.EstadoRepository;
import br.com.lginfo.loucademia.domain.aluno.Aluno.Sexo;
import br.com.lginfo.loucademia.domain.aluno.Aluno.Situacao;

@Stateless
public class DataService {
	
	@EJB
	private EstadoRepository estadoRepository;
	
	public List<Estado> listEstado(){
		return estadoRepository.listEstado();
	}

	public Sexo[] getSexos() {
		return Sexo.values();
	}
	
	public Situacao[] getSituacoes() {
		return Situacao.values();
	}
	
}
