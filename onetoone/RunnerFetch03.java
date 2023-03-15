package tekrarcom.tekrarhb03.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch03 {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker03.class).addAnnotatedClass(Dosya.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Worker03 worker1 = session.get(Worker03.class,101);
       // Worker03 worker2 = session.get(Worker03.class,102);
        Dosya dosya = session.get(Dosya.class,1234);

        System.out.println(worker1);
        System.out.println("***************");
        System.out.println(dosya);
        System.out.println("*******************");
        System.out.println(dosya.getWorker());




        tx.commit();
        sf.close();
        session.close();
    }


}
