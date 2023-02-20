package app.model.dao.daoclasses;

import app.IOManager;
import app.model.dao.daointerfaces.IDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public abstract class InsuranceCalculatorDao<T> implements IDao<T> {
	private SqlSessionFactory factory;
	private final Class<T> defaultClass;
	protected static IOManager io = IOManager.getInstance();
	
	public InsuranceCalculatorDao(Class<T> defaultClass) {
		this.defaultClass = defaultClass;
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			Properties props = new Properties();
			props.load(Resources.getResourceAsStream("dbProps/localDB.properties"));
			factory = new SqlSessionFactoryBuilder().build(is, props);
		}
		catch (Exception e) {
			io.reportError(e);
		}
	}

	public SqlSession getSession() {
		return factory.openSession();
	}
	
	public String getDefaultClassName() {
		return defaultClass.getSimpleName().toLowerCase();
	}
	
	@Override
	public void create(T domain) {
		try {
			SqlSession session = getSession();
			session.update(domain.getClass().getSimpleName().toLowerCase() + ".create", domain);
			session.commit();
		}
		catch (Exception e) {
			io.reportError(e);
		}
	}
	
	@Override
	public T read(int id) {
		try {
			SqlSession session = getSession();
			return session.selectOne(getDefaultClassName() + ".read", id);
		}
		catch (Exception e) {
			io.reportError(e);
		}
		return null;
	}
	
	@Override
	public void update(T domain) {
		try {
			SqlSession session = getSession();
			session.update(domain.getClass().getSimpleName().toLowerCase() + ".update", domain);
			session.commit();
		}
		catch (Exception e) {
			io.reportError(e);
		}
	}
	
	@Override
	public void delete(int id) {
		try {
			SqlSession session = getSession();
			session.delete(getDefaultClassName() + ".delete", id);
			session.commit();
		}
		catch (Exception e) {
			io.reportError(e);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> readAll(){
		SqlSession session = getSession();
		return session.selectList(getDefaultClassName() + ".readAll").stream().map(obj -> (T) obj).collect(Collectors.toList());
	}
}