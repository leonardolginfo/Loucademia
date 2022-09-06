package br.com.lginfo.loucademia.domain.aluno;

import java.util.Objects;

public class Estado {
	private String sigla;
	private String nomeEstado;

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	@Override
	public String toString() {
		return "Estado [sigla=" + sigla + ", nomeEstado=" + nomeEstado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(sigla);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(sigla, other.sigla);
	}

}
