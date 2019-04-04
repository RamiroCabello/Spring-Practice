package rama.spring.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rama.spring.practice.beans.Course;

public class CourseProtypeTest {

    private static ApplicationContext context;


    @BeforeClass
    public static void setUpContext(){

        context= new ClassPathXmlApplicationContext("prototypeContext.xml");

    }

    @Test
    public void setNameWithSingletonTest(){

        Course course = (Course) context.getBean ("php");
        Course anotherCourse = (Course) context.getBean ("php");
        anotherCourse.setName("C++");

        Assert.assertNotEquals(course.getName(), anotherCourse.getName());

    }

    @Test
    public void setNameWithPrototypeTest(){

        Course course = (Course) context.getBean ("ruby");
        Course anotherCourse = (Course) context.getBean ("ruby");
        anotherCourse.setName("C++");

        Assert.assertEquals(course.getName(), anotherCourse.getName());

    }


    @AfterClass
    public static void close(){

        ((ClassPathXmlApplicationContext) context).close();
    }
}
