package tekrarcom.tekrarhb12.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import tekrarcom.tekrarhb11.criteriaapi.Worker11;

import java.util.Random;


public class RunnerSave12 {
    public static void main(String[] args) {

        Worker12 worker1 = new Worker12();
        worker1.setName("worker_1" );
        worker1.setAge(45);
         Worker12 worker2 = new Worker12();
        worker2.setName("worker_2" );
        worker2.setAge(45);
         Worker12 worker3 = new Worker12();
        worker3.setName("worker_3" );
        worker3.setAge(45);




        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker12.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(worker1);
        session.save(worker2);
        session.save(worker3);


        tx.commit();
        session.close();
        sf.close();


    }
}
