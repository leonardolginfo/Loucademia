package br.com.lginfo.loucademia.interfaces.shared.web;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.com.lginfo.loucademia.application.service.DataService;
import br.com.lginfo.loucademia.domain.aluno.Aluno.Sexo;
import br.com.lginfo.loucademia.domain.aluno.Aluno.Situacao;
import br.com.lginfo.loucademia.domain.aluno.Estado;

@Named
@ApplicationScoped
public class DataBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private DataService dataService;
	
	public Sexo[] getSexos() {
		return dataService.getSexos();
	}
	
	public Situacao[] getSituacoes() {
		return dataService.getSituacoes();
	}
	
	public List<Estado> getEstado(){
		return dataService.listEstado();
	}

}
