package edu.asestatuas.ricksy.buisiness.receptivo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Receptivo {

    private static Receptivo instance = null;
    private Set<GuestDispatcher> observers = new LinkedHashSet<>();

    private Receptivo() {}

    public static Receptivo getReceptivo() {
        return instance == null ? new Receptivo() : instance;
    }
    public void registra(GuestDispatcher observer) {
        this.observers.add(observer);
    }
}
