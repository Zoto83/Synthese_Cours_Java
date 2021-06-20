package _00_Initiation_et_procedurale;

public class _30_Boucles_et_Conditions {
	public static void Conditions() {
		int ii=0;
		//Conditions
		if(true) ii=1;													// IF ...
		
		if (ii==1 ) {System.out.println("Si ... Alors Vrai");}			//IF ... ELSE
		else {System.out.println("Sinon Faux");}
		
		if (ii==1) {System.out.println("Vrai");}						//IF...ELSEIF...ELSE
		else if(ii==2){System.out.println("Sinon Si ... Alors Vrai");}
		else {System.out.println("Sinon Faux");}

		ii=(ii==1 ? 3 : 2);												//Ternaire (retourne toujours une valeur)

		//Selon
		switch (ii) {
			case 1:	
				System.out.println("égale 1"); 
				break;
			case 2: 
				System.out.println("égale 2");
				break;
			default: 
				System.out.println("égale à rien"); 
				break;
		}
	}
	public static void Boucles() {
		//Variables pour le test
		char[] tableau = new char[] {'a', 'b', 'c', 'd', 'e'};
		int ii;
		
		//Boucles
		//for : Pour chaque valeur de ii alant de 0 à 9 alors ... (le ii++ se fait à la fin de la boucle)
		for (ii=1;ii<=10;ii++) { System.out.println(ii); }
		
		//for each : Pour chaque élément du type contenu dans la collection alors ...
		//Utiliser pour parcourir tous les éléments d'une collection
		for (char cs : tableau) { System.out.println(cs); }
		
		//While : Tant que (condition==Vraie) alors ...  
		//Utilisé lorsqu'une condition doit être vérifier avant d'éxécuter le code
		while(ii<2){ System.out.println(ii); ii++; }

		//Do ... While : ... Tant que (condition==Vraie). 
		//Utilisé lorsque l'on doit exécuter le code au moins une fois puis tant que la condition est vraie
		do{}while(false);
	}
	
	public static void ComparaisonDObjet() {
		//Comparaison de chaine de charactere
		String a = new String("a");
		String b = new String("a");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println("\' \" \\ \t \b \r \n");
		System.out.println(String.format("Format %% %s %.2f", "test", 0.12345f)); //https://www.javatpoint.com/java-string-format
	}
}
