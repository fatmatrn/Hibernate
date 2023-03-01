package tekrarcom.tekrarhb01.tekrarannotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerFetch01 {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Worker01.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();


        Transaction tx = session.beginTransaction();

        //1.yol get()
//        Worker01 worker01 = session.get(Worker01.class,101);
//        Worker01 worker02 = session.get(Worker01.class,102);
//        Worker01 worker03 = session.get(Worker01.class,103);
//
//        System.out.println(worker01);
//        System.out.println(worker02);
//        System.out.println(worker03);

        //2.yol SQL
//        String sqlQuery = "select * from t_worker01";
//        List<Object[]> resultList = session.createSQLQuery(sqlQuery).getResultList();
//
//        for (Object[]  object:resultList){
//            System.out.println(Arrays.toString(object));
//        }


        //3.yol
     String hqlQuery = "from Worker01";
        List<Worker01> resultList2 = session.createQuery(hqlQuery,Worker01.class).getResultList();
        for (Worker01 worker01:resultList2){
            System.out.println(worker01);
        }

        //****************************************sql***************************************************
//        String sql = "select * from t_worker01 where worker_name='Rabis'";
//        Object[]  tekSonuc = (Object[]) session.createSQLQuery(sql).uniqueResult();
//        System.out.println(Arrays.toString(tekSonuc));
//
//        System.out.println(tekSonuc[0]+"-"+tekSonuc[1]+"-"+tekSonuc[2]);
//
//        //*******************************************hql******************************************************
//       String hql =  "from Worker01 where name='Fatma'";
//       Worker01 tekSonuc2 = session.createQuery(hql,Worker01.class).uniqueResult();
//        System.out.println(tekSonuc2);

//
        String aliashql2 = "select wr.name,wr.id from Worker01 wr where wr.age=100";
        
       List<Object[]> l =  session.createQuery(aliashql2).getResultList();

for (Object[] w:l){
    System.out.println(Arrays.toString(w));
}
        tx.commit();

        session.close();
        sf.close();
    }
}
