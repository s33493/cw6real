
public class Film extends MediaBiblioteczne {
    private String rezyser;
    private int czasTrwania;

    public Film(int rokwydania, String tytul, int czasTrwania, String rezyser) {
        super(rokwydania, tytul);
        this.czasTrwania = czasTrwania;
        this.rezyser = rezyser;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Rezyser: " + rezyser+" "+"CZAS Trwania: " + czasTrwania);
    }
    public void sprawdzCzasTrwania(int czasTrwania) {
        if (czasTrwania > 120) {
            System.out.println("ten film jejst dlugi");
        }
        else {
            System.out.println("ten film jest krotki");
        }
    }
}
