package com.simpleWebApplication.TODO;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<TODO> list=new ArrayList<>();
	
	static int CountTodo=0;
	static {
		list.add(new TODO(++CountTodo, "pranay", "GymWork",LocalDate.now(), false));
		list.add(new TODO(++CountTodo, "pranay", "ExposeToSunrise",LocalDate.now(), false));
		list.add(new TODO(++CountTodo, "pranay", "BreakFast",LocalDate.now(), false));
	}
	
	public  List<TODO> todoreturn(){
		  return list;
	}

	public List<TODO> findByUsername(String Username) {
		
		return list ;
	}
	
	public void addTodo(String Username,String description,LocalDate targetdate,boolean done){
		  TODO todo =new TODO(++CountTodo,Username,description,targetdate,done);
		  list.add(todo);
		}
	public void DeleteById(int id) {
		
		
		Predicate<? super TODO> predictate= todo->todo.getId()==id;
		list.removeIf(predictate);
	}

	public TODO findById(int id) {
		Predicate<? super TODO> predictate= todo->todo.getId()==id;
		
		TODO todo=list.stream().filter(predictate).findFirst().get();
		
		return todo;
	}

	public void updateTodo(int id,TODO todo) {
		// TODO Auto-generated method stub
		
		DeleteById(id);
		
		list.add(todo);
		
		
	}
	
	

}
