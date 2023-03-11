package tekrarcom.tekrarhb03.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Dosya {

    @Id
    private int ssn;

    private int year;

    @OneToOne
    @JoinColumn(name="wr_id")
    private Worker03 worker;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Worker03 getWorker() {
        return worker;
    }

    public void setWorker(Worker03 worker) {
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "Dosya{" +
                "ssn=" + ssn +
                ", year=" + year +
                ", worker=" + worker +
                '}';
    }
}
