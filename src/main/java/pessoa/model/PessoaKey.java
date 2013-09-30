package pessoa.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class PessoaKey {

	@Id
	private String id;
	private List<Long> tenants;
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Long> getTenants() {
		if (this.tenants == null) {
			this.tenants = new ArrayList<>();
		}
		return tenants;
	}

	public void setTenant(List<Long> tenants) {
		this.tenants = tenants;
	}
	
	public void addTenant(Long tenant) {
		getTenants().add(tenant); 		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
