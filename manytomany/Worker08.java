package tekrarcom.tekrarhb08.manytomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Worker08 {
    @Id
    private int id;

    @Column(name="worker_name",nullable = false)
    private String name;

    private int age;

    @ManyToMany
    @JoinTable(name="Worker08_gorev08",
    joinColumns = {@JoinColumn(name="wrk_id")},
    inverseJoinColumns = {@JoinColumn(name="gorev_id")}
    )
    private List<Gorev08> gorevList =   new ArrayList<>();

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

    public List<Gorev08> getGorevList() {
        return gorevList;
    }

    public void setGorevList(List<Gorev08> gorevList) {
        this.gorevList = gorevList;
    }

    @Override
    public String toString() {
        return "Workwr08{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gorevList=" + gorevList +
                '}';
    }
}
