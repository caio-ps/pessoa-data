package pessoa.model;


import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import pessoa.digest.MD5;


@Document(collection = "pessoas")
public class Pessoa extends Key {

	private String alias;
	private String senha;
	private String nome;
	private String sobrenome;
	private Date dataNascimento;

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = MD5.digest(senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [getAlias()=" + getAlias() + ", getSenha()="
				+ getSenha() + ", getNome()=" + getNome() + ", getSobrenome()="
				+ getSobrenome() + ", getDataNascimento()="
				+ getDataNascimento() + ", getId()=" + getId() +
				", getTenants()=" + getTenants()
				+ ", getEmail()=" + getEmail() + "]";
	}

}
