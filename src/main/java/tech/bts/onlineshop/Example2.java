package tech.bts.onlineshop;

import tech.bts.onlineshop.business.ProductService;
import tech.bts.onlineshop.data.ProductDatabase;
import tech.bts.onlineshop.model.Product;
import tech.bts.onlineshop.model.ShoppingCart;

public class Example2 {

    private static Object pixelId
            ;

    public static <cartItem> void main(String[] args) {

        ProductDatabase productDatabase = new ProductDatabase();
        ProductService p1 = new ProductService(productDatabase);

        long macBookId = p1.createProduct(new Product("MacBook", "Apple", 1400));
        long iphoneID = p1.createProduct(new Product("iPhone xs", "Apple", 1000));

        p1.addProductStock(macBookId,200);
        p1.addProductStock(iphoneID, 300);
        p1.addProductStock(macBookId,100);

        long requestedId = macBookId;
        Product requestedProduct = p1.getById(requestedId);
        System.out.println("There are " + requestedProduct.getQuantity() + " units of " + requestedProduct.getName() + " in stock");

        int requestedQuantity = 20;
        boolean availability = p1.controlAvailability(requestedId,requestedQuantity);
        System.out.println(availability);

        System.out.println(p1.possibletoDeliver(requestedId,requestedQuantity));

        ShoppingCart cart = new ShoppingCart();
        cart.add(new cartItem(iphoneID, 20));
        cart.add(new cartItem(pixelId, 50));

        productService.purchase(cart);

        Product iPhone = productService,getProductById(iphoneID);
        System.out.println("Expected 280 --->" + iPhone.getQuantity());





    }
}


