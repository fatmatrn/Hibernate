package tekrarcom.tekrarhb02.tekraremmeddable;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnnerFetch02 {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Worker02.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Worker02 worker = session.get(Worker02.class,12);
        System.out.println(worker);
        System.out.println(worker.getWorks());

        tx.commit();
        sf.close();
        session.close();

    }
}
