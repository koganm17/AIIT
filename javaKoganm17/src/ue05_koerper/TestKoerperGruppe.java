package ue05_koerper;


public class TestKoerperGruppe {

    
    public static void main (String[] args) {
        KoerperGruppe g = new KoerperGruppe();
        g.setDichte(Koerper.DICHTE_BUCHE);

        g.add(new Wuerfel(0.1, g.getDichte()));
        g.add(new Wuerfel(0.05, g.getDichte()));
        g.add(new Quader(0.1, 0.1, 0.2, g.getDichte()));
        g.add(new Quader(0.05, 0.1, 0.1, g.getDichte()));
        g.add(new Kugel(0.1, g.getDichte()));
        g.add(new Kugel(0.15, g.getDichte()));

        System.out.println("Koerpergruppe besteht aus " + g.size() + " KÃ¶rpern");
        System.out.println(g);

        System.out.println("");
        System.out.println(String.format("Gesamtmasse: %.3fkg", g.gesamtMasse()));
        System.out.println(String.format("Gesamtvolumen: %.3fdmÂ³", g.gesamtVolumen() * 1000));
    }

}
