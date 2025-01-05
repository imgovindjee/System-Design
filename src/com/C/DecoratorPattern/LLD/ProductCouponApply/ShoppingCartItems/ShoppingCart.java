package com.C.DecoratorPattern.LLD.ProductCouponApply.ShoppingCartItems;

import com.C.DecoratorPattern.LLD.ProductCouponApply.Decorate.PercentageCouponDecorator;
import com.C.DecoratorPattern.LLD.ProductCouponApply.Decorate.TypeCouponDecorator;
import com.C.DecoratorPattern.LLD.ProductCouponApply.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList;

//    CONSTRUCTOR
    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    public void addToCart(Product product) {
        Product productWithEligibleDiscount = new TypeCouponDecorator(
                new PercentageCouponDecorator(product, 10), 7, product.getProductType());
        productList.add(productWithEligibleDiscount);
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product pl:productList){
            System.out.println("---->"+pl.getPrice());
            totalPrice += pl.getPrice();
        }
        return totalPrice;
    }
}
