package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.Dao;
import app.model.domains.Customer;
import java.util.List;

public class CustomerDAO extends InsuranceCalculatorDao<Customer> implements Dao<Customer> {

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
