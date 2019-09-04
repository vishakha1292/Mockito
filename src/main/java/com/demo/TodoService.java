package com.demo;

import java.util.List;

public interface TodoService {
    //Create todoservice stub
    //test todoBusinessimpl using todoservice stub
    public List<String> retrieveTodos(String user);

    void deleteTodo(String todo);

}
