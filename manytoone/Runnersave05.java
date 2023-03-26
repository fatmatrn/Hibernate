package tekrarcom.tekrarhb5.manytoone;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runnersave05 {
    public static void main(String[] args) {
        Worker05 worker1 = new Worker05();
        worker1.setId(1001);
        worker1.setName("Ezgi");
        worker1.setAge(20);

         Worker05 worker2 = new Worker05();
        worker2.setId(1002);
        worker2.setName("Betul");
        worker2.setAge(18);

         Worker05 worker3 = new Worker05();
        worker3.setId(1003);
        worker3.setName("Aliye");
        worker3.setAge(21);

        Worker05 worker4 = new Worker05();
        worker4.setId(1004);
        worker4.setName("Aliyeze");
        worker4.setAge(21);

        Worker05 worker5 = new Worker05();
        worker5.setId(1005);
        worker5.setName("Hayriye");
        worker5.setAge(21);



        Sirket sirket = new Sirket();
        sirket.setId(101);
        sirket.setName("Alize");
         Sirket sirket1 = new Sirket();
        sirket1.setId(102);
        sirket1.setName("Alize3333");

        worker4.setSirket(sirket1);
        worker1.setSirket(sirket1);
        worker2.setSirket(sirket);
        worker3.setSirket(sirket);

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker05.class).addAnnotatedClass(Sirket.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(sirket);
        session.save(worker1);
        session.save(worker2);
        session.save(worker3);
        session.save(worker4);
        session.save(sirket1);
        session.save(worker5);


        tx.commit();
        session.close();
        sf.close();



    }
}
