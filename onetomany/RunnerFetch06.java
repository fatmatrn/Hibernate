package tekrarcom.tekrarhb6.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch06 {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker06.class).addAnnotatedClass(Children.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // !!! get methodu
        System.out.println(session.get(Worker06.class, 1001));
        System.out.println("*****************");
        System.out.println(session.get(Children.class, 2));
        System.out.println("*****************");
        System.out.println(session.get(Worker06.class, 1001).getChildrenList());

        // !!! HQL ile id si 1 olan cocugu getirelim

        System.out.println("****hql****");
        String s1 = "from Children where id=1";
        List<Children> children = session.createQuery(s1).getResultList();
        for (Children w : children) {
            System.out.println(w);
        }

        System.out.println("******worker********");
        String s3 = "from Worker06";
        List<Worker06>  ll = session.createQuery(s3).getResultList();
        for (Worker06 w:ll){
            System.out.println(w);
        }
        System.out.println("******worker  mappli********");
        List<Worker06> ll2 = session.createQuery(s3,Worker06.class).getResultList();
        for (Worker06 w:ll){
            System.out.println(w);
        }



        // !!! HQL bir öğrencinin kitaplarını öğrenci id ye göre getirme
        System.out.println("-----------------------------------------------");
        String s2 = "from Worker06 w inner join w.childrenList b where w.id=1001";
        List<Object[]> l = session.createQuery(s2).getResultList();
        for (Object[] w:l){
            System.out.println(Arrays.toString(w));
        }
            // !!! get() ile bir öğrencinin kitaplarını öğrenci id ye göre getirme
        System.out.println("///////////////////");
        System.out.println(session.get(Worker06.class, 1001).getChildrenList());

        tx.commit();
        session.close();
        sf.close();
    }
}
