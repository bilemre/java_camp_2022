package kodlamaioWeb.dataAcces;

import kodlamaioWeb.entities.Courses;

public class JdbcCoursesDao implements CoursesDao{
    @Override
    public void add(Courses courses) {
        System.out.println("JDBC ile veritabanýna eklendi." + courses.getCourseName());
    }
}
