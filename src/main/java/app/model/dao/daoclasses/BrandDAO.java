package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.Dao;
import app.model.domains.Brand;
import java.util.List;

public class BrandDAO extends InsuranceCalculatorDao<Brand> implements Dao<Brand> {

    @Override
    public void create(Brand type) {

    }

    @Override
    public Brand read(int id) {
        return null;
    }

    @Override
    public void update(Brand type) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Brand> readAll() {
        return null;
    }
}
