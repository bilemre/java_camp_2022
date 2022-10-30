package dataAcces.concretes;

import dataAcces.abstracts.CoursesDao;
import entities.Courses;

public class HibernateCourse implements CoursesDao {

    @Override
    public void add(Courses courses) {
        System.out.println("Hibernate ile eklendi "+courses.getName());

    }
}
