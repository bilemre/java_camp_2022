package kodlamaioWeb.dataAcces;

import kodlamaioWeb.entities.Courses;

public class HibernateCoursesDao implements CoursesDao{
    @Override
    public void add(Courses courses) {
        System.out.println("Hibernate ile veritabanına eklendi." +courses.getCourseName());
    }
}
