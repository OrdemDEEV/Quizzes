package br.com.ordemdeev.quizzes.alternativa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import br.com.ordemdeev.quizzes.pergunta.Pergunta;

@Entity
@Table(name = "ALTERNATIVA")
public class Alternativa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 953116093518407202L;
	@Id
	@GeneratedValue
	private int codigo;
	private String descricao;
	private double pontos;
	
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JoinColumn(nullable = false)
	private Pergunta pergunta;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((pergunta == null) ? 0 : pergunta.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pontos);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alternativa other = (Alternativa) obj;
		if (codigo != other.codigo)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (pergunta == null) {
			if (other.pergunta != null)
				return false;
		} else if (!pergunta.equals(other.pergunta))
			return false;
		if (Double.doubleToLongBits(pontos) != Double.doubleToLongBits(other.pontos))
			return false;
		return true;
	}
	
	

}
