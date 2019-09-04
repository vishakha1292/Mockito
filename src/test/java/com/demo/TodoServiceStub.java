package com.demo;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring boot","learn Spring Framework","Dummy list","Spring learning");
    }

    @Override
    public void deleteTodo(String todo) {

    }
}
