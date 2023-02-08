package app.model.dao;

import java.util.List;

public interface Dao<T> {
	public void create(T type);
	public T read(int id);
	public void update(T type);
	public void delete(int id);
	public List<T> readAll();
}
