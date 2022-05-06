package lv.onlineStore.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lv.onlineStore.demo.service.iMethods;

@Controller
public class FilteringController {
	@Autowired
	private iMethods methodsService;
	
	@GetMapping("/grades/stud/{id}") //localhost:8080/grades/stud/3
	public String getGradesByStudentId(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("object", methodsService.selectAllGradesFromStudentById(id));
		return "grades-page"; //atvers grades page
	}
	
	@GetMapping("/grades/subj/{id}") //localhost:8080/grades/subj/3
	public String getGradesBySubjectId(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("object", methodsService.selectAllGradesFromCourseById(id));
		return "grades-page"; //atvers grades page
	}
	
	@GetMapping("/grades/bad") //localhost:8080/grades/bad
	public String getBadGrades(Model model) {
		model.addAttribute("object", methodsService.selectAllBadGrades());
		return "grades-page"; //atvers grades page
	}
	
	
	
	
}
