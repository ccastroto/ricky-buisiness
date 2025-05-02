package edu.asestatuas.ricksy.buisiness.payment;

public interface PaymentMethod {

    boolean pay(double charge);
    String number();
    String cardOwner();
    double credit();
}
