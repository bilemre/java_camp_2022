package kodlamaioWeb;

import kodlamaioWeb.business.CategoryManager;
import kodlamaioWeb.business.CourseManager;
import kodlamaioWeb.core.logging.DatabaseLogger;
import kodlamaioWeb.core.logging.FileLogger;
import kodlamaioWeb.core.logging.Logger;
import kodlamaioWeb.core.logging.MailLogger;
import kodlamaioWeb.dataAcces.HibernateCategoryDao;
import kodlamaioWeb.dataAcces.HibernateCoursesDao;
import kodlamaioWeb.entities.Category;
import kodlamaioWeb.entities.Courses;

public class Main {
    public static void main(String[] args) throws Exception{

        Courses course1 = new Courses(1, "Java", "Engin", "programlama",  100);
        Courses course2 = new Courses(2, "C", "Engin", "programlama",  100);
        Courses course3 = new Courses(3, "Python", "Engin", "programlama", 100);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CourseManager coursesManager = new CourseManager(new HibernateCoursesDao(), loggers);



        coursesManager.add(course1);
        coursesManager.add(course2);
        coursesManager.add(course3);

        Category category1 = new Category(1, "Python");
        Category category2 = new Category(2, "C");
        Category category3 = new Category(3, "C++");
        Category category4 = new Category(4, "Java");
        Logger[] logger2 = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), logger2);
        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category3);
        categoryManager.add(category4);
    }
}
