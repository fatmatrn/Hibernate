package tekrarcom.tekrarhb08.manytomany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.ArrayList;
import java.util.List;

public class RunnerSave08 {
    public static void main(String[] args) {
        Worker08 worker1 = new Worker08();
        worker1.setId(1001);
        worker1.setName("worker_1");
        worker1.setAge(25);

        Worker08 worker2 = new Worker08();
        worker2.setId(1002);
        worker2.setName("worker_2");
        worker2.setAge(25);

        Worker08 worker3 = new Worker08();
        worker3.setId(1003);
        worker3.setName("worker_3");
        worker3.setAge(25);

        Gorev08 gorev1 = new Gorev08();
        gorev1.setId(101);
        gorev1.setName("utuleme");

        Gorev08 gorev2 = new Gorev08();
        gorev2.setId(102);
        gorev2.setName("satis");

        List<Gorev08> gorevList1 =   new ArrayList<>();
        gorevList1.add(gorev1);
        gorevList1.add(gorev2);
        List<Gorev08> gorevList2 =   new ArrayList<>();
        gorevList2.add(gorev1);
        List<Gorev08> gorevList3 =   new ArrayList<>();
        gorevList2.add(gorev1);

        worker1.setGorevList(gorevList1);
        worker2.setGorevList(gorevList2);
        worker3.setGorevList(gorevList3);


        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker08.class).addAnnotatedClass(Gorev08.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();


        session.save(worker1);
        session.save(worker2);
        session.save(worker3);
        session.save(gorev1);
        session.save(gorev2);


        tx.commit();
        session.close();
        sf.close();

    }

}
