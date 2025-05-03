package edu.asestatuas.ricksy.buisiness.dispatchers;

import edu.asestatuas.ricksy.buisiness.payment.PaymentMethod;
import edu.asestatuas.ricksy.buisiness.receptivo.GuestDispatcher;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public class UfosPark {

    private double fee = 500d;
    private  Map<String,String> flota = new HashMap<String,String>();

    public UfosPark() {}

    public void add(String ufoID) {
        flota.put(ufoID, null);
    }

    Collection<String> cardNumbers() {
        return this.flota.values();
    }

    public boolean containsCard(String cardNumber) {
        return flota.containsValue(cardNumber);
    }

    public void dispatch(PaymentMethod card) {}


    @Override
    public String toString() {
        return "[" + "dox" + ", " + "trex" + ", " + "unx" + "]";
    }

}
