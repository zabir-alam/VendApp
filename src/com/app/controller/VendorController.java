package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Location;
import com.app.model.Vendor;
import com.app.service.IVendorService;
import com.app.util.CommonUtil;
import com.app.util.LocationUtil;

@Controller
public class VendorController {
	@Autowired
	private LocationUtil locutil;
	@Autowired
	private IVendorService service;
	@Autowired
	private CommonUtil commonsUtil;
	
	//1 show reg page
	@RequestMapping("/regVendor")
	public String showRegPage(ModelMap map){
		List<Location>loc=locutil.getAllLocation();
		map.addAttribute("locList",loc);
		return"venReg";
	}
	//2 save record
	@RequestMapping(value="/insertVendor",method=RequestMethod.POST)
	public String saveVendor(@ModelAttribute("vendor")Vendor ven,@RequestParam("fileObj")CommonsMultipartFile file,ModelMap map){
		//@ModelAttribute("vendor")Vendor ven,ModelMap map,@RequestParam("fileObj")CommonsMultipartFile file
		int vendorID=0;
	
		vendorID=service.saveVendor(ven);
		
		String msg="Vendor is saved with Location ID:::" +vendorID;
		boolean flag=commonsUtil.sendEmail(ven.getEmail(), "Sample Test..", msg,file);
		
		System.out.println(ven.getEmail()+"----------------");
		if(flag)
			msg+=", mail sent";
		else
			msg+=",mail not sent";
		
		map.addAttribute("message",msg);
		
		return"venReg";
	}
	
	//3. view All vendors
	@RequestMapping("/viewAllVendor")
	public String viewAllVendor(ModelMap map ){
		
		List<Vendor>listVendor=service.getAllVendor();
		map.addAttribute("vendorList",listVendor);
		return"venDetails";
	}
	
	//4.delete vendor
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("vId")int vId){
		service.deleteVendor(vId);
		
		return"redirect:viewAllVendor";
	}
	//5.show edit
	@RequestMapping("/showEditVendor")
	public String getviendorByvId(@RequestParam("vId")int vId,ModelMap map){
	Vendor ven=new Vendor();
			ven=service.getVendorById(vId);
			System.out.println(ven.getvId()+" "+ven.getEmail()+" "+ven.getvName()+" "+ven.getAddress());
		map.put("ven", ven);
		
		return"venEdit";
	}

	//6. update vendor
	@RequestMapping(value="/updateVendor", method=RequestMethod.POST)
	public String updateVendor(@ModelAttribute("vendor")Vendor ven){
	
		service.updateVendor(ven);
		
		return"redirect:viewAllVendor";
	}
	
	@RequestMapping("/venExcelExport")
	public String exportExcel(ModelMap map){
		List<Vendor>venList=service.getAllVendor();
		map.addAttribute("venList",venList);
		return "venExcel";
	}
	@RequestMapping("/venPdfExport")
	public String exportPdf(ModelMap map){
		List<Vendor>venList=service.getAllVendor();
		map.addAttribute("venList", venList);
		return "venPdf";
		
	}
}
