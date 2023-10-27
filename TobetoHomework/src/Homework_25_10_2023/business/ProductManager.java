package Homework_25_10_2023.business;

import Homework_25_10_2023.dataAccess.ProductDao;
import Homework_25_10_2023.entities.Product;

import java.util.logging.Logger;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao , Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları

        if(product.getUnitPrice()<10){
            throw new Exception("Ürünün fiyatı 10'dan küçük olamaz ! ");
        }
        //****KURAL*****
        //Bir katman başka bir katmanın class'ını kullanıyorken sadece interface'inden erişim kurmalıdır!!

        //JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(product);

        for (Logger logger : loggers) { // [db,File]
            logger.log(product.getName());

        }
    }
}
