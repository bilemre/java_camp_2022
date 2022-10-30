package business.concretes;

import business.abstracts.CategoryService;
import core.logging.abstracts.Logger;
import dataAcces.abstracts.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements CategoryService {

   private CategoryDao categoryDao;
   private Logger[] loggers;


    public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    List<String> categoryList = new ArrayList<String>();
    @Override
    public void add(Category category) throws Exception {

        for (String ctList : categoryList){
            if (ctList == category.getCategoryName()){
            throw  new Exception("Kategori İsmi Tekrar Edilemez");
            }
        }
        categoryList.add(category.getCategoryName());
        categoryDao.add(category);

        for (Logger logs : loggers){
            logs.log(category.getCategoryName());
        }


    }
}
