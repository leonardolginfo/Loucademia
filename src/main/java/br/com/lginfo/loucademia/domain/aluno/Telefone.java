package br.com.lginfo.loucademia.domain.aluno;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telefone implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "CELULAR_DDD", nullable = false, length = 2)
	private Integer dddCelular;

	@Column(name = "FIXO_DDD", nullable = true, length = 2)
	private Integer dddFixo;

	@Column(name="CELULAR_NUMERO", nullable = false, length = 9)
	private Integer numCelular;
	
	@Column(name="FIXO_NUMERO", nullable = true, length = 9)
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
