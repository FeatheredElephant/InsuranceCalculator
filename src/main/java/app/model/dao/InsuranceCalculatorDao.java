package app.model.dao;

import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import app.IOManager;

public abstract class InsuranceCalculatorDao<T> implements Dao<T> {
	private SqlSessionFactory factory;
	protected IOManager io = IOManager.getInstance();
	
	public InsuranceCalculatorDao() {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			Properties props = new Properties();
			props.load(Resources.getResourceAsStream("cddb.properties"));
			factory = new SqlSessionFactoryBuilder().build(is, props);
		}
		catch (Exception e) {
			io.reportError(e);
		}
	}

	public SqlSession getSession() {
		return factory.openSession();
	}
	
	public boolean releaseSession(SqlSession session) {
		return false;
	}
}