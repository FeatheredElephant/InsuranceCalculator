package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.Dao;
import app.model.domains.InsurancePlan;
import java.util.List;

public class InsurancePlanDAO extends InsuranceCalculatorDao<InsurancePlan> implements Dao<InsurancePlan> {

    @Override
    public void create(InsurancePlan type) {

    }

    @Override
    public InsurancePlan read(int id) {
        return null;
    }

    @Override
    public void update(InsurancePlan type) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<InsurancePlan> readAll() {
        return null;
    }
}
