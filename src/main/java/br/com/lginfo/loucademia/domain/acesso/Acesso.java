package br.com.lginfo.loucademia.domain.acesso;

import java.time.LocalDateTime;

import br.com.lginfo.loucademia.domain.aluno.Aluno;

public class Acesso {
	private Integer id;
	private Aluno aluno;
	private LocalDateTime entrada;
	private LocalDateTime saida;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public LocalDateTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}

	public LocalDateTime getSaida() {
		return saida;
	}

	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}
}
