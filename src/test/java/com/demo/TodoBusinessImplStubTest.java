package com.demo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
//If we want to add one more test like if service class return null..So to do this
//I have to add logic into my stub class
//If a new method is adding in the interface then you need to create the new method in the stub also
//Dynamic Conditions
//To remove these disadvantages we use mock rather than stub
public class TodoBusinessImplStubTest {

    @Test
    public void usingAStub() {
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Spring");
        assertEquals(3, todos.size());
    }
}