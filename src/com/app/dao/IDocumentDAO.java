package com.app.dao;

import java.util.List;

import com.app.model.Document;

public interface IDocumentDAO {
	public int saveDocument(Document doc);
	public List<Object[]> getAllDocumentAndName();
	public Document getDocById(int docId);
}
