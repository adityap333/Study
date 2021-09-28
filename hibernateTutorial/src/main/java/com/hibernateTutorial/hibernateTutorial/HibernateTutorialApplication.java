
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.hibernateTutorial.hibernateTutorial.Alien;
import com.hibernateTutorial.hibernateTutorial.AlienName;

public class HibernateTutorialApplication {

	public static void main(String[] args) {
		AlienName an = new AlienName();
		an.setFname("sdfds");
		
		Alien telusko = new Alien();
		telusko.setAid(101);
		telusko.setAname(an);
		telusko.setAcolor("Green");

		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

		//ServiceRegistry req = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistery();
		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();
		
		Transaction transaction = session.beginTransaction();
		session.save(telusko); // save in db
		telusko = (Alien) session.get(Alien.class, 102); // get data from db
		transaction.commit();
		
		Session s2 = sf.openSession();
		Query q = session.createQuery("from Alien where aid=101");
		q.setCacheable(true);
		Alien a =(Alien) q.uniqueResult();//q.list() for list

	}

}
