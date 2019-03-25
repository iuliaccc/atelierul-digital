package Homework;

public class Studio {
    String nume;
    Film[] filme;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }
}
