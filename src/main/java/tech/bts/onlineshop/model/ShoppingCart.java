package tech.bts.onlineshop.model;

import tech.bts.onlineshop.CartItem;

import java.util.ArrayList;
import java.util.List;

/**
 * One product and the quantity to purchase.
 */
public class ShoppingCart {

    private List<CartItem> items;

    public  ShoppingCart() {
        this.items = new ArrayList<>();
    }


    public List<CartItem> getitems() { return items; }

    public void add(CartItem item)        {
        items.add(item);
            }
    }







}

    public void add(CartItem item1) {

    }
