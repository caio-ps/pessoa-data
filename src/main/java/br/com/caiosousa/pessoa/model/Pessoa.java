package br.com.caiosousa.pessoa.model;


import java.util.Date;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import br.com.caiosousa.enumeration.Status;
import br.com.caiosousa.pessoa.digest.MD5;
import br.com.caiosousa.pessoa.enumeration.Grupo;



@Document(collection = "pessoas")
public class Pessoa extends Key {

	private String alias;
	private String senha;
	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private Set<Grupo> grupos;
	private Status status;

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

	public Set<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(Set<Grupo> grupos) {
		this.grupos = grupos;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
