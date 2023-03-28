package tekrarcom.tekrarhb5.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch05 {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker05.class).addAnnotatedClass(Sirket.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // !!! get methodu
Worker05 worker = session.get(Worker05.class,1001);
        System.out.println(worker);
        System.out.println("************");
        System.out.println(worker.getAge());
        System.out.println("************");
        System.out.println(worker.getIseGirisT());
        System.out.println("************");
        System.out.println(worker.getSirket());

        // !!! HQL ile 1 id li üniversiteye giden bütün öğrencileri bulalım
        System.out.println("****hql****");
        String s = "from Worker05 w where w.sirket.id=101";
        List<Worker05>   l = session.createQuery(s).getResultList();
        for (Worker05 o: l){
            System.out.println(o);
        }

        tx.commit();
        session.close();
        sf.close();

    }
}
