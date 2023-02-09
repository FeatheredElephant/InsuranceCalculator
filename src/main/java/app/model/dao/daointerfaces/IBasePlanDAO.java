package app.model.dao.daointerfaces;

import app.model.domains.BasePlan;

import java.math.BigDecimal;

public interface IBasePlanDAO extends Dao<BasePlan> {
    BigDecimal getMonthlyCost(String planName);
    BigDecimal getCoverageAmount(String planName);
}
