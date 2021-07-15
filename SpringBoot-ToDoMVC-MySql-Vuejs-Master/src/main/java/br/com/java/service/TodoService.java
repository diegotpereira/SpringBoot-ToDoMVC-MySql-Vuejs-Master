package br.com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.model.Todo;
import br.com.java.repository.TodoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {

    @Autowired
    private final TodoRepository repository;
    
    

    public TodoService(TodoRepository repository) {
		this.repository = repository;
	}

	public List<Todo> findAll(){
        return repository.findAll();
    }

    public List<Todo> saveAll(List<Todo> todos) {
        return repository.saveAll(todos);
    }
    
}
