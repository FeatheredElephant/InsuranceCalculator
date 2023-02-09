package app.model.dao.daointerfaces;
import app.model.domains.Accident;

import java.math.BigDecimal;

public interface IAccidentDAO extends Dao<Accident> {
    BigDecimal getDamage();
}
