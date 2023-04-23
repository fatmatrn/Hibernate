package tekrarcom.tekrarhb09.fetchtypes;

import tekrarcom.tekrarhb08.manytomany.Gorev08;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Worker09 {
    @Id
    private int id;

    @Column(name="worker_name",nullable = false)
    private String name;

    private int age;

    @OneToMany(mappedBy = "worker",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
private List<Gorev09> gorevList = new ArrayList<>();

    public List<Gorev09> getGorevList() {
        return gorevList;
    }

    public void setGorevList(List<Gorev09> gorevList) {
        this.gorevList = gorevList;
    }

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
        return "Worker09{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gorevList=" + gorevList +
                '}';
    }
}
