package tech.bts.onlineshop.business;

import tech.bts.onlineshop.data.ProductDatabase;
import tech.bts.onlineshop.model.Product;

public class ProductServiceTest {

    public static void main(String[] args) {

        add_product_to_catalog();
        empty_catalog_has_no_products();
        product_is_available();
        product_available_quantity();
    }

    private static void add_product_to_catalog() {

        ProductDatabase productDatabase = new ProductDatabase();
        ProductService productService = new ProductService(productDatabase);
        Product product = new Product("pixel","google", 800);
        long pixelid  productService.createProduct();
        int count = productService.getCount();
        System.out.println("1 --->" + count);
        Product p = productService.getById(pixelid);
        System.out.println("pixel -->" + p.getName());
        assertEquals(p.getName()."pixel");
    }

    private static void assertEquals(Object s1, Object s2) {

        if (!s1.equals(s2)) {
            System.out.println(s1 + "is not equal to" + s2);
            throw new RuntimeException(s1 + "is not equal to" + s2);
        }
    }

    private static void empty_catalog_has_no_products() {

            ProductDatabase productDatabase = new ProductDatabase();
            ProductService productService = new ProductService(productDatabase);
            int count = productService.getCount();
            System.out.println(count);
        }


     private static void product_is_available() {

         ProductDatabase productDatabase = new ProductDatabase();
         ProductService productService = new ProductService(productDatabase);
         Product product = new Product("pixel","google", 800);
         long pixelid  productService.createProduct(product);

         boolean availableBefore = productService.controlAvailability(pixelid,500);
         assertEquals(availableBefore, false);

         productService.addProductStock((pixelid, 500));

         boolean availableAfter = productService.controlAvailability(pixelid,500);
         assertEquals(availableAfter, true);


      private static void product_available_quantity() {

             ProductDatabase productDatabase = new ProductDatabase();
             ProductService productService = new ProductService(productDatabase);
             Product product = new Product("pixel", "google", 800);
             long pixelid productService.createProduct(product);

            assertEquals(productService.controlAvailability(pixelid,50)0);

             productService.addProductStock((pixelid, 100));

             assertEquals(productService.controlAvailability(pixelid,50)50);
             assertEquals(productService.controlAvailability(pixelid,200)100);



         }









                }





    }
}
