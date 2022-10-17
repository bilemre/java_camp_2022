package kodlamaioWeb.dataAcces;

import kodlamaioWeb.entities.Category;

public class dbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanýna eklendi." + category.getCategoryName());
    }
}
