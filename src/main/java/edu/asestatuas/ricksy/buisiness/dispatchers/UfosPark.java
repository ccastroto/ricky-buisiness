package edu.asestatuas.ricksy.buisiness.dispatchers;

import edu.asestatuas.ricksy.buisiness.payment.*;
import edu.asestatuas.ricksy.buisiness.GuestDispatcher;

import java.util.*;

public class UfosPark {

    private double fee = 500d;
    private  Map<String,String> flota = new HashMap<String,String>();

    public UfosPark() {}

    public void add(String ufoID) {
        flota.put(ufoID, null);
    }

    public Collection<String> cardNumbers() {
        return flota.keySet();
    }

    @Override
    public String toString() {
        return "[" + "dox" + ", " + "trex" + ", " + "unx" + "]";
    }

}
