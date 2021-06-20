package _10_POO;

public class _10_HeritageFille extends _10_Heritage_Modificateurs_Portee {
    //Redéfiniton
    @Override
    public void redefinition() {
        super.redefinition();
        System.out.println("Et aussi un autre");
    }

    @Override
    public void utilisationEnumMethodeAbstraite() {
        System.out.println(Enum.LUNDI + " " + Enum.LUNDI.ordinal());
    }

    //Surcharge
    public void redefinition(String msg){
        System.out.println(msg);
    }
}
