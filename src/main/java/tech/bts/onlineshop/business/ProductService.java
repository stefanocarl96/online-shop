package tech.bts.onlineshop.business;

import tech.bts.onlineshop.data.ProductDatabase;
import tech.bts.onlineshop.model.CartItem;
import tech.bts.onlineshop.model.ShoppingCart;

public class ProductService {

    public long getName;
    private ProductDatabase productDatabase;


    public ProductService(ProductDatabase productDatabase) {
        this.productDatabase = productDatabase;
    }

    public Product getProductById(long productid) {
        Product p = productDatabase.get(productid);
        return p;

    }


    public long createProduct(Product product) {
       return this.productDatabase.add(product);
    }


    public void addProductStock(long productId, int quantity) {

        Product product = this.productDatabase.get(productId);
        int total = product.getQuantity() + quantity;
        product.setQuantity(total);
    }


    public int getCount() {
        return 0;
    }
}