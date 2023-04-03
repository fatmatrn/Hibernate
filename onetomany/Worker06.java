package tekrarcom.tekrarhb6.onetomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Worker06 {
    @Id
    private int id;

    @Column(name="worker_name")
    private String name;

    private int age;

    @OneToMany
    @JoinColumn
    private List<Children> childrenList=new ArrayList<>();


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

    public List<Children> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Children> childrenList) {
        this.childrenList = childrenList;
    }

    @Override
    public String toString() {
        return "Worker06{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", childrenList=" + childrenList +
                '}';
    }
}
