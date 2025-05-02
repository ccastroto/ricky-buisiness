package edu.asestatuas.ricksy.buisiness.payment;

public class CreditCard implements PaymentMethod {

    private final String owner;
    private final String number;
    private double credit = 3000.0;

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    @Override
    public String cardOwner() {
        return this.owner;
    }

    @Override
    public String number() {
        return this.number;
    }

    @Override
    public double credit() {
        return this.credit;
    }

    @Override
    public boolean pay(double charge) {
        if (charge <= this.credit - 1) {
            this.credit -= charge;
            return true;
        }
        return false;
    }

    public String toString(){
        return "owner: " + this.owner + "\n"
                + "number: " + this.number + "\n"
                + "credit: " + this.credit + "EZI";
    }
}
