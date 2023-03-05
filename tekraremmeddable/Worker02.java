package tekrarcom.tekrarhb02.tekraremmeddable;

import javax.persistence.*;

@Entity
@Table(name="t_worker02")
public class Worker02 {
    @Id
    private int id;

    @Column(name="worker_name",length = 100,nullable = false,unique =false)
    private String name;

    private  int age;

    @Embedded
    private Works works;

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

    public Works getWorks() {
        return works;
    }

    public void setWorks(Works works) {
        this.works = works;
    }

    @Override
    public String toString() {
        return "Worker02{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
