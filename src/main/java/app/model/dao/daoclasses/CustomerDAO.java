package app.model.dao.daoclasses;

import app.model.dao.daointerfaces.ICustomerDAO;
import app.model.domains.Customer;

import java.util.List;

public class CustomerDAO implements ICustomerDAO {
    @Override
    public void create(Customer type) {

    }

    @Override
    public Customer read(int id) {
        return null;
    }

    @Override
    public void update(Customer type) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Customer> readAll() {
        return null;
    }
}
