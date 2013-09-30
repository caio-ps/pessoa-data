package pessoa.model;

import grupo.model.Grupo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import digest.MD5;

@Document(collection = "pessoas")
public class Pessoa extends PessoaKey {

	private String alias;
	private String senha;
	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private List<Grupo> grupos;

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

	public List<Grupo> getGrupos() {
		if (this.grupos == null) {
			this.grupos = new ArrayList<>();
		}
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public void addGrupo(Grupo grupo) {
		getGrupos().add(grupo);
	}

}
