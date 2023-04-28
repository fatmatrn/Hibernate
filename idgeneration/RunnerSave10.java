package tekrarcom.tekrarhb10.idgeneration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave10 {
    public static void main(String[] args) {
        Worker10  worker1 = new Worker10();
        worker1.setName("worker_1");
        worker1.setAge(25);



//
//        Gorev10 gorev1 = new Gorev10 ();
//        gorev1.setId(101);
//        gorev1.setName("A");







        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker10.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();


session.save(worker1);


        tx.commit();
        session.close();
        sf.close();


    }
}
