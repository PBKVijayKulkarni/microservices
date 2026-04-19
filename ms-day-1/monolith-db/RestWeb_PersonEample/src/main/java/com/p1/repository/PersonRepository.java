package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends 
       JpaRepository<Person, Integer>
       {
           List<Person> findAll();
       }
