package com.app.service;

import java.util.List;

import com.app.model.Document;

public interface IDocumentService {
	public int saveDocument(Document doc);
	public List<Object[]> getAllDocumentAndName();
	public Document getDocById(int docId);

}
