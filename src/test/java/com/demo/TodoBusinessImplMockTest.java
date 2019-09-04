package com.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockTest {
    //What is mocking
    //Mocking is creating objects that simulate the behaviour of real objects
    //Unlike stubs mocks can be dynamically created from code at runtime.
    //Mocks offers more functionality then stubbing
    //you can verify method calls and lot other things

    @Test
    public void usingAMock() {

      TodoService todoServiceMock =    mock(TodoService.class);//mock is an method in a mockito to mock class and interface
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> todo= Arrays.asList("Spring season", "Springframework", "Spring boot", "Dummy");
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todo);

        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Dummy");
        assertEquals(3, todos.size());
    }
    }






