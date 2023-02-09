package app.model.dao.daoclasses;

import app.model.dao.daointerfaces.IPaymentDAO;
import app.model.domains.Payment;

import java.util.List;

public class PaymentDAO implements IPaymentDAO {
    @Override
    public void create(Payment type) {

    }

    @Override
    public Payment read(int id) {
        return null;
    }

    @Override
    public void update(Payment type) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Payment> readAll() {
        return null;
    }
}
