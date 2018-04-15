package com.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Document;
import com.app.service.IDocumentService;

@Controller
public class DocumentController {
	@Autowired
	private IDocumentService service;
	@RequestMapping("/docReg")
	public String showPage(){
		return "docReg";
	}
	@RequestMapping(value="/doUpload",method=RequestMethod.POST)
	public String saveDocument(@RequestParam("fileId") int fid,@RequestParam("fileData")CommonsMultipartFile cmf)
		{
		if(cmf!=null){
			
			Document doc=new Document();
			doc.setFileId(fid);
			doc.setfName(cmf.getOriginalFilename());
			doc.setFileData(cmf.getBytes());
			service.saveDocument(doc);
		}
		return "redirect:showDoc";
	}
	
	@RequestMapping("/showDoc")
	public String showDoc(ModelMap map){
		List<Object[]>list=service.getAllDocumentAndName();
		map.addAttribute("docList",list);
		
		return "docReg";
	}
	@RequestMapping("/downloadDoc")
	public void downloadDoc(@RequestParam("docId")int docId, HttpServletResponse res){
		
		//read doc from db
		Document doc=service.getDocById(docId);
		
		res.addHeader("Content-Disposition","attachment;filename"+doc.getfName());
		
		//copy data to os
		try {
			FileCopyUtils.copy(doc.getFileData(), res.getOutputStream());
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

}
