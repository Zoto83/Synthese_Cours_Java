package _00_Initiation_et_procedurale;

public class _50_Procedure_Fonction {
    //On appel les procédure et fonction par leur nom et paramètre.
    public static void main(String[] args) {
        afficherTexte();
        System.out.println(texteRecupere());
        System.out.println(fonctionParametree(1,2, "L'addition de 1 et 2 est : "));
        //On peut appeler les procédures ou fonctions les unes dans les autres
        System.out.println(fonctionParametree(1,2, texteRecupere()));
    }
    //Un procédure est un groupe d'instructions qui ne renvoie pas de donnée le mot clé est void
    public static void afficherTexte(){
        System.out.println("Mon Texte");
    }
    //Une fonction est un groupe d'instructions qui renvoie un type de donnée.
    //Ce type se retrouve à la place du mot void.
    //Une fonction doit renvoyer une valeur du type du retour
    public static String texteRecupere(){
        return "Mon texte retourné par la fonction ";
    }
    //Nous pouvons passer des paramètres aux procédures et aux fonctions dans les parenthèses.
    //Les paramètres peuvent être de types primitifs ou objet
    public static String fonctionParametree(int a, int b, String monMessage){
        int calcul = a+b;
        return monMessage + calcul;
    }
}
