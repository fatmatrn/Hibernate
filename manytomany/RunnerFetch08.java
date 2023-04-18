package tekrarcom.tekrarhb08.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch08 {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker08.class).addAnnotatedClass(Gorev08.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();


        System.out.println(session.get(Worker08.class, 1002));
      // System.out.println(session.get(Gorev08.class, 101));

//        Worker08 worker1 = session.get(Worker08.class, 1001);
//        session.delete(worker1);

//        Gorev08 gorev1 =  session.get(Gorev08.class,102);
//        session.delete(gorev1);

        tx.commit();
        session.close();
        sf.close();

    }
}
