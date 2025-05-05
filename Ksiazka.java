

public class Ksiazka extends MediaBiblioteczne {
    private String autor;
    private int liczbastron;

    public Ksiazka(int rokwydania, String tytul, int liczbastron, String autor) {
        super(rokwydania, tytul);
        this.liczbastron = liczbastron;
        this.autor = autor;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Autor " + autor+" "+"Liczba stron"+" "+ liczbastron);
    }
    public void sprawdzliczbeStron(int liczbastron) {
        if (liczbastron>500) {
            System.out.println("to dluga ksiązka");
        }

        else {
            System.out.println("to dosyc krotka ksiazka");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLiczbastron() {
        return liczbastron;
    }

    public void setLiczbastron(int liczbastron) {
        this.liczbastron = liczbastron;
    }
}
