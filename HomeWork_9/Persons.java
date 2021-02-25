package GeekBrains_Java_QA.HomeWork_9;

import java.util.List;


public class Persons implements Student{

    String name;
    public List<Course> courses;

    public Persons(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }
    public void addCourse(Courses newCourse)
    {

        this.courses.add(newCourse);
    }


    @Override
    public String getName() {
        return name;
    }
    @Override

    public List<Course> getAllCourses() {

        return courses;
    }
    @Override
    public String toString() {
        return name + ", courses=" + courses;
    }
}
