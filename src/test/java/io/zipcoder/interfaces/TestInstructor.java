package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

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
    @Test
public void testLecture(){
        double hours = 5.0;


        Instructor instructor = new Instructor(123,"Angel");
        Student student = new Student(100,"King neptune");
        Student student2 = new Student(100,"leon");
        Student student3 = new Student(100,"Dean");
    Student[] studentsHours ={student,student2,student3};
    instructor.lecture(studentsHours, hours );
        double totalHours = hours/ studentsHours.length;

       for(Student t : studentsHours  ) {

           Assert.assertEquals(totalHours,t.getTotalStudyTime(), 0.0);

       }



}





}
