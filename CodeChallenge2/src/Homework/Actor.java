package Homework;

public class Actor {
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Premiu[] getPremii() {
        return premii;
    }

    public void setPremii(Premiu[] premii) {
        this.premii = premii;
    }

    String nume;
    Integer varsta;
    Premiu[] premii;

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }
}
