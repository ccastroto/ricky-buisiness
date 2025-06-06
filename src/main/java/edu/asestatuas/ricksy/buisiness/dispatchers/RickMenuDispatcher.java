package edu.asestatuas.ricksy.buisiness.dispatchers;

import edu.asestatuas.ricksy.buisiness.payment.PaymentMethod;
import edu.asestatuas.ricksy.buisiness.receptivo.GuestDispatcher;

import java.util.ArrayList;
import java.util.List;

public class RickMenuDispatcher implements GuestDispatcher {

    private int stock = 100;
    private double menuCost = 10d;

    private List<String> orders = new ArrayList<String>();

    public RickMenuDispatcher() {}

    @Override
    public void dispatch(PaymentMethod card){
        if (this.stock > 0 && card.pay(menuCost)){
            this.stock -= 1;
            this.orders.add(card.cardOwner());
        }
    }
    @Override
    public String toString(){
        return "stock: " + this.stock + "\n"
                + this.orders.toString();
    }


}
