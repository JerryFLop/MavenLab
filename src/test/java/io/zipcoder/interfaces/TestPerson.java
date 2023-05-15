package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
@Test
    public void testConstructor(){
    //given
    Person person = new Person(365 ,"Timmy");

//when
    long id = 365;
    String name = "Timmy";
//then
    Assert.assertEquals(id, person.getId());
    Assert.assertEquals(name, person.getName());

    }
    public void testSetName(){
    Person person = new Person(356, "Timmy");
   String expectedName = "Timmy";

   Assert.assertEquals(expectedName, person.getName());



    }



}
