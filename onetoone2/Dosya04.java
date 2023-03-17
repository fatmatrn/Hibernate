package tekrarcom.tekrarhb4.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Dosya04 {

    @Id
    private int id;

    private String name;

    private int year;

    @OneToOne
    @JoinColumn(name="wr_id")
    private Worker04 worker;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Worker04 getWorker() {
        return worker;
    }

    public void setWorker(Worker04 worker) {
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "Dosya04{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", worker=" + worker +
                '}';
    }
}
