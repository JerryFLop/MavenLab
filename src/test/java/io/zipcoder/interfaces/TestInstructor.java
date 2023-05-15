package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(666,"Jimmy John");
        Assert.assertTrue(instructor instanceof Teacher);

    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(696,"bommy");
        Assert.assertTrue(instructor instanceof Person);

    }


    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(777,"kim");
        Student student = new Student(911,"Tower");
        instructor.teach(student, 4.0);
        double studentHours = 4.0;

      Assert.assertEquals(studentHours,student.getTotalStudyTime(), 0.0);


    }

}
