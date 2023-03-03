package tekrarcom.tekrarhb02.tekraremmeddable;


import javax.persistence.Embeddable;

@Embeddable
public class Works {
private int  cut;
private int copy;
private int  paste;

    public int getCut() {
        return cut;
    }

    public void setCut(int cut) {
        this.cut = cut;
    }

    public int getCopy() {
        return copy;
    }

    public void setCopy(int copy) {
        this.copy = copy;
    }

    public int getPaste() {
        return paste;
    }

    public void setPaste(int paste) {
        this.paste = paste;
    }

    @Override
    public String toString() {
        return "Works{" +
                "cut=" + cut +
                ", copy=" + copy +
                ", paste=" + paste +
                '}';
    }
}
