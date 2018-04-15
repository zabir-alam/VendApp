package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IDocumentDAO;
import com.app.model.Document;
import com.app.service.IDocumentService;
@Service
public class DocumentServiceImpl implements IDocumentService {
	@Autowired
	private IDocumentDAO dao;

	@Override
	public int saveDocument(Document doc) {
		
		return dao.saveDocument(doc);
	}

	@Override
	public List<Object[]> getAllDocumentAndName() {
		
		return dao.getAllDocumentAndName();
	}
	@Override
	public Document getDocById(int docId) {
		// TODO Auto-generated method stub
		return dao.getDocById(docId);
	}

}
