package tekrarcom.tekrarhb4.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave04 {

    public static void main(String[] args) {
        Worker04 worker1 = new Worker04();
        worker1.setId(1001);
        worker1.setName("Hakan");
        worker1.setAge(30);

        Worker04 worker2 = new Worker04();
        worker2.setId(1002);
        worker2.setName("Ayse");
        worker2.setAge(41);

        Worker04 worker3 = new Worker04();
        worker3.setId(1003);
        worker3.setName("Tulay");
        worker3.setAge(27);

        Dosya04  dosya1 = new Dosya04();
        dosya1.setId(101);
        dosya1.setName("Hakanin dosyasi");
        dosya1.setYear(5);
        dosya1.setWorker(worker1);

        Dosya04 dosya2 = new Dosya04();
        dosya2.setId(102);
        dosya2.setName("sahipsiz dosya");

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker04.class).addAnnotatedClass(Dosya04.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(worker1);
        session.save(worker2);
        session.save(worker3);

        session.save(dosya1);
        session.save(dosya2);


        tx.commit();
        sf.close();
        session.close();



    }
}
