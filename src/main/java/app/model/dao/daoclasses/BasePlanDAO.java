package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.Dao;
import app.model.domains.BasePlan;
import java.math.BigDecimal;
import java.util.List;

public class BasePlanDAO extends InsuranceCalculatorDao<BasePlan> implements Dao<BasePlan> {

    @Override
    public void create(BasePlan type) {

    }

    @Override
    public BasePlan read(int id) {
        return null;
    }

    @Override
    public void update(BasePlan type) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<BasePlan> readAll() {
        return null;
    }

    public BigDecimal getMonthlyCost(String planName) {
        return null;
    }

    public BigDecimal getCoverageAmount(String planName) {
        return null;
    }
}
