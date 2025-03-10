package com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Order;

import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Address;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Invoice;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Payment.Payment;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Payment.PaymentMode;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Payment.UPIPaymentMode;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.User.User;
import com.XX.LLD.PRACTICE.DesignOrderManagementSystem.WareHouse.WareHouse;

import java.util.Map;

public class Order {

    User user;
    Address deliveryAddress;
    Map<Integer, Integer> productCategoryCountMap;
    Invoice invoice;
    Payment payment;
    WareHouse wareHouse;
    OrderStatus orderStatus;

//    CONSTRUCTOR INJECTION
    public Order(User user, WareHouse wareHouse) {
        this.user = user;
        this.productCategoryCountMap = user.getUserCart().getCartItems();
        this.wareHouse = wareHouse;
        this.deliveryAddress = user.getAddress();
        this.invoice = new Invoice();
        invoice.generateInvoice(this);
    }

    public void checkOut(){
//        1. UPDATE INVENTORY
        wareHouse.removeItemFromInventory(productCategoryCountMap);

//        2. MAKE PAYMENT
        boolean isPaymentSuccess = makePayment(new UPIPaymentMode());

//        3. MAKE CART EMPTY
        if(isPaymentSuccess) {
            user.getUserCart().emptyCart();
        } else {
            wareHouse.addItemToInventory(productCategoryCountMap);
        }
    }

    public boolean makePayment(PaymentMode paymentMode){
        payment = new Payment(paymentMode);
        return payment.makePayment();
    }

    public void generateOrderInvoice() {
        invoice.generateInvoice(this);
    }
}
