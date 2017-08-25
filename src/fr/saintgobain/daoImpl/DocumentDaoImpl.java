package fr.saintgobain.daoImpl;

import java.util.List;

import fr.saintgobain.dao.DocumentDao;
import fr.saintgobain.entities.Document;
import fr.saintgobain.repositories.DocumentRepository;

public class DocumentDaoImpl implements DocumentDao{
	
	private DocumentRepository documentRepository;

	/**
	 * 
	 * @return the Document List
	 */
	public List<Document> getAllDocument() {
		return documentRepository.findAll();
	}

	/**
	 * create Document
	 */
	public void createDocument(Document document) {
		documentRepository.save(document);
	}

	/**
	 * find Document by id
	 */
	@Override
	public Document findDocumentById(int id) {
		Document document = documentRepository.findOne(id);
		return document;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Document
	 */
	@Override
	public void deleteDocumentById(int id) {
		documentRepository.delete(id);

	}

	// getter
	public DocumentRepository getDocumentRepository() {
		return documentRepository;
	}

	// setter
	public void setDocumentRepository(DocumentRepository documentRepository) {
		this.documentRepository = documentRepository;
	}

}
