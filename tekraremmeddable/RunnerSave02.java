package tekrarcom.tekrarhb02.tekraremmeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave02 {

    public static void main(String[] args) {
        Worker02 worker1 = new Worker02();
        worker1.setId(11);
        worker1.setName("Ayse");
        worker1.setAge(21);


        Works works1 = new Works();
        works1.setCut(3);
        works1.setCopy(5);
        works1.setPaste(10);
        worker1.setWorks(works1);

        Worker02 worker2 = new Worker02();
        worker2.setId(12);
        worker2.setName("Fatma");
        worker2.setAge(57);

        Works works2 = new Works();
        works2.setCut(7);
        works2.setCopy(6);
        works2.setPaste(12);

        worker2.setWorks(works2);

         Worker02 worker3 = new Worker02();
        worker3.setId(13);
        worker3.setName("Hayriye");
        worker3.setAge(39);

 Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker02.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(worker1);
        session.save(worker2);


        tx.commit();
        sf.close();
        session.close();


    }

}
