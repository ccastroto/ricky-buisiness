package edu.asestatuas.ricksy.buisiness.dispatchers;

import edu.asestatuas.ricksy.buisiness.payment.PaymentMethod;
import edu.asestatuas.ricksy.buisiness.receptivo.GuestDispatcher;


public class CrystalExpender {
    private int stock;
    private double itemCost;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }
    public void dispatch(PaymentMethod card) {

    }
}
