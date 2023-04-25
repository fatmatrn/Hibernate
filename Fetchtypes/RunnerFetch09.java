package tekrarcom.tekrarhb09.fetchtypes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch09 {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker09.class).addAnnotatedClass(Gorev09.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // get methodu sonra delete methodunu kullanalım ;
        //session.delete(session.get(Gorev09.class,101));
      //  session.delete(session.get(Gorev09.class,102));
      //session.get(Worker09.class,1001);
         //session.delete(session.get(Worker09.class,1002));

      Worker09 worker = session.get(Worker09.class,1003);
          Gorev09 gorev = session.get(Gorev09.class,105);



        tx.commit();
        session.close();

        for (Gorev09 w:worker.getGorevList()){
            System.out.println(w);
        }
        sf.close();

    }
}
