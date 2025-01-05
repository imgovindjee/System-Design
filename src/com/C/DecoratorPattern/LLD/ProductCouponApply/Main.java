package com.C.DecoratorPattern.LLD.ProductCouponApply;

import com.C.DecoratorPattern.LLD.ProductCouponApply.Products.Product;
import com.C.DecoratorPattern.LLD.ProductCouponApply.Products.ProductType;
import com.C.DecoratorPattern.LLD.ProductCouponApply.ShoppingCartItems.ShoppingCart;
import com.C.DecoratorPattern.LLD.ProductCouponApply.Products.Item1;
import com.C.DecoratorPattern.LLD.ProductCouponApply.Products.Item2;

public class Main {
    public static void main(String[] args) {
        Product item1 = new Item1("Fan", 1000, ProductType.ELECTRONIC_GOODS);
        Product item2 = new Item2("SOFA", 2000, ProductType.FURNITURE_GOODS);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);
        System.out.println("Total Price after discount: "+cart.getTotalPrice());
    }
}
