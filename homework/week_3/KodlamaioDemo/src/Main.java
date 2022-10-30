import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import core.logging.abstracts.Logger;
import core.logging.concretes.DatabaseLogger;
import core.logging.concretes.FileLogger;
import core.logging.concretes.MailLogger;
import dataAcces.concretes.HibernateCategory;
import dataAcces.concretes.HibernateCourse;
import entities.Category;
import entities.Courses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

       Courses courses1 = new Courses(1,"Java",100,"Engin","Programming");
        Courses courses2 = new Courses(1,"Python",100,"Engin","Programming");
        Courses courses3 = new Courses(1,"C++",100,"Engin","Programming");
      List<Courses> coursesList = new ArrayList<Courses>();
       coursesList.add(courses1);
       coursesList.add(courses2);

        Logger[] loggers ={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        CourseManager courseManager = new CourseManager(new HibernateCourse(),loggers);
        courseManager.add(courses1);
        courseManager.add(courses2);
        courseManager.add(courses3);


        Category category1 = new Category(1,"Java");
        Category category2 = new Category(2,"C#");

        CategoryManager categoryManager = new CategoryManager(new HibernateCategory(),loggers);
        categoryManager.add(category1);
        categoryManager.add(category2);


    }
}
