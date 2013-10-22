package br.com.caiosousa.pessoa.model;

import org.springframework.data.annotation.Id;

public class Key {

	@Id
	private String id;
	private Long tenant;
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getTenant() {
		return tenant;
	}

	public void setTenant(Long tenant) {
		this.tenant = tenant;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
