package tekrarcom.tekrarhb5.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sirket {

    @Id
    private int id;

    @Column(nullable = false,unique = true)
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
        return "Sirket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
