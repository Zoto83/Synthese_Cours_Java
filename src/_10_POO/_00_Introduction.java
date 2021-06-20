package _10_POO;

public class _00_Introduction {
    // Introduction
    /* Introduction :
     * Une classe représente un ensemble de données et méthodes caractérisant un objet de la "vie réelle" (voiture, camion, vélo, moto) ou une famille d'objet (véhicule)
     * La POO se repose sur 3 concepts :
     * Encapsulation : Le contrôle de la caractérisation de l'objet est géré par l'objet lui-même. En aucun cas une classe A utilisant une classe B ne peut accéder DIRECTEMENT aux caractéristiques de la classe B.
     *                 L'utilisation de getter/setter permet de contrôler l'accès à ces données et par exemple, créer des exceptions si les valeurs transmises de sont pas autorisées.
     * Héritage  : C'est dire que A est un B. On peut tout à faire dire qu'une voiture est un véhicule, mais le contraire n'est pas vrai
     *             Une classe A hérite d'une classe B signifie que A récupère toute les propriétés de B et peut en ajouter et/ou les modifier.
     *             Dire que A est un B est une spécialisation. A l'inverse, on peut dire que B est une généralisation de A.
     * Polymorphisme :
     *      Ad Hoc       : ??
     *      Paramétrique : Redéfinition de méthode. C'est la possibilité que des méthodes ai le même nom mais avec des signatures différences.
     *      Héritage     : Le polymorphisme est lié à l'héritage. La classe A étant un B, une variable de type B peut tout à fait contenir un A mais pas l'inverse.
     *
     * En procédurale, nous parlons de procédures et de fonctions. Ces termes en POO n'ont plus lieu d'être et sont remplacé par le terme de méthodes
     * En complément de ce que nous avons vu, nous parlons aussi de signature et de stéréotypes
     * La signature est constitué du nom, du nombre de paramètres et du type des paramètres de la méthode
     * Le stéréotype est la signature avec en plus la portée, les modifieurs (static, final etc...) et le type (void, Object, int ...)
     */

    // La visibilité
     /*
     * La portée d'une classe d'une méthode ou d'un attribut indique à quels endroits dans le programme il est possible d'accéder à ces éléments.
     * Par défaut une variable est disponible uniquement dans les accolades dans lesquelles elle est déclarée
     * En java, nous avons :
     *      private      : Visible uniquement par la classe
     *      (par défaut) : Visible pour le package dans lequel est la classe
     *      protected    : Visible pour le package dans lequel est la classe et par ses classes filles
     *      public       : Visible pour tous
     */

    // Les modificateurs
     /*      static       : classe, méthode, attribut :
     *          Sur la classe, cela indique que tous les membres de la classe sont static
     *          Sur les méthodes, cela indique que celle-ci est disponible via le nom de la classe et non une instance
     *          Sur un attribut, sa valeur est partagée partout dans le programme
     *          Un bloc static peut également être créé dans une classe pour effectuer du traitement au premier chargement de celle-ci en mémoire
     *
     *      final        : classe, méthode, attribut :
     *          Sur une classe celà indique qu'elle n'est pas dérivable
     *          Sur une méthode celà indique qu'elle n'est pas redéfinissable (substituable)
     *          Sur un attribut cela signifie que sa valeur dans la pile ne peut être modifié
     *              Pour un type primitif, cela veut dire que ca valeur ne peut être changé
     *              Pour un objet, c'est que nous ne pouvons affecter une nouvel objet sur cet attribut
     *
     *      abstract     : classe, méthode :
     *          Sur une classe celà indique que la classe ne peut être instanciée. Par contre elle fonctionne ensuite comme une classe standard
     *          Sur une méthode, celà indique que le bloc d'instructions doit être définie dans les classe héritée
     *
     *      synchronized : méthode :
     *          Le modificateur synchronized indique que la méthode ne peut être exécutée que par un thread à la fois.
     *          Le verrou ne s'active que pour l'objet sur lequel la méthode a été appelée
     *          Une même méthode synchronized peut être exécutée en même temps par deux threads différents sur deux objets différents
     *
     *      transient    : attribut :
     *          Le modificateur transient indique que lors de la sérialisation de l'objet, cet attribut n'est pas sérialisé et donc il est ignoré.
     *          Cela signifie que lorsque l'on désérialise l'objet, l'attribut portant le modificateur transient n'est pas défini dans l'objet désérialisé.
     *          Il s'agit en général d'attributs qui peuvent être recalculés à partir des autres attributs de l'objet.
     *
     *      native       : attribut :
     *          Ce modificateur permet d'indiquer que cet item est défini dans une bibliothèque externe écrite dans un autre langage de programmation, utilisant l'API JNI.
     *
     *      strictfp     : attribut :
     *          Pour une méthode, une classe ou une interface, le modificateur strictfp (abréviation de strict floating point) force la JVM à évaluer les opérations
     *          à virgules flottantes (sur les double et float) conformément à la spécification Java, c'est-à-dire de la gauche vers la droite.
     *          Cela permet d'avoir un comportement identique d'une JVM à une autre et d'éviter certains dépassements de valeur limite pour les résultats intermédiaires.
     *
     *      volatile     : attribut :
     *          Pour une variable, le modificateur volatile force la JVM, avant et après chaque utilisation de la variable,
     *          à la rafraîchir à partir de la mémoire principale au lieu d'utiliser un cache local.
     *          Cela permet de synchroniser la valeur de la variable entre plusieurs threads.
     */

    // Les interfaces et interface fonctionnelle
    /* Une interface sert à établir un contrat que doit respecter les classes l'implémentant.
     * Elle servent à masquer les implémentations effectuées entre couches.
     * Les classes ne peuvent exposer que des stéréotypes de méthodes ou des attributs.
     * Tous leurs membres sont public.
     * Une interface fonctionnelle ne contient quand à elle qu'une seule méthode.
     * Celle-ci peut être implémenté par une expression lambda lorsque qu'une méthode à besoin de cette interface en paramètre
     *      ex : (int a, String b) -> { System.out.println(b+a); }
     *
     */

    // Les énumération
    /* Les énumérations servent à fournir une liste de valeur strict aux autres classes du programme.
     * Elle servent généralement à fournir des constantes au fonctionnement des classes.
     */
}
