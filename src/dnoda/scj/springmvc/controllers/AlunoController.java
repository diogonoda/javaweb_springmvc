package dnoda.scj.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dnoda.scj.springmvc.beans.Student;

@Controller
public class AlunoController {
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String showForm(){
		return "form";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String putStudent(Student student, Model model){
		System.out.println(student);
		
		model.addAttribute("message", "Student " + student.getName() + " successfully added");
		
		return "index";
	}
}
