package edu.asestatuas.ricksy.buisiness.receptivo;

import edu.asestatuas.ricksy.buisiness.payment.PaymentMethod;

public interface GuestDispatcher {
    void dispatch(PaymentMethod card);
}
