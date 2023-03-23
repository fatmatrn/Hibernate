package tekrarcom.tekrarhb5.manytoone;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Worker05 {
    @Id
    private int id;

    @Column(name="wr_name",nullable = false)
    private String name;

    private int age;

    @ManyToOne
    @JoinColumn(name="srkt_id")
    private  Sirket sirket;

    private LocalDateTime iseGirisT;



    @PrePersist
   public  void prePersist(){
       iseGirisT=LocalDateTime.now();
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

    public Sirket getSirket() {
        return sirket;
    }

    public void setSirket(Sirket sirket) {
        this.sirket = sirket;
    }

    public LocalDateTime getIseGirisT() {
        return iseGirisT;
    }

    @Override
    public String toString() {
        return "Worker05{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sirket=" + sirket +
                ", iseGirisT=" + iseGirisT +
                '}';
    }
}
