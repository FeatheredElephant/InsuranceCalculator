package app.model.dao.daoclasses;

import app.model.dao.daointerfaces.IAccidentDAO;
import app.model.domains.Accident;


import java.math.BigDecimal;
import java.util.List;

public class AccidentDAO implements IAccidentDAO {


    @Override
    public void create(Accident type) {

    }

    @Override
    public Accident read(int id) {
        return null;
    }

    @Override
    public void update(Accident type) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Accident> readAll() {
        return null;
    }

    @Override
    public BigDecimal getDamage() {
        return null;
    }
}