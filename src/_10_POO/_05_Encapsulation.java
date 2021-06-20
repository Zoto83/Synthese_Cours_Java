package _10_POO;

public class _05_Encapsulation {
    //La variable varEnscapsule n'est pas accessible depuis l'extérieur directement
    //Il nous faut passer par le getter et le setter pour la modifier depuis l'extérieur
    //Le getter setter permet de vérifier les donnés si besoin
    private int varEnscapsule;
    public void setVarEnscapsule(int value){
        varEnscapsule = value;
    }
    public int getVarEnscapsule(){
        return varEnscapsule;
    }
}
