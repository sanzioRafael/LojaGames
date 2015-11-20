package vo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import vo.enumerado.TipoClassificacao;

@Entity
@SequenceGenerator(initialValue = 1, name = "seq_jogo", sequenceName = "seq_jogo")
public class JogoVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_jogo")
	private Long idJogo;
	
	private String nome;
	private String genero;
	private String imagem;
	private Double preco;

	@Enumerated(EnumType.ORDINAL)
	private TipoClassificacao classificacao;

	public Long getIdJogo() {
		return idJogo;
	}

	public void setIdJogo(Long idJogo) {
		this.idJogo = idJogo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public TipoClassificacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(TipoClassificacao classificacao) {
		this.classificacao = classificacao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idJogo == null) ? 0 : idJogo.hashCode());
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
		JogoVO other = (JogoVO) obj;
		if (idJogo == null) {
			if (other.idJogo != null)
				return false;
		} else if (!idJogo.equals(other.idJogo))
			return false;
		return true;
	}

}
