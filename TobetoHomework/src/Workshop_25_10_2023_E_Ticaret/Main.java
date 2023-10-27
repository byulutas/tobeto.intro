package Workshop_25_10_2023_E_Ticaret;

import Workshop_25_10_2023_E_Ticaret.entities.Category;
import Workshop_25_10_2023_E_Ticaret.entities.Order;
import Workshop_25_10_2023_E_Ticaret.entities.Product;
import Workshop_25_10_2023_E_Ticaret.entities.User;

public class Main {
    public static void main(String[] args) {


        User user1 = new User("Ahmet", "Yıldız");
        User user2 = new User("Mehmet", "Aslan");


        Product product1 = new Product(0, "Blender", 2500);
        Product product2 = new Product(1, "Mikser", 1000);

        Category category1 = new Category(0, "Teknolojik Ev Üürnleri");
        Category category2 = new Category(1, "Bakım Ürünleri");

        Order order1 = new Order(0, 1);
        Order order2 = new Order(1, 5);


        user1.setFirstName("Ahmet");
        product1.setUnitPrice(3000);

        Product[] products = {product1, product2};

        for (Product product : products) {
            System.out.println("Ürün adı " + product.getProductName() + "    " + "ürün fiyatı = " + product.getUnitPrice());
        }

    }
}