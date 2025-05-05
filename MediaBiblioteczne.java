public class MediaBiblioteczne {
    protected String tytul;
    protected int rokwydania;
   protected boolean dostepny;

    public MediaBiblioteczne(int rokwydania, String tytul) {
        this.rokwydania = rokwydania;
        this.tytul = tytul;
        this.dostepny = true;
    }
    public void wypozycz(){
        if (dostepny){
            dostepny=false;
            System.out.println("Wypozyczono"+"  "+tytul);
        }
        else{
            System.out.println(tytul+"  "+"nie jest dostepny");
        }
    }
    public void zwroc(){
        if (!dostepny){
            dostepny=true;
            System.out.println("Zwrócono"+"  "+tytul);
        }
        else {
            System.out.println(tytul + "  " + "nie  był/a wypozyczony/a");
        }
    }

    public void wyswietlInformacje() {
        String status=dostepny? "dostępne":"wypozyczone";
        System.out.println("tytuł"+" "+tytul+"  "+"status: "+status+" "+"rok wydania"+"  "+rokwydania);
    }

}
