package tech.bts.onlineshop;

import tech.bts.onlineshop.business.PurchaseService;
import tech.bts.onlineshop.model.CartItem;
import tech.bts.onlineshop.model.Product;
import tech.bts.onlineshop.model.ShoppingCart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        Product p1 = new Product("macbook", 1500);
        Product p2 = new Product("iphone xs", 1200);
        Product p3 = new Product("pixel 3", 900);

        List<CartItem> items1 = new ArrayList<>();
        items1.add(new CartItem(p1, 2));
        items1.add(new CartItem(p2, 3));
        items1.add(new CartItem(p3, 1));

        // Equivalent
        List<CartItem> items2 = Arrays.asList(
                new CartItem(p1, 2),
                new CartItem(p2, 3),
                new CartItem(p3, 1));

        ShoppingCart cart = new ShoppingCart(items2);

        PurchaseService purchaseService = new PurchaseService();
        purchaseService.calculateTotalAmount(cart);
    }
}
