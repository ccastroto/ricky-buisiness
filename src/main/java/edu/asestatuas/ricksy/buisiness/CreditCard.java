package edu.asestatuas.ricksy.buisiness;

public class CreditCard {

    private CreditCard owner;
    private CreditCard number;

    public CreditCard(String owner, String number) {
        this.owner = new CreditCard(owner, number);
        this.number = new CreditCard(owner, number);
    }
}
