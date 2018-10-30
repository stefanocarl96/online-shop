package tech.bts.onlineshop.business;

import org.junit.Assert;
import org.junit.Test;
import tech.bts.onlineshop.model.Discount;

public class DiscountServiceTest {

    @Test
    public void applyDiscount() {

        Discount discount1 = new Discount("WINTERDISCOUNT","Winter discount",16, true);
        Discount discount2 = new Discount("COUPONS","Coupons",40, false);

        DiscountService discountService = new DiscountService();

        discountService.createDiscount(discount1);
        discountService.createDiscount(discount2);

        Assert.assertEquals(84, discountService.calculateFinalAmount(discount1.getId(), 100),0.0);
        Assert.assertEquals(60, discountService.calculateFinalAmount(discount2.getId(), 100),0.0);
    }
}