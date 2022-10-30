package dataAcces.concretes;

import dataAcces.abstracts.CategoryDao;
import entities.Category;

public class HibernateCategory implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile eklendi : "+category.getCategoryName());
    }
}
