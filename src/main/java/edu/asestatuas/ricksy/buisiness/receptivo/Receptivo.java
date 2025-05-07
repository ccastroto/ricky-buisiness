package edu.asestatuas.ricksy.buisiness.receptivo;

import edu.asestatuas.ricksy.buisiness.payment.PaymentMethod;

import java.util.LinkedHashSet;
import java.util.Set;

public class Receptivo {

    private static Receptivo instance = null;
    private Set<GuestDispatcher> observers = new LinkedHashSet<>();

    private Receptivo() {}

    public static Receptivo getReceptivo() {
        return instance = instance == null ? new Receptivo() : instance;
    }
    public void registra(GuestDispatcher observer) {
        this.observers.add(observer);
    }
    public void dispatch(PaymentMethod card){
        for (GuestDispatcher observer : this.observers) {
            observer.dispatch(card);
        }
    }
}
