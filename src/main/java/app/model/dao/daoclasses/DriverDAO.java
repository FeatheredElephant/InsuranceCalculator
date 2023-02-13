package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.Dao;
import app.model.domains.Driver;
import java.util.List;

public class DriverDAO extends InsuranceCalculatorDao<Driver> implements Dao<Driver> {

    @Override
    public void create(Driver type) {

    }

    @Override
    public Driver read(int id) {
        return null;
    }

    @Override
    public void update(Driver type) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Driver> readAll() {
        return null;
    }
}
