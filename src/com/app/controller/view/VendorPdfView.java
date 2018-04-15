package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Location;
import com.app.model.Vendor;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class VendorPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document,
			PdfWriter arg2, HttpServletRequest arg3, HttpServletResponse arg4)
			throws Exception {
		List<Vendor>venlist=(List<Vendor>) map.get("venList");
		PdfPTable table=new PdfPTable(6);
		table.addCell("Vendor Id");
		table.addCell("Vendor Name");
		table.addCell("Address");
		table.addCell("Mobile");
		table.addCell("Email");
		table.addCell("Location");
		for(Vendor ven:venlist){
			table.addCell(ven.getvId()+"");
			table.addCell(ven.getvName());
			table.addCell(ven.getAddress());
			table.addCell(ven.getMobile());
			table.addCell(ven.getEmail());
			table.addCell(ven.getLoc().getLocName());
		}
			Paragraph paragraph=new Paragraph("Welcome to Vendor PDF");
			document.add(paragraph);
			document.add(table);
		
		
	}

}
