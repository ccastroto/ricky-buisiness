package edu.asestatuas.ricksy.buisiness;

import edu.asestatuas.ricksy.buisiness.payment.CreditCard;

public interface GuestDispatcher {
    void dispatch(CreditCard owner, CreditCard number);
}
