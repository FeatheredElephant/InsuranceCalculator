package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.Dao;
import app.model.domains.Claim;

import java.util.List;

public class ClaimDAO extends InsuranceCalculatorDao<Claim> implements Dao<Claim> {

    @Override
    public void create(Claim type) {

    }

    @Override
    public Claim read(int id) {
        return null;
    }

    @Override
    public void update(Claim type) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Claim> readAll() {
        return null;
    }
}
