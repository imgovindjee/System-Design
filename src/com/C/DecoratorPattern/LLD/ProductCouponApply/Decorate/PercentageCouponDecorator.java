package com.C.DecoratorPattern.LLD.ProductCouponApply.Decorate;

import com.C.DecoratorPattern.LLD.ProductCouponApply.Products.Product;

public class PercentageCouponDecorator extends CouponDecorator {

    Product product;
    int discountPercentage;

//    CONSTRUCTOR
    public PercentageCouponDecorator(Product product, int discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        return price - (price * discountPercentage)/100;
    }
}
