package tekrarcom.tekrarhb09.fetchtypes;

import com.hb09.fetchtypes.Student09;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Gorev09 {
    @Id
    private int id;

    private String name;

@ManyToOne
@JoinColumn
private Worker09 worker;

    public Worker09 getWorker() {
        return worker;
    }

    public void setWorker(Worker09 worker) {
        this.worker = worker;
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

    @Override
    public String toString() {
        return "Gorev09{" +
                "id=" + id +
                ", name='" + name + '\'' +

                '}';
    }
}
