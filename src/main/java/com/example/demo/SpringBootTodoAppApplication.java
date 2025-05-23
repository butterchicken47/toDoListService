package com.example.demo;

import com.example.demo.domain.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootTodoAppApplication implements CommandLineRunner
{
	@Autowired
	public TodoRepository todoRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTodoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Todo test=Todo.builder().id(10).completed("its completed").todoItem("python ML").build();
		System.out.println(test.toString());
		List<Todo> todos = Arrays.asList(new Todo("Learn Spring" , "Yes"), new Todo("Learn Driving", "No"), new Todo("Go for a Walk", "No"), new Todo("Cook Dinner", "Yes"));
		todos.forEach(todoRepository::save);

	}
}