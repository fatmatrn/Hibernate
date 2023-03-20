package tekrarcom.tekrarhb4.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch04 {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Worker04.class).addAnnotatedClass(Dosya04.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // belli id li Workerı getirelim
//        System.out.println("***********************");
//        Worker04 w1 = session.get(Worker04.class,1001);
//        System.out.println(w1);

        //!!! dosya04 u get edelim
//      System.out.println("*******getdiary********");
//         Dosya04 d1 = session.get(Dosya04.class,101);
//        System.out.println(d1);
//        System.out.println("-----------------------------");
//        Dosya04 d2 = session.get(Dosya04.class,102);
//        System.out.println("-----------------------------");
//        System.out.println(d2);
//        System.out.println(d1.getWorker());

        // !!! Kesişim kümesini getirelim ( Inner Join )*************************
//        System.out.println("( Inner Join )*************************");
//        String s1 = "select w.name,d.name from Worker04 w inner join fetch Dosya04 d on w.id=d.worker";
//        List<Object[]>    o1  = session.createQuery(s1).getResultList();
//        for (Object[]   o:o1){
//            System.out.println(Arrays.toString(o));
//        }
        // !!! HQL LEFT JOIN *************************************
        // Kısaca bütün isciler ve dosyasi olan iscilerii istiyorum
//
//        String s2 = "select w.name,d.name  from Worker04 w left join fetch Dosya04 d on w.id=d.worker";
//        List<Object[]>    o2  =session.createQuery(s2).getResultList();
//        o2.forEach(t-> System.out.println(Arrays.toString(t)));

        // kısaca : Bütün dosyalar ve dosyasi olan isciler

//        String s3 = "select d.name,w.name  from Worker04 w right join fetch Dosya04 d on w.id=d.worker";
//        List<Object[]>    o3  =session.createQuery(s3).getResultList();
//        o3.forEach(t-> System.out.println(Arrays.toString(t)));

        // Kısaca : bütün student ve diary bilgileri getir
        String  s4 = "select w.name,d.name   from Worker04 w full join Dosya04  d  on w.id=d.worker";
        List<Object[]> o4 = session.createQuery(s4).getResultList();
          for (Object[] o : o4){
              System.out.println(Arrays.toString(o));
          }

        tx.commit();
        session.close();
        sf.close();
    }
}
