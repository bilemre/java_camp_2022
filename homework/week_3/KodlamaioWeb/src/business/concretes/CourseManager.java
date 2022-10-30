package business.concretes;

import business.abstracts.CourseService;
import core.logging.abstracts.Logger;
import dataAcces.abstracts.CoursesDao;
import entities.Courses;

import java.util.ArrayList;
import java.util.List;

public class CourseManager implements CourseService {

    CoursesDao coursesDao;
    Logger [] loggers;




    List<String> coursesArrayList = new ArrayList<String>();

    public CourseManager(CoursesDao coursesDao,Logger [] loggers) {
        this.coursesDao = coursesDao;
        this.loggers=loggers;

    }



    @Override
    public void add(Courses courses) throws Exception {
        if (courses.getPrice() < 0) {
            throw new Exception("Kurs Fiyatı 0 dan küçük olamaz.");
        }

       for (String courses1 : coursesArrayList) {
            if (courses1 == courses.getName()) {
                throw new Exception("Kurs İsmi Tekrar Edemez.");
            }
        }
        coursesArrayList.add(courses.getName());
        coursesDao.add(courses);
        for (Logger logs : loggers){
            logs.log(courses.getName());
        }

    }
}
