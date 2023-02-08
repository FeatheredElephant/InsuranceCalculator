package app.model.dao;

import java.util.List;

public interface Dao<T> {
	void create(T type);
	T read(int id);
	void update(T type);
	void delete(int id);
	List<T> readAll();
}
