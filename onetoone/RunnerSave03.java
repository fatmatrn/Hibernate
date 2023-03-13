package tekrarcom.tekrarhb03.onetoone;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave03 {
    public static void main(String[] args) {
        Worker03 worker1 = new Worker03();
        worker1.setId(101);
        worker1.setName("Ali");
        worker1.setAge(32);

        Dosya dosya1 = new Dosya();
        dosya1.setSsn(1234);
        dosya1.setYear(5);
        dosya1.setWorker(worker1);

         Worker03 worker2 = new Worker03();
        worker2.setId(102);
        worker2.setName("Veli");
        worker2.setAge(40);

        Dosya dosya2 = new Dosya();
        dosya2.setSsn(4567);
        dosya2.setYear(10);
        dosya2.setWorker(worker2);


        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker03.class).addAnnotatedClass(Dosya.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(worker1);
        session.save(worker2);

        session.save(dosya1);
        session.save(dosya2);


        tx.commit();
        sf.close();
        session.close();


    }
}
