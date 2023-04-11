package tekrarcom.tekrarhb07.onetomany;

import com.hb07.onetomany.Student07;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch07 {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Worker07.class).addAnnotatedClass(Gorev07.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // !!! get methodu
//
//        Worker07 worker1 = session.get(Worker07.class,1001);
//        System.out.println(worker1);
//
//
//        worker1.getGorevList().forEach(t->{
//            System.out.println(t);
//        });
        // !!! SQL ile isci bilgilerini alalım (isci ismi ve gorev ismi )
//String s = "Select w.worker_name,g.gorev_name  from worker07 w  inner join gorev07 g on w.id=g.worker_id";
       // "SELECT s.student_name,b.name FROM student07 s INNER JOIN book07 b ON s.id=b.student_id";
//List<Object[]> object1 = session.createSQLQuery(s).getResultList();
//for (Object[] w:object1) {
//    System.out.println(Arrays.toString(w));
//}
        // !!! yukardaki sorguyu HQL ile yazalım
//        String hs = "Select w.name,g.name  from Worker07 w  inner join fetch Gorev07 g on w.id=g.worker.id";
//        List<Object[]> object2 = session.createQuery(hs).getResultList();
//        for (Object[] w:object2) {
//            System.out.println(Arrays.toString(w));
//        }

        // !!! Delete işlemi SQL
//String s3 = "delete from gorev07";
//        int gorev2 = session.createSQLQuery(s3).executeUpdate();
//        System.out.println("ne silindi:"+gorev2);


//
//        // !!! Delete işlemi HQL
//String h3 = "delete from Worker07";
//int  siilinen = session.createQuery(h3).executeUpdate();
//        System.out.println("siilinen = " + siilinen);
//
//        // Gorev ismi "kesme" olan gorevi HQL ile siliniz
//String s4 = "delete from Gorev07 g where g.name='kesme'";
//
//int a =  session.createQuery(s4).executeUpdate();
//        System.out.println(a);


        // Kitab bilgisi olan bir Öğrenciyi silmek istersek bunu 2 yolu var :
        // 1) önce Book tablosundan ilişkili olduğu Book lar silinir daha sonra
        // istenen student objesi silinebilir
        //2) Student entity clasının ilgili yerine Cascade / orphanRemoval

        //
        // !!! 1001 id li worker objemi delete metoduyla silelim
//Worker07 worker  = session.get(Worker07.class,1001);
//        session.delete(worker);

        //student.getBookList().set(0,null); // orphanRemovel=true , 0.indexdeki child ı Child
        // tablosundan gider siler

        // !!!gorev ismi içinde "lem" geçen worker kayıtlarını alalım ( HQL )
String son = "select w from Worker07 w  join w.gorevList g where g.name like '%es%' ";
  List<Worker07>  worker07s = session.createQuery(son, Worker07.class).getResultList();
for (Worker07 w:worker07s){
    System.out.println(w);
}

        tx.commit();
        session.close();
        sf.close();
    }
}
