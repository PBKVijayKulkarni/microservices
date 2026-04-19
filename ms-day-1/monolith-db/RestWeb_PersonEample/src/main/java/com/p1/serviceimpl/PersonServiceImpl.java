package com.p1.serviceimpl;

import java.util.List;
import java.util.Optional;

import com.p1.model.Person;
import com.p1.repository.PersonRepository;
import com.p1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService
{
   @Autowired
   protected PersonRepository pr;
  
   public List<Person> getAllPersons()
   {
	  List<Person> plist= pr.findAll();
	  return plist;
    }

   public Optional<Person> getPersonById(int p_id)
   {
       Optional<Person> pobj= pr.findById(p_id);
       return pobj;
   }

   public void insertPerson(Person pobj)
   {
      pr.save(pobj);
    }

    public void deletePerson(Person pobj)
    {
        pr.delete(pobj);
    }
   /*public void upDatePerson(int p_id)
   {
       Optional<Person> optPerson = pr.findById(p_id);
       if (optPerson.isPresent())
       {
           Person p_to_Update = Person.get();
           p_to_Update.setPname("optPerson.getPname()");
           p_to_Update.setPcity("");
           p_to_Update.setPsalary(0.00);
           pr.save(p_to_Update); // Save the updated entity
       }
   }*/


}