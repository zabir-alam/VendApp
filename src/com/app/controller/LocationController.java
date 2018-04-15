package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Location;
import com.app.service.ILocationService;

@Controller
public class LocationController {
	
	@Autowired
	private ILocationService service;
	
	@RequestMapping(value="/locReg")
	public String showPage(){
		
		return"locReg";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String saveLocation(@ModelAttribute("location")Location loc, ModelMap map){
		
		
		int locId=service.saveLocation(loc);
		String msg="Ragistered with id "+locId;
		map.addAttribute("msg", msg);
		return"locReg";
	}
	
	@RequestMapping("/viewLocationDetails")
	public String getAllLocation(ModelMap map){
		List<Location> locList=service.getAllLocation();
		map.addAttribute("allLocObj", locList);
		
		return"locDetails";
	}
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("locId")Integer locId){
		
		service.deleteLocation(locId);
		return "redirect:viewLocationDetails";
	}
	@RequestMapping("/showEditLocation")
	public String showLocationEdit(@RequestParam("locId")int locId, ModelMap map){
		Location loc=new Location();
				loc=service.getLocationById(locId);
				map.addAttribute("locObj",loc);		
		return"locEdit";
	}
		@RequestMapping(value="/updateLoc",method=RequestMethod.POST)
	   public String updateLocation(@ModelAttribute("location")Location loc){
			service.updateLocation(loc);
		   
		   return "redirect:viewLocationDetails";
	   }
		@RequestMapping("/locExcelExport")
		public String exportExcel(ModelMap map){
			List<Location>locList=service.getAllLocation();
			map.addAttribute("locList",locList);
			return "locExcel";
		}
		@RequestMapping("/locPdfExport")
		public String exportPdf(ModelMap map){
			List<Location>locList=service.getAllLocation();
			map.addAttribute("locList", locList);
			return "locPdf";
			
		}
}


