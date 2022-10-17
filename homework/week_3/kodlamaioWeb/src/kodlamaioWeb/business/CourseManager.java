package kodlamaioWeb.business;

import kodlamaioWeb.core.logging.Logger;
import kodlamaioWeb.dataAcces.CoursesDao;
import kodlamaioWeb.entities.Courses;
import kodlamaioWeb.entities.Category;
import java.util.ArrayList;


public class CourseManager {
    CoursesDao coursesDao;
    Logger[] loggers;

    public CourseManager(CoursesDao coursesDao, Logger[] loggers) {
        this.coursesDao = coursesDao;
        this.loggers = loggers;
    }


    ArrayList<String> coursesArrayList = new ArrayList<String>();

    public void add(Courses courses) throws Exception{
        if(courses.getPrice() <0 ){
            throw new Exception("Kurs Fiyatı 0 dan küçük olamaz.");
        }

        for(String course : coursesArrayList){
            if(course == courses.getCourseName()){
                throw new Exception("Kurs ismi tekrar edemez.");
            }
        }
        coursesArrayList.add(courses.getCourseName());
        coursesDao.add(courses);

        for (Logger logger : loggers) {
            logger.log(courses.getCourseName());
        }

    }


}
