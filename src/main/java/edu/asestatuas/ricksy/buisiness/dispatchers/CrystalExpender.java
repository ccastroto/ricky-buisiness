package edu.asestatuas.ricksy.buisiness.dispatchers;

import edu.asestatuas.ricksy.buisiness.payment.PaymentMethod;
import edu.asestatuas.ricksy.buisiness.receptivo.GuestDispatcher;


public class CrystalExpender implements GuestDispatcher {
    private int stock;
    private double itemCost;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }
    public int stock() {
        return this.stock;
    }
    @Override
    public void dispatch(PaymentMethod card) {
        if (this.stock > 0 && card.pay(this.itemCost)) {
            this.stock -= 1;
        }
    }
    @Override
    public String toString() {
        return "stock: " + this.stock + "\n"
                + "item cost: " + this.itemCost;
    }

}
