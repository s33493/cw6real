import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka(1985,"wladcamóch",501,"maks pich");
        Ksiazka ksiazka2 = new Ksiazka(2112,"najak",80,"makspisopson");
        Film film1 = new Film(1233,"najak3",122,"stass");
        Film film2 = new Film(1222,"najak8",63,"stas3");

        MediaBiblioteczne[] mediaBiblioteczne=new MediaBiblioteczne[4];
        mediaBiblioteczne[0]=ksiazka1;
        mediaBiblioteczne[1]=ksiazka2;
        mediaBiblioteczne[2]=film1;
        mediaBiblioteczne[3]=film2;
        for (int i=0;i<mediaBiblioteczne.length;i++){
            mediaBiblioteczne[i].wyswietlInformacje();
        }
        ksiazka1.wypozycz();
        ksiazka1.wypozycz();
        ksiazka2.wypozycz();
        ksiazka2.zwroc();
        ksiazka1.sprawdzliczbeStron(ksiazka1.getLiczbastron());
    }
}
