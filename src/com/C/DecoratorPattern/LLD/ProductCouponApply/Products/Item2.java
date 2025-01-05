package com.C.DecoratorPattern.LLD.ProductCouponApply.Products;

public class Item2 extends Product {
//    CONSTRUCTOR
    public Item2(String name, double originalPrice, ProductType productType) {
        super(name, originalPrice, productType);
    }

    @Override
    public double getPrice() {
        return originalPrice;
    }
}
