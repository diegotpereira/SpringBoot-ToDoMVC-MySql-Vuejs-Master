package br.com.java.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.java.model.Todo;
import br.com.java.service.TodoService;

import javax.validation.Valid;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/v1/todos")
@Slf4j
public class TodoAPI {
	Logger logger = LoggerFactory.getLogger(TodoAPI.class);
    private TodoService stockService;

    public TodoAPI(TodoService stockService) {
        this.stockService = stockService;
    }

    @Autowired
    public void TodoApi(TodoService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public ResponseEntity<List<Todo>> findAll() {
        
        return ResponseEntity.ok(stockService.findAll());
    }

    @PostMapping
    public ResponseEntity saveAll(@Valid @RequestBody List<Todo> todos) {
    	logger.info(todos.toString());

        return ResponseEntity.ok(stockService.saveAll(todos));
    }
}
