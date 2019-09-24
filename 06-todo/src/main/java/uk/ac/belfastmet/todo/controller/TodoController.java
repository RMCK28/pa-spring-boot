package uk.ac.belfastmet.todo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.todo.service.TodoService;

@Controller
@RequestMapping
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	@GetMapping()
	public String homePage() {

		return "index";
	}

	@GetMapping("/firstlist")
	public String firstListPage(Model model) {

		todoService.getNumberOfTasks();
		
		model.addAttribute("iterator.hasNext");
		return "iterator"; 

		// TodoService todoService = new TodoService();
		//model.addAttribute("pageTitle", "First List");
		//model.addAttribute("firstList");
		//model.addAttribute("description", "this is a description");
		//model.addAttribute("status", "this is the status");
		//model.addAttribute("name", "this is the name ");
		//model.addAttribute("user", "this is the username");
		//model.addAttribute("priority", "this is the priority");
		//return "firstList";
	}

	@GetMapping("/secondlist")
	public String secondListPage(Model model) {
		
todoService.getNumberOfTasks();
		
		model.addAttribute("iterator.hasNext");
		return "iterator"; 

		// TodoService todoService = new TodoService();
		//model.addAttribute("pageTitle", "Second List");
		//model.addAttribute("secondList");
		//model.addAttribute("description", "this is a description");
		//model.addAttribute("status", "this is the status");
		//model.addAttribute("name", "this is the name ");
		//model.addAttribute("user", "this is the username");
		//model.addAttribute("priority", "this is the priority");
		//return "secondList";

	}

	@GetMapping("/thirdList")
	// the third list page doesn't show up on the website on index, firstlist or
	// secondlist pages
	public String thirdListPage(Model model) {
		// TodoService todoService = new TodoService();
		ArrayList taskList = todoService.getList();
		model.addAttribute("taskList", taskList);
		return "thirdList";

	}
}
