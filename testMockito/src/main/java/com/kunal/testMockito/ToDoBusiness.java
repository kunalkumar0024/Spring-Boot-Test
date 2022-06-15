package com.kunal.testMockito;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {
	
	public ToDoService doService;
	 public ToDoBusiness(ToDoService doService) {
		 this.doService=doService;
	 }
	 
	 public List<String> getToDosForHibernate(String user){
		 List<String> hibernatelist=new ArrayList<>();
		 List<String> Combinedlist=doService.getToDos(user);
		 
		 for(String todo:Combinedlist) {
			 if(todo.contains("Hibernate")) {
				 hibernatelist.add(todo);
			 }
		 }
		 return hibernatelist;
	 }
	 
	 public void deleteToDosNotRelatedToHibernate(String user) {
		 List<String> Combinedlist=doService.getToDos(user);
		 
		 for(String todos:Combinedlist) {
			 if(!todos.contains("Hibernate")) {
				 doService.deleteToDos(todos);
			 }
		 }
	 }

}
