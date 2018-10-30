package tech.bts.onlineshop.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The items to be purchased.
 */
public class ShoppingCart {

    private List<tech.bts.onlineshop.model.CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public ShoppingCart(List<tech.bts.onlineshop.model.CartItem> items) {
        this.items = items;
    }

    public List<tech.bts.onlineshop.model.CartItem> getItems() {
        return items;
    }

    public void add(tech.bts.onlineshop.model.CartItemtem item) {
        items.add(item);
    }
}