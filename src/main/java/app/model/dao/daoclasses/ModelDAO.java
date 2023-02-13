package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.Dao;
import app.model.domains.Model;
import java.util.List;

public class ModelDAO extends InsuranceCalculatorDao<Model> implements Dao<Model> {

    @Override
    public void create(Model type) {

    }

    @Override
    public Model read(int id) {
        return null;
    }

    @Override
    public void update(Model type) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Model> readAll() {
        return null;
    }
}
