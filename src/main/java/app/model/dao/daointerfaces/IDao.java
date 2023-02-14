package app.model.dao.daointerfaces;

import java.util.List;

public interface IDao<T> {
	public void create(T domain);
	public T read(int id);
	public void update(T domain);
	public void delete(int id);
	public List<T> readAll();
}