package pessoa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoOperations;

import pessoa.mongo.Mongo;

public class PessoaKey extends Mongo {

	@Id
	private String id;
	private Long tenant;
	private String email;

	public PessoaKey(MongoOperations mongo) {
		super(mongo);
	}
	
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
