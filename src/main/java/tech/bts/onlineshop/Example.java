package tech.bts.onlineshop;

import tech.bts.onlineshop.business.PurchaseService;
import tech.bts.onlineshop.model.CartItem;
import tech.bts.onlineshop.model.Product;
import tech.bts.onlineshop.model.ShoppingCart;

import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        Product p1 = new Product("MacBook", 1500);
        Product p2 = new Product("iPhone xs", 1200);
        Product p3 = new Product("Pixel 3", 900);

        List<CartItem> items = Arrays.asList(
                new CartItem(p1, 2),
                new CartItem(p2, 3),
                new CartItem(p3, 1));

        ShoppingCart cart = new ShoppingCart(items);

        PurchaseService purchaseService = new PurchaseService();

        double total = purchaseService.calculateTotalAmount(cart);
        System.out.println("total = " + total);
    }
}
