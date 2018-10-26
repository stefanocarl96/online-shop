package tech.bts.onlineshop.business;

import tech.bts.onlineshop.CartItem;
import tech.bts.onlineshop.data.ProductDatabase;
import tech.bts.onlineshop.model.Product;

public class ProductService {

    private ProductDatabase productDatabase;

    public ProductService(ProductDatabase productDatabase) {
        this.productDatabase = productDatabase;
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
       return productDatabase.getCount();
    }

    public Product getById(long productId) {

        Product product = this.productDatabase.get(productId);
        return product;
    }

    public boolean controlAvailability(long productId, int quantity) {

        Product product = this.productDatabase.get(productId);
        return quantity <= product.getQuantity();
    }

    public int possibletoDeliver(long productId, int quantity) {

        Product product = this.productDatabase.get(productId);

        long possibleQuantityToDeliver = Math.min(product.getQuantity(), quantity);
        return Math.min(product.getQuantity(), quantity);

        /** Reduces the quantities of the products by the quantities in the cart */
        public void purchase(Shoppingcart cart);

        for (CartItem item : cart.getItems()) {
            Product product = productDatabase.get(item.getproductid());
            int remainingQuantity = product.getQuantity() - item.getQuantity();
            product.setQuantity(remainingQuantity);
        }



    }

}