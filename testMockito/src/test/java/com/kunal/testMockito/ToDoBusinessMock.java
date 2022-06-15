package com.kunal.testMockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class ToDoBusinessMock {

	@Mock
	ToDoService serviceMock;
	
	@InjectMocks
	ToDoBusiness business;
	@Captor
	ArgumentCaptor<String> argumentCaptor;
	
	@Spy
	ArrayList<String> arrayListSpy;
	
	public void deleteToDosusing_BDD() {
		List<String> combinedlist=Arrays.asList("Use Hibernate Java","Use Hibernate Core", "Use Hibernate", "Use Spring MVC");
	//	given(serviceMock.getToDos("dummy")).willReturn(combinedlist);
		
		arrayListSpy.add("Mockito1");
		arrayListSpy.add("Mockito 2");
		
		
		business.deleteToDosNotRelatedToHibernate("dummy");
		
		
		//verify(arrayListSpy).add("Mockito1");
		
	}
}

