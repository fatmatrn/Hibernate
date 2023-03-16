package tekrarcom.tekrarhb4.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Worker04 {

    @Id
    private int id;

    @Column(name="wr_name")
    private String name;

    private int age;

    @OneToOne(mappedBy = "worker")
    private Dosya04 dosya;

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

    public Dosya04 getDosya() {
        return dosya;
    }

    public void setDosya(Dosya04 dosya) {
        this.dosya = dosya;
    }

    @Override
    public String toString() {
        return "Worker04{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +

                '}';
    }
}
