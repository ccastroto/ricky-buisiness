package edu.asestatuas.ricksy.buisiness.receptivo;

public class Receptivo {

    private static Receptivo instance = null;

    private Receptivo() {}

    public static Receptivo getReceptivo() {
        return instance == null ? new Receptivo() : instance;
    }
}
