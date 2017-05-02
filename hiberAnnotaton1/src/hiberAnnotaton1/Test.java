package hiberAnnotaton1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {
	public static void main(String[] args) {
		
		
	Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	
	
	Employee e=new Employee();
	e.setId(1);
	e.setFName("Sunil");
	e.setLName("Gambhire");
		
	
	
	session.persist(e);
	t.commit();
	session.close();
	System.out.println("successfully code");
	
		
	}

}
