package br.com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.java.model.Todo;

public interface TodoRepository  extends JpaRepository<Todo, Long> {
    
}
