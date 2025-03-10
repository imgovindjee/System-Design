package com.XX.LLD.PRACTICE.DesignTicketBooking.Controller;

import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.BookingService;
import com.XX.LLD.PRACTICE.DesignTicketBooking.Service.PaymentService;

public class PaymentController {

    private PaymentService paymentService;
    private BookingService bookingService;

    /**
     * @AllArgsConstructor CONSTRUCTOR
     *
     * @param paymentService args helps in payments
     * @param bookingService args helps in booking
     */
    public PaymentController(PaymentService paymentService, BookingService bookingService) {
        this.paymentService = paymentService;
        this.bookingService = bookingService;
    }

    /**
     * Checks that the payment Failed
     *
     * @param bookingID {@NotNull} unique bookingID
     * @param user {@NotNull} a user
     */
    public void paymentFailed(String bookingID, String user){
        paymentService.processPaymentFailed(bookingService.getBooking(bookingID), user);
    }

    /**
     * CHECKS THAT THE PAYMENT IS SUCCESS OR NOT
     *
     * @param bookingID {@NotNull} unique bookingID
     * @param user {@NotNull} a user
     */
    public void paymentSuccess(String bookingID, String user){
        bookingService.confirmBooking(bookingService.getBooking(bookingID), user);
    }
}
