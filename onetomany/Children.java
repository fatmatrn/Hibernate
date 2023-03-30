package tekrarcom.tekrarhb6.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Children {
    @Id
    private int id;

    private String name;

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
        return "Children{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
