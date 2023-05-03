package tekrarcom.tekrarhb12.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch12 {
    public static void main(String[] args) {


        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker12.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        System.out.println("ilk get");
        Worker12 worker12 = session.get(Worker12.class,1L);

        //session.clear();//session a gelenleri sifirlar
//        System.out.println("2. get islemi"); // ayni session da ilk fetch lemede geleni cache ledi
//                                              //bu yuzden 2. kere ayni seyi cagirdigimiz da kendi cache sinden kullandi
//        Worker12 worker13 = session.get(Worker12.class,1L);

        tx.commit();
        session.close();

        Session session2 = sf.openSession();
        Transaction tx2 = session2.beginTransaction();
        System.out.println("farkli session actik get");//yeni session sifir olarak geldi tekrar query yapti.yani data yi yeniden getirdi
        Worker12 worker14 = session2.get(Worker12.class,1L);

        //second seviye cache yi hibernate.cfg.xml den ekleyip aktiflestirdikten sonra session lar degisse bile ayni query uzerinden datalarin geldigini gorduk
        //

        tx2.commit();
        session2.close();
        sf.close();
    }
}
