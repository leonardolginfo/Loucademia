package br.com.lginfo.loucademia.domain.aluno;

import java.util.Objects;

public class Telefone {
	private Integer dddCelular;
	private Integer dddFixo;
	private Integer numCelular;
	private Integer numFixo;

	public Integer getDddCelular() {
		return dddCelular;
	}

	public void setDddCelular(Integer dddCelular) {
		this.dddCelular = dddCelular;
	}

	public Integer getDddFixo() {
		return dddFixo;
	}

	public void setDddFixo(Integer dddFixo) {
		this.dddFixo = dddFixo;
	}

	public Integer getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(Integer numCelular) {
		this.numCelular = numCelular;
	}

	public Integer getNumFixo() {
		return numFixo;
	}

	public void setNumFixo(Integer numFixo) {
		this.numFixo = numFixo;
	}

	@Override
	public String toString() {
		return "Telefone [dddCelular=" + dddCelular + ", dddFixo=" + dddFixo + ", numCelular=" + numCelular
				+ ", numFixo=" + numFixo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dddCelular, dddFixo, numCelular, numFixo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(dddCelular, other.dddCelular) && Objects.equals(dddFixo, other.dddFixo)
				&& Objects.equals(numCelular, other.numCelular) && Objects.equals(numFixo, other.numFixo);
	}

}
