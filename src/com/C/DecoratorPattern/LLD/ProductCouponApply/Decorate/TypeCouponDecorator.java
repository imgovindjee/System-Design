package com.C.DecoratorPattern.LLD.ProductCouponApply.Decorate;

import com.C.DecoratorPattern.LLD.ProductCouponApply.Products.Product;
import com.C.DecoratorPattern.LLD.ProductCouponApply.Products.ProductType;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator {

    Product product;
    int discountPercentage;
    ProductType productType;
    public static List<ProductType> eligibleProduct_goods = new ArrayList<>(); // GOODS ELIGIBLE FOR DISCOUNT
    static {
        eligibleProduct_goods.add(ProductType.DECORATIVE_GOODS);
        eligibleProduct_goods.add(ProductType.FURNITURE_GOODS);
    }

    public TypeCouponDecorator(Product product, int discountPercentage, ProductType productType) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.productType = productType;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        if(eligibleProduct_goods.contains(productType)) {
            return price - (price - discountPercentage)/100;
        }
        return price;
    }
}
