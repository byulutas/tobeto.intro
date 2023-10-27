package Homework_25_10_2023.dataAccess;

import Homework_25_10_2023.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır --- [SQL]
        System.out.println("Hibernate ile veritabanına eklendi!!");
    }
}
