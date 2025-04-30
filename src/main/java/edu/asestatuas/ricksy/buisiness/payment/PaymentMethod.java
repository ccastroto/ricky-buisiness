package edu.asestatuas.ricksy.buisiness.payment;

public interface PaymentMethod {

    boolean pay(double credit);
    String number();
    String cardOwner();
    double credit();
}
