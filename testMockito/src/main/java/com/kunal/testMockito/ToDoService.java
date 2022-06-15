package com.kunal.testMockito;

import java.util.List;

public interface ToDoService {
	
	public List<String> getToDos(String user);
	//public void deleteToDos(String doString);
	public void deleteToDos(String todos);

}
