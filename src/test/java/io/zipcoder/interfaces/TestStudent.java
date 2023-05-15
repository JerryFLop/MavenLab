package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
@Test
    public void testImplementation(){
    Student student = new Student(253,"nacho");

    Assert.assertTrue(student instanceof Learner);

}
@Test
public void testInheritance(){
    Student student = new Student(154,"king");
Assert.assertTrue(student instanceof Person);
}
@Test
public void testLearn(){
Student student = new Student(123,"king");
student.learn(student.getTotalStudyTime());




}




}
