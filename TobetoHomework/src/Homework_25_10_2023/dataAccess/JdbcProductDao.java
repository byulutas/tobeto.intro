package Homework_25_10_2023.dataAccess;


import Homework_25_10_2023.entities.Product;

public class JdbcProductDao implements ProductDao{ //JDBC Yöntemi ile Data Acces Object (data erişimi yöntemi)

    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır --- [SQL]
        System.out.println("JDBC ile veritabanına eklendi!!");
    }







    /*
    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır --- [SQL]
        System.out.println("JDBC ile veritabanına eklendi!!");
    }

     */
}