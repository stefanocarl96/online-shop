package tech.bts.onlineshop;

import tech.bts.onlineshop.business.Product;
import tech.bts.onlineshop.business.ProductService;
import tech.bts.onlineshop.data.ProductDatabase;

public class Example2 {

    public static void main(String args) {

        ProductDatabase productDatabase = new ProductDatabase();



        ProductService productService = new ProductService();
        productService.createProduct(new product("Iphone XS", "apple", 1250));
        productService.createProduct(new Product("Pixel 3", "Google", 900));


}
