package com.gontuseries.studentadmissioncontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView model = new ModelAndView("AdmissionForm");
		
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String, String> reqPar)
	
 {
		String name = reqPar.get("studentName");
		String hobby = reqPar.get("studentHobby");
		
		ModelAndView model = new ModelAndView("submitAdmissionForm");
		model.addObject("studName", name);
		model.addObject("studHobby", hobby);
		return model;
	}
	

}
