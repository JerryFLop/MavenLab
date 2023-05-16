package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    @Test
    public void testAdd (){

      People people = new People();
    Person person1 = new Person(768,"linking");
     people.add(person1);

     List<Person> person = new ArrayList<>();
        person.add(person1);

        Assert.assertEquals(person.contains(person1),people.contains(person1));
    }
@Test
    public void testRemove(){

    People people = new People();
    Person person1 = new Person(768,"linking");
    people.remove(person1);

    List<Person> person = new ArrayList<>();
    person.remove(person1);

    Assert.assertEquals(person.contains(person1),people.contains(person1));



    }

@Test
    public void testFindById(){
    People people =new People();
    Person person = new Person(343,"link");
   people.add(person);
   Person actual = people.findById(343);
    Assert.assertEquals(person,actual);




    }

}
