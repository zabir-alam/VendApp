package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Location;
import com.app.model.Vendor;

public class VendorExcelView extends AbstractExcelView{

	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook workbook, HttpServletRequest arg2, HttpServletResponse arg3)
			throws Exception {
		//read data from map
		List<Vendor> venList=(List<Vendor>)map.get("venList");
		//create Sheet
		HSSFSheet sheet=workbook.createSheet("Vendor");
		//set header
		setHeaders(sheet);
		//set body
		setBody(sheet, venList);
}
public void setHeaders(HSSFSheet sheet){
HSSFRow row=sheet.createRow(0);
row.createCell(0).setCellValue("Ven Id");
row.createCell(1).setCellValue("Ven Name");
row.createCell(2).setCellValue("Ven Addr");
row.createCell(3).setCellValue("Mobile");
row.createCell(4).setCellValue("Email");
row.createCell(5).setCellValue("Location");
}

public void setBody(HSSFSheet sheet,List<Vendor> venList){
int rowId=1;
for(Vendor ven:venList){
HSSFRow row=sheet.createRow(rowId++);
row.createCell(0).setCellValue(ven.getvId());
row.createCell(1).setCellValue(ven.getvName());
row.createCell(2).setCellValue(ven.getAddress());
row.createCell(3).setCellValue(ven.getMobile());
row.createCell(4).setCellValue(ven.getEmail());
row.createCell(5).setCellValue(ven.getLoc().getLocName());

}
		
	}

}
