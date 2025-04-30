package edu.asestatuas.ricksy.buisiness.payment;

public class CreditCard implements PaymentMethod {

    private final String owner;
    private final String number;
    private double credit;

    CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }
    @Override
    public String owner() {
        return this.owner;
    }

    @Override
    public String number() {
        return this.number;
    }

    @Override
    public boolean pay(double credit) {
        return owner.pay(credit);
    }
}
