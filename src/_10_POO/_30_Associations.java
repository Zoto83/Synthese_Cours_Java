package _10_POO;

public class _30_Associations {
    //Association
    /*
    Remparque : La différence entre association et agrégation est conceptuelle. Le codage de ces deux associations est identiques en C#.

    Définitions en français :
        La dépendance est l'utilisation ponctuelle d'une classe pour couvrir les besoins d'une méthode(ou autres?). Classe A a besoin de Classe B pour éxectuer une tâche. Use and Drop.
        L'association est une relation dans laquelle tous les objets ont leur propre cycle de vie. Dans une association, nous ne pouvons pas dire que B fait partie de A. La relation est N à N (N = 0 ou 1 ou *)
        L'agrégation  est une relation dans laquelle tous les objets ont leur propre cycle de vie. Dans une agrégation,  nous    pouvons     dire que B fait partie de A. La relation est N à N  (N = 0 ou 1 ou *)
        La composition est une relation dans laquelle tous les Composants on leur cycle de vie lié au Composé. De plus les Composants ne peuvent pas appartenir à d'autre Composé. La relation est 1 à N (N = 0 ou 1 ou *)

    Exemples en francais :
        Dépendance  : Un musicien a besoin d'un instrument pour jouer un morceau de musique. A la fin du morceau, le musicien n'a plus besoin de l'instrument, il ne garde pas de référence à celui-ci.
        Association : Un conducteur a ou non une voiture et une voiture est ou non conduite par un conducteur. Cependant nous ne pouvons pas dire que l'un fait parti de l'autre.
        Agrégation  : Les roues font parti d'une voiture, et une voiture a besoin de roues. Les roues sont constituantes de la voiture mais peuvent cependant être remplacées par d'autre. Idem pour le moteur
                         Un morceau de musique peut faire partie de plusieurs albums. Agrégation => Album 0..* et Morceau 1. Cependant il y a bien la notion de faire parti d'un ensemble.
        Composition : Une voiture est constituée d'un chassis. Celui-ci est indissociable de la voiture. Si la voiture est détruite, le chassis aussi.

    Phrase type et exemple :
        Dépendance  : A references to B     : Musicien.JouerMorceauDeMusique ( Instrument instrument ) { Do Ré Mi Fa Sol La Si Do}
        Association : A uses B              : class Conducteur { Voiture voiture }
        Agrégation  : A has B               : class Voiture { Roue[] roues; Moteur moteur }
        Composition : A owns B              : class Voiture { Chassis chassis = new Chassis() }
    */

    //Multiplicité
    /* La multiplicité est le nombre d'objet associés
     * Par exemple :
     *      Une voiture est associé  à 0 ou 1 conducteur    : 1 -> 0..1
     *      Une voiture est associé à 1 chassis             : 1 -> 1
     *      Une voiture est associé à n trajet              : 1 -> 0..*
     */

    //Navivabilité
    /* Unidirectionnelle :
     *      En connaissant la voiture, on peut connaitre le conducteur mais pas l'inverse
     * Bidirectionnelle :
     *      En connaissant la voiture, on peut connaitre le conducteur et inversement
     */
}
