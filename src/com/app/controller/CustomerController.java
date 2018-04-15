package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Customer;
import com.app.service.ICustomerService;
import com.app.util.CodeUtil;
import com.app.util.CodecUtil;
import com.app.util.CommonUtil;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerService service;
	@Autowired
	private CodeUtil codeUtil;
	@Autowired
	private CodecUtil codecUtil;
	@Autowired
	private CommonUtil commonUtil;
	
	@RequestMapping("/regCustomer")
	public String showRegPage(ModelMap map){
		//List<Customer>customer=locutil.getAllLocation();
		//map.addAttribute("locList",loc);
		return"customerReg";
	}
	@RequestMapping(value="/insertCustomer",method=RequestMethod.POST)
	public String saveVendor(@ModelAttribute("customer")Customer customer,ModelMap map){
		//generate Pwd and token
		String pwd=codeUtil.getPwd();
		String token=codeUtil.getTocken();
		
		//do Encoading
		String encToken=codecUtil.doEncoding(token);
		String encPwd=codecUtil.doEncoding(pwd);
		
		//set data to customer Object	
		customer.setaccTocken(encToken);
		customer.setPwd(encPwd);
		
		//save data using service
		//service.saveCustomer(customer);
		
		//send email 
		commonUtil.sendEmail(customer.geteMail(), "You are Registered ..", "Customer Registered: "+customer.getcName()+"your pwd is::"+pwd+" Token is::"+token+" type is::"+customer.getcType());
		
		
		
		int cId=0;
		cId=service.saveCustomer(customer);
		String msg="Vendor is saved with Customer ID:::" +cId+" password send to your email";;
		map.addAttribute("message",msg);
		
		return"customerReg";
	}
	
	@RequestMapping("/viewAllCustomer")
	public String viewAllVendor(ModelMap map ){
		
		List<Customer>listCustomer=service.getAllCustomer();
		map.addAttribute("customerList",listCustomer);
		return"customerDetails";
	}
	
	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("custId")int custId){
		//service.deleteVendor(vId);
		
		return"redirect:viewAllCustomer";
	}
	@RequestMapping("/showEditCustomer")
	public String getCustomerById(@RequestParam("custId")int custId,ModelMap map){
	Customer cust=new Customer();
			//ven=service.getVendorById(vId);
			//System.out.println(ven.getvId()+" "+ven.getEmail()+" "+ven.getvName()+" "+ven.getAddress());
		//map.put("ven", ven);
		
		return"custEdit";
	}

	@RequestMapping(value="/updateCustomer", method=RequestMethod.POST)
	public String updateCustomer(@ModelAttribute("customer")Customer cust){
	
		//service.updateVendor(ven);
		
		return"redirect:viewAllCustomer";
	}
	
	@RequestMapping("/custExcelExport")
	public String exportExcel(ModelMap map){
	//	List<Vendor>venList=service.getAllVendor();
		//map.addAttribute("venList",venList);
		return "custExcel";
	}
	@RequestMapping("/custPdfExport")
	public String exportPdf(ModelMap map){
	//	List<Vendor>venList=service.getAllVendor();
	//	map.addAttribute("venList", venList);
		return "custPdf";
		
	}

}
