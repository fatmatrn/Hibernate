package tekrarcom.tekrarhb10.idgeneration;


import javax.persistence.*;


@Entity
public class Worker10 {
    @GeneratedValue(generator = "sequence",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="sequence",sequenceName = "wrk_seq",initialValue = 1000,allocationSize = 10)
    @Id
    private int id;

    @Column(name="worker_name",nullable = false)
    private String name;

    private int age;

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker10{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
