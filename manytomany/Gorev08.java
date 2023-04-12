package tekrarcom.tekrarhb08.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Gorev08 {
    @Id
    private int id;

    private String name;


    @ManyToMany(mappedBy = "gorevList")
    private List<Worker08> workerList  = new ArrayList<>();

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

    public List<Worker08> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker08> workerList) {
        this.workerList = workerList;
    }

    @Override
    public String toString() {
        return "Gorev08{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
