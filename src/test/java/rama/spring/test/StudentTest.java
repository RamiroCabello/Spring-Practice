package rama.spring.test;

import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rama.spring.practice.beans.Course;
import rama.spring.practice.beans.Student;

public class StudentTest {

    private static ApplicationContext context;


    @BeforeClass
    public static void setUpContext(){

        context= new ClassPathXmlApplicationContext("context1.xml");

    }

    @Test
    public void nameValueTest(){

        Student student = (Student) context.getBean ("ramiro");
        Assert.assertEquals("Ramiro", student.getName());

    }

    @Test
    public void courseTest(){

        Course course = (Course) context.getBean ("java");

        Assert.assertEquals("Java", course.getName());
        Assert.assertEquals(30, course.getAmountHours());

    }

    @Test
    public void courseWithoutContentTest(){

        Course course = (Course) context.getBean ("java");

        Assert.assertNull(course.getContent());

    }

    @Test
    public void studentCoursesTest(){

        Student student = (Student) context.getBean ("ramiro");

        Assert.assertEquals(3, student.getCourses().size());

    }

    @Test
    public void courseWithContentTest(){

        Course course = (Course) context.getBean ("html5");

        Assert.assertTrue(course.getContent().containsKey("Intro"));

    }

    @AfterClass
    public static void close(){

        ((ClassPathXmlApplicationContext) context).close();
    }

}
