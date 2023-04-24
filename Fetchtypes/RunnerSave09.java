package tekrarcom.tekrarhb09.fetchtypes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import tekrarcom.tekrarhb08.manytomany.Gorev08;
import tekrarcom.tekrarhb08.manytomany.Worker08;

import java.util.List;

public class RunnerSave09 {
    public static void main(String[] args) {
        Worker09 worker1 = new Worker09();
        worker1.setId(1001);
        worker1.setName("worker_1");
        worker1.setAge(25);
          Worker09 worker2 = new Worker09();
        worker2.setId(1002);
        worker2.setName("worker_2");
        worker2.setAge(25);
          Worker09 worker3 = new Worker09();
        worker3.setId(1003);
        worker3.setName("worker_3");
        worker3.setAge(25);



        Gorev09 gorev1 = new Gorev09();
        gorev1.setId(101);
        gorev1.setName("A");

        Gorev09 gorev2 = new Gorev09();
        gorev2.setId(102);
        gorev2.setName("S");

        Gorev09 gorev3 = new Gorev09();
        gorev3.setId(103);
        gorev3.setName("D");

        Gorev09 gorev4 = new Gorev09();
        gorev4.setId(104);
        gorev4.setName("F");

        Gorev09 gorev5 = new Gorev09();
        gorev5.setId(105);
        gorev5.setName("G");

        Gorev09 gorev6 = new Gorev09();
        gorev6.setId(106);
        gorev6.setName("bos");


        worker1.getGorevList().add(gorev1);
        worker1.getGorevList().add(gorev2);
        worker2.getGorevList().add(gorev3);
        worker2.getGorevList().add(gorev4);
        worker3.getGorevList().add(gorev5);

        gorev1.setWorker(worker1);
        gorev2.setWorker(worker1);
        gorev3.setWorker(worker2);
        gorev4.setWorker(worker2);
        gorev5.setWorker(worker3);



        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker09.class).addAnnotatedClass(Gorev09.class);

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
