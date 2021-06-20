package _10_POO;

public abstract class _10_Heritage_Modificateurs_Portee implements Interface {
    //Test sur la visibilité et modificateurs
    private int pvt;
    int pck;
    protected int pttd;
    public int pub;
    public static int STATIC;
    public final static int FINAL_STATIC = 98;
    //bloc static lancé au premier chargement de la classe en mémoire
    static {
        STATIC = 8;
    }
    public _10_Heritage_Modificateurs_Portee(){
        //constructeur par défaut pour les classes filles si non définis dans celle-ci
    }
    public void redefinition(){
        System.out.println("J'affiche un message");
    }
    public final void finalMethode(){
        System.out.println("Je ne peux pas être redéfinie");
    }
    @Override
    public void jeDoisEtreImplementee() {
        System.out.println("Je suis implémenté dans la classe mère");
    }
    public abstract void utilisationEnumMethodeAbstraite();
}