package tekrarcom.tekrarhb07.onetomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Worker07 {

    @Id
    private int id;

    @Column(name="worker_name")
    private String name;

    private int age;

    @OneToMany(mappedBy = "worker",orphanRemoval = true,cascade = CascadeType.REMOVE)
    private List<Gorev07> gorevList = new ArrayList<>();

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

    public List<Gorev07> getGorevList() {
        return gorevList;
    }

    public void setGorevList(List<Gorev07> gorevList) {
        this.gorevList = gorevList;
    }

    @Override
    public String toString() {
        return "Worker07{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gorevList=" + gorevList +
                '}';
    }
}
