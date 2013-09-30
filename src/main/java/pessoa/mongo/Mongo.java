package pessoa.mongo;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.MongoOperations;

public class Mongo {
	
	@Transient
	private MongoOperations mongo;

	public Mongo(MongoOperations mongo) {
		this.mongo = mongo;
	}
	
	public void save() {
		this.mongo.save(this);
	}
	
}
