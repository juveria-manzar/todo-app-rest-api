package com.juveria.rest.webservices.restfulwebservice.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//we don't want to create instances we want spring to manage that
import org.springframework.stereotype.Service;

@Service
public class HardCodedService {
	private static List<Todo> todos=new ArrayList();
	private static int idCounter=0;
	
	static {
		todos.add(new Todo(++idCounter,"juveria","Learn Full Stack",new Date(),false));
		todos.add(new Todo(++idCounter,"juveria","Learn .Net",new Date(),false));
		todos.add(new Todo(++idCounter,"juveria","Learn Redux",new Date(),false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo deleteById(long id) {
		Todo todo=findById(id);
		if(todo==null) return null;
		if(todos.remove(todo)) 
		{
			return todo;
		}
		return null;
	}

	public Todo findById(long id) {
		for(Todo todo: todos) {
			if(todo.getId()==id) {
				return todo;
			}
		}
		return null;
	}
	
	
}
