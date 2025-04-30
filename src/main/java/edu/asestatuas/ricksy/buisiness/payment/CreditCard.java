package edu.asestatuas.ricksy.buisiness.payment;

public class CreditCard implements PaymentMethod {

    private final CreditCard owner;
    private final CreditCard number;
    private double credit;

    public CreditCard(String owner, String number) {
        this.owner = new CreditCard(owner, number);
        this.number = new CreditCard(owner, number);
    }
    @Override
    public boolean pay(double credit) {
        return owner.pay(credit);
    }
}
