package rama.spring.practice.beans;

import rama.spring.practice.beans.Course;

import java.util.List;

public class Student {


    private String name;
    private String lastName;
    private List<Course> courses;

    public Student(){
        super();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
