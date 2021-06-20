package _10_POO;

public class _20_Polymorphisme {
    public static void main(String[] args) {
        //Upcasting (automatique)
        _10_Heritage_Modificateurs_Portee varMere = new _10_HeritageFille();
        //DownCasting explicit
        _10_HeritageFille varFille = (_10_HeritageFille) varMere;
        //Expression lambda
        met( ()->System.out.println("exp lambda") );
    }
    public static void met(Interface i){
        System.out.println("fait");
    }
}
