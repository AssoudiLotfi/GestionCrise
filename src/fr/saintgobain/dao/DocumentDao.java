package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Document;

public interface DocumentDao {
	
	public void createDocument(Document document);
    public void deleteDocumentById(int id);
    public List<Document> getAllDocument();
    public Document findDocumentById(int id);

}
