package edu.asestatuas.ricksy.buisiness.dispatchers;

import edu.asestatuas.ricksy.buisiness.payment.PaymentMethod;
import edu.asestatuas.ricksy.buisiness.receptivo.GuestDispatcher;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class UfosPark implements GuestDispatcher {

    private double fee = 500d;
    private final Map<String,String> flota = new HashMap<String, String>();

    public UfosPark() {}

    public void add(String ufoID) {
        flota.putIfAbsent(ufoID, null);
    }

    Collection<String> cardNumbers() {
        return this.flota.values();
    }

    public boolean containsCard(String cardNumber) {
        return flota.containsValue(cardNumber);
    }

    @Override
    public void dispatch(PaymentMethod card) {
        Map.Entry<String, String> ufo = null;
        if (!flota.containsValue(card.number())) {
            for(Map.Entry<String,String> entry : this.flota.entrySet()) {
                if (entry.getValue() == null) {
                    ufo = entry;
                    break;
                }
            }
        }
        if (ufo != null && card.pay(fee)) {
            this.flota.put(ufo.getKey(), card.number());
        }
    }

    public String getUfoOf(String cardNumber) {
        String ufoid = null;
        if (!flota.containsValue(cardNumber)) {
            for(Map.Entry<String,String> entry : this.flota.entrySet()) {
                if (entry.getValue() == cardNumber) {
                    ufoid = entry.getKey();
                    break;
                }
            }
        }
        return ufoid;
    }

    @Override
    public String toString() {
        String[] ufosID = this.flota.keySet().toArray(new String[flota.size()]);
        Arrays.sort(ufosID);
        return List.of(ufosID).toString();
    }

}
