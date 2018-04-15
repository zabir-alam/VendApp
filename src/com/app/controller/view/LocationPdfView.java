package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Location;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class LocationPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		List<Location>loclist=(List<Location>) map.get("locList");
		PdfPTable table=new PdfPTable(3);
		table.addCell("Location Id");
		table.addCell("Location Name");
		table.addCell("LocationType");
		for(Location loc:loclist){
			table.addCell(loc.getLocId()+" ");
			table.addCell(loc.getLocName());
			table.addCell(loc.getLocType());
		}
			Paragraph paragraph=new Paragraph("Welcome to Location PDF");
			document.add(paragraph);
			document.add(table);
			
		
		
	}

}
