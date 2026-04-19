package com.p1.controller;

import com.p1.model.Person;
import java.util.Optional;
import com.p1.serviceimpl.PersonServiceImpl;
//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PersonController 
{
   @Autowired
   PersonServiceImpl ps;

   @GetMapping("/allPersons")
   public List<Person> getAllPersons()
   {
      List<Person> plist;
      plist = ps.getAllPersons();
      return plist;
   }

   @GetMapping("getPerson/{p_id}")
   public Optional<Person> getPersonById(@PathVariable int p_id)
   {
      Optional<Person> pobj;
      pobj= ps.getPersonById(p_id);
      return pobj;
   }

   @PostMapping("insertPerson")
   public void postPerson(@RequestBody Person pobj)
   {
      ps.insertPerson(pobj);
   }

    @DeleteMapping("deletePerson")
    public void deletePerson(@RequestBody Person pobj)
    {
        ps.deletePerson(pobj);
    }

	/*
	 * @PutMapping("updatePerson/pobj") public void putPerson(@RequestBody Person
	 * pobj) { int i=0; //i= ps.upDatePerson(pobj); return;
	 * 
	 * }
	 */
}
