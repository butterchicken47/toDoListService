package com.example.demo.repository;


import com.example.demo.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TodoRepository
    extends JpaRepository
//        extends PagingAndSortingRepository
<Todo, Long>{

}