package app.model.dao.daoclasses;

import app.model.dao.daointerfaces.IBasePlanDAO;
import app.model.domains.BasePlan;

import java.math.BigDecimal;
import java.util.List;

public class BasePlanDAO implements IBasePlanDAO {
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

    @Override
    public BigDecimal getMonthlyCost(String planName) {
        return null;
    }

    @Override
    public BigDecimal getCoverageAmount(String planName) {
        return null;
    }
}
