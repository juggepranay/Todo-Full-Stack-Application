package com.simpleWebApplication.TODO;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;


@Controller
@SessionAttributes("uname")
public class TodoController {
	
	private TodoController(TodoService todoService) {
		super();
		this.todoService=todoService;
	}
	
	 private TodoService todoService; 
	 
	@RequestMapping("list-Todo")
	public String listAllTodos(ModelMap model) {
		List<TODO> todos = todoService.findByUsername("in28minitues");
		model.addAttribute("todos",todos);
		return "list-Todo";
		
	}

    @RequestMapping(value="add-todo",method=RequestMethod.GET)
	public String ShowNewtodopage(ModelMap model,HttpSession session) {
    	String Username=(String)session.getAttribute("uname");
    	  TODO todo=new TODO(0,Username,"",LocalDate.now(),false);
    	  model.put("todo",todo);
    	  return "newTodo";
	}
    BindingResult result;
	@RequestMapping(value="add-todo",method=RequestMethod.POST)
	public String ShowNewtodoPost( ModelMap model,  @Valid TODO todo,BindingResult result) {
		
		todoService.addTodo((String)model.get("uname"),todo.getDescription(), LocalDate.now(),false);
		return "redirect:list-Todo";
}
	
	
	@RequestMapping("delete-todo")
	public String DeleteTodos(@RequestParam int id ) {
        todoService.DeleteById(id);
		return "redirect:list-Todo";
		
	}
	
	@RequestMapping(value="update-todo", method=RequestMethod.GET)
	public String updateTodos(@RequestParam int id ,ModelMap model) {
		TODO todo=todoService.findById(id);
        model.addAttribute("todo",todo);
		return "redirect:add-todo";
		
	}
	
	@RequestMapping(value="update-todo", method=RequestMethod.POST)
	public String updateTodopost(@RequestParam int id,ModelMap model,@Valid TODO todo,BindingResult result) {
		
		if(result.hasErrors()) {
			return "add-todo";
		}
		
        todoService.updateTodo(id,todo);
		return "redirect:add-todo";
		
	}
}
