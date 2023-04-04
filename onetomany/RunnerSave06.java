package tekrarcom.tekrarhb6.onetomany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import tekrarcom.tekrarhb5.manytoone.Worker05;

public class RunnerSave06 {
    public static void main(String[] args) {


        Worker06 worker1 = new Worker06();
        worker1.setId(1001);
        worker1.setName("Ezgi1111");
        worker1.setAge(20);

        Worker06 worker2 = new Worker06();
        worker2.setId(1002);
        worker2.setName("Ezgi2222");
        worker2.setAge(20);

        Worker06 worker3 = new Worker06();
        worker3.setId(1003);
        worker3.setName("Ezgi3333");
        worker3.setAge(20);


        Children child1 = new Children();
        child1.setId(1);
        child1.setName("C1");

        Children child2 = new Children();
        child2.setId(2);
        child2.setName("C2");

        Children child3 = new Children();
        child3.setId(3);
        child3.setName("C3");

       worker1.getChildrenList().add(child1);
       worker1.getChildrenList().add(child2);
       worker2.getChildrenList().add(child2);

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker06.class).addAnnotatedClass(Children.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(worker1);
        session.save(worker2);
        session.save(worker3);
        session.save(child1);
        session.save(child2);
        session.save(child3);


        tx.commit();
        session.close();
        sf.close();
    }




}
