package tekrarcom.tekrarhb01.tekrarannotation;

import javax.persistence.*;

@Entity
@Table(name="t_worker01")
public class Worker01 {
    @Id
    //@Column(name="std_id")
    private int id;

    @Column(name="worker_name",length = 100,nullable = false,unique = false)
    private String name;

   // @Transient
    private int age;

    //getter setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Worker01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
