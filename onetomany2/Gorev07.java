package tekrarcom.tekrarhb07.onetomany;

import javax.persistence.*;

@Entity
public class Gorev07 {
    @Id
    private int id;

    @Column(name="gorev_name")
    private String name;

    @ManyToOne
    @JoinColumn
    private Worker07 worker;

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

    public Worker07 getWorker() {
        return worker;
    }

    public void setWorker(Worker07 worker) {
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "Gorev07{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
