package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.Dao;
import app.model.domains.Vehicle;
import java.util.List;

public class VehicleDAO extends InsuranceCalculatorDao<Vehicle> implements Dao<Vehicle> {

    @Override
    public void create(Vehicle type) {

    }

    @Override
    public Vehicle read(int id) {
        return null;
    }

    @Override
    public void update(Vehicle type) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Vehicle> readAll() {
        return null;
    }
}
