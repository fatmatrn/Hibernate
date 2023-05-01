package tekrarcom.tekrarhb11.criteriaapi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Random;


public class RunnerSave11 {
    public static void main(String[] args) {





        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker11.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Random random = new Random();

        for (int i = 1; i <= 20; i++) {
            Worker11 worker1 = new Worker11();
            worker1.setName("worker_" + i);
            worker1.setAge(random.nextInt(100));
            session.save(worker1);
        }

        tx.commit();
        session.close();
        sf.close();


    }
}
