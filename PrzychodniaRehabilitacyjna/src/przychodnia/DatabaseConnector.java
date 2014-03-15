package przychodnia;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public final class DatabaseConnector {

	private static SessionFactory factory;

	public DatabaseConnector() {
		try {
			Configuration config = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(config.getProperties());
			factory = config.buildSessionFactory(builder.build());
		} catch (HibernateException he) {
			he.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

	public static void main(String[] args) {
		DatabaseConnector test = new DatabaseConnector();
		Session session = DatabaseConnector.getSessionFactory().openSession();
		session.close();

	}

}
