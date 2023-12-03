package org.example.javaFundamentals.november.jedenasty;

public class Tale {
    //getters are used to retrieve the value of a given field
    //setters are used to set the value of a given field
    //táto trieda je šablóna budúceho objektu
    //settry a gettry a construktor viem spustiť cez klávesovú skratku (control a späť(enter))
    private String nazev;//(field)
    private String autor;//k private fieldu pristupujem cez setter
    private String content;//slúžia na to, aby mi držali stav objektu (neviem, čo to znamená)
    //asi to, že objekt karkulka ma konkrétny názov, autora a obsah
    //toto je private preto, aby to zachovalo princípi objektového typu programovania

    //construktor je špeciálna metóda, ktorá nemá void a musí sa volať presne ako trieda
    public Tale() {//constructor
        //každá trieda obsahuje defaultní (prázdny) konstruktor
        // čiže ak tam nič nedávam, nemusím to vôbec písať
        //v TaleReader všase kde píše Tale() mi tam hodí tento prázdny konstruktor
        //konštruktorov môže byť koľko chceme, ale musia sa líšiť buď typom, alebo počtom argumentov
        //ak používam viac konštruktorov, tak musím napísať aj ten prázdny ak ho budem chcieť používať,
        // to už java za mňa neurobí
    }

    public Tale(String nazev) {//construktor
        this.nazev = nazev;
    }

    public Tale(String nazev, String autor, String c) {//constructor
        this.nazev = nazev;
        this.autor = autor;
        this.content = c;
    }

    public void setContent(String content) {
        this.content = content;
    }//setry mi slúžia aby som vedela nastaviť daný stav objektu

    public void setAutor(String autor) {

        this.autor = autor;
    } //(metóda)

    public void setNazev(String n) {
        nazev = n;
    }

    public String getNazev() {//getter je public metóda, ktorá vracia dátový typ fieldu,
        // neberie žiadny argument, jediné čo robí je, že vracia názov z private(z vrchu)
        return nazev;
    }

    public String getAutor() {
        return autor;
    }

    public String getContent() {
        return content;
    }

    public String sayTale() {//metóda

        return nazev + "\n" + autor + ": " + content + "\n";
    }
}
//trieda je nekolik fieldu, ktoré môžu byť rôzneho typu(pole, string, int...toto na vrchu),
// pre prístup k fieldu používame getter a vracia typ rovnaký ako field, setter je void metóda,
// ktorá príjíma nejaký argument a nastavuje nejaký field triede