package pessoa.model;

import org.springframework.data.mongodb.core.mapping.Document;

import pessoa.enumeration.TipoContato;

@Document(collection = "contatos")
public class Contato extends Key {

	private TipoContato tipo;
	private String descricao;

	public TipoContato getTipo() {
		return tipo;
	}

	public void setTipo(TipoContato tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
