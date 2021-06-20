package _00_Initiation_et_procedurale;

import java.util.*;

public class _10_Tableaux_et_Collections {
	public void Tableau() {
		//Déclaration d'un tableau à une dimension contenant 5 valeurs
		//[][][][][]
		int[] tabOfInt = new int[5];
		//Déclaration d'un tableau à 2 dimensions contenant 2 fois 5 valeurs
		//[ [][][][][] ] [ [][][][][] ] 1ère dimension à 2 valeurs contenant chacune 5 valeurs de la seconde dimension					
		int[][] tab2Dim = new int[2][5];
		//Déclaration d'un tableau à 3 dimension contenant 4 fois 3 valeurs contenant lui-même 2 valeurs 
		//[ [ [][] ] [ [][] ] [ [][] ] ] schemas se répétant 4 fois
		int[][][] tab3Dim = new int[4][3][2];
		
		//Remplissage de tableau lors de la déclaration
		char[] charTab = {'e','r','t'};
		char[][] charTab2Dim = { {'a','z','e'} , {'o','r','t'} };
			
		Arrays.fill(charTab, 'e'); 						//Remplir tout le tableau de 'e'
		charTab = Arrays.copyOf(charTab, 100);			//Agrandir un tableau
		charTab = Arrays.copyOfRange(charTab, 2, 10);	//Extraire une plage du tableau
		System.out.println(charTab); 					//Afficher le pointeur du tableau
		System.out.println(Arrays.toString(charTab)); 	//Afficher le contenu du tableau
	}

	public void Listes() {
		
		/* Liste des collections instanciables
		 * Ces 5 premières collections autorises les doublons
		 * 		ArrayList : non thread-safe mais plus rapide
		 * 	 	   Vector : thread-safe mais moins rapide
		 * 	   LinkedList : Identique à un curseur pour parcourir les éléments. Liste séquentielle de donnéees
		 * 				  	Peut être utiliser en tant que FiFo avec l'interface Queue
		 * 	PriorityQueue : Queue triée par Comparable<T> lors de l'insertion des éléments. 
		 * 			   	    /!\Cette liste change l'ordre des éléments insérés.
		 * 	Stack : Liste pour du LiFo
		 * 
		 * Les 3 collections suivantes interdisent les doublons
		 * 		  HashSet : Ne conserve pas l'ordre des données ajoutées. Utilise l'ordre de tri naturel
		 * 	LinkedhashSet : Conserve l'ordre des données ajoutées
		 * 		  TreeSet : Tri les données suivant Comparable à l'insertion
		 * 
		 * 
		 * Liste des interfaces possibles (collection)
		 * 	  Collection : Interface commune à toutes les listes <T>
		 *		    List : Interface pour une collection ordonnée suivant les ajouts et pouvant contenir des doublons
		 *	       Queue : Interface pour une collection de type file d'attente FIFO
		 *	 	 Dequeue : Interface pour une collection de type file d'attente modifiable par les 2 extrémitées
		 *		 	 Set : Interface pour une collection ordonnée suivant Comparable s'il existe ne pouvant pas contenir de doublon
		 *     SortedSet : Interface pour une collection ordonnée suivant Comparable obligatoire ne pouvant pas contenir de doublon
		 *	NavigableSet : Interface pour un TreeSet		
		 */
		
		//Liste des collections														//Interfaces possibles 'conseillée'
		ArrayList<Integer> arrayList = new ArrayList<Integer>();					//Collection, 'List'
		Vector<Integer> vector = new Vector<Integer>();								//Collection, 'List'
		LinkedList<Integer> linkedList = new LinkedList<Integer>();					//Collection, List, 'Queue'
		PriorityQueue<Integer>priorityQueue = new PriorityQueue<Integer>();			//Collection, 'Queue'
		Stack<Integer>stack = new Stack<Integer>(); 								//Collection, List, 'Queue'
		HashSet<Integer> hashSet = new HashSet<Integer>();							//Collection, 'Set'
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();		//Collection, 'Set'
		TreeSet<Integer> treeSet = new TreeSet<Integer>();							//Collection, Set, 'SortedSet', 'NavigableSet'		
	}
	
	public static void Dictionnaires() {
		/* Liste des dictionnaires instanciables
		 * 		HashTable : Dictionnaire n'acceptant pas de NULL ni dans la clé ni dans les valeurs
		 * 				    Hastable est Thread-Safe contrairement à HashMap
		 * 		  HashMap : Dictionnaire autorisant un NULL dans les clés et autant de NULL dans les valeurs
		 * 		  	   	    Tri des données suivant l'ordre natuel des clés
		 * 	LinkedHashMap : Identique à HashMap. Conserve l'ordre d'insertion des données
		 * 		  TreeMap : Identique à TreeSet suivant un comparable sur les clés
		 *
		 *
		 *	Liste des interfaces possibles (dictionnaires)
		 * 			 Map : Interface commune à toutes les listes <K,V>	(dictionnaires)
		 *	   SortedMap : 
		 *  NavigableMap :
		 */
		//Liste des dictionnaires																//Interfaces possibles 'conseillée'
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();				//'Map'
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();						//'Map'
		LinkedHashMap<Integer, String> linkedListMap = new LinkedHashMap<Integer, String>();	//'Map'
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();						//Map, SortedMap, TreeMap
	}
}
