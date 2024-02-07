package kirill.kopienko.dao;

import kirill.kopienko.entities.Payment;

public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO(Class<Payment> classToSet) {
        super(classToSet);
    }
}
