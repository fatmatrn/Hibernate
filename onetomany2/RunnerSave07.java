package tekrarcom.tekrarhb07.onetomany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave07 {
    public static void main(String[] args) {
        Worker07 worker1  = new Worker07();
        worker1.setId(1001);
        worker1.setName("Hamza");
        worker1.setAge(25);

        Worker07 worker2  = new Worker07();
        worker2.setId(1002);
        worker2.setName("Selim");
        worker2.setAge(25);

        Worker07 worker3  = new Worker07();
        worker3.setId(1003);
        worker3.setName("Bekir");
        worker3.setAge(25);

        Gorev07 gorev1 = new Gorev07();
        gorev1.setId(1);
        gorev1.setName("kesme");

         Gorev07 gorev2 = new Gorev07();
        gorev2.setId(2);
        gorev2.setName("dikme");

         Gorev07 gorev3 = new Gorev07();
        gorev3.setId(3);
        gorev3.setName("utuleme");

         Gorev07 gorev4 = new Gorev07();
        gorev4.setId(4);
        gorev4.setName("Kalite Kontrol");

         Gorev07 gorev5 = new Gorev07();
        gorev5.setId(5);
        gorev5.setName("paketleme");

        gorev1.setWorker(worker1);
        gorev2.setWorker(worker2);
        gorev4.setWorker(worker3);
        gorev3.setWorker(worker3);



        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker07.class).addAnnotatedClass(Gorev07.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(worker1);
        session.save(worker2);
        session.save(worker3);
        session.save(gorev1);
        session.save(gorev2);
        session.save(gorev3);
        session.save(gorev4);
        session.save(gorev5);

        tx.commit();
        session.close();
        sf.close();

    }

    }
