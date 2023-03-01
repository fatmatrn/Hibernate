package tekrarcom.tekrarhb01.tekrarannotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {
    public static void main(String[] args) {
//         Worker01 worker01 =  new Worker01();
//         worker01.setId(101);
//         worker01.setName("Samet Guler");
//         worker01.setAge(90);

//         Worker01 worker02 = new Worker01();
//        worker02.setId(102);
//        worker02.setName("Fatma");
//        worker02.setAge(100);
//
//        Worker01 worker03 = new Worker01();
//        worker03.setId(103);
//        worker03.setName("Rabis");
       // worker03.setAge(950);


        Configuration con = new Configuration().
                configure("hibernate.cfg.xml").addAnnotatedClass(Worker01.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =  session.beginTransaction();

        //session.save(worker01);
       //session.save(worker02);
        //session.save(worker03);


        tx.commit();

        session.close();
        sf.close();

    }
}
