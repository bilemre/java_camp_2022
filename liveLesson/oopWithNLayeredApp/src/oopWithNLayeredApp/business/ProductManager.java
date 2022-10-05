package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAcces.HibernateProductDao;
import oopWithNLayeredApp.dataAcces.JdbcProductDao;
import oopWithNLayeredApp.dataAcces.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao ,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;

    }





    public void add(Product product) throws  Exception {
        // iş kuralları

        if(product.getUnitPrice() < 10){
            throw new Exception("Ürün Fiyatı 10 dan küçük olamaz!");
        }

        productDao.add(product);

        for(Logger logger:loggers){ // [db,mail]
            logger.log(product.getName());
        }
    }
}
