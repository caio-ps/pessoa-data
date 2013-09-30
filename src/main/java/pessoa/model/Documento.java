package pessoa.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "documentos")
public abstract class Documento extends Key {
	
	public abstract String getDescricao();
	
}
