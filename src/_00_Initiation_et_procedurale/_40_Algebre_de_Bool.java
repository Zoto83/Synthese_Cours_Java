package _00_Initiation_et_procedurale;

/**
 * Bloc commentaire pour JAVADOC
 * @param args
 */
/*
 * Bloc commentaire
 */
//Simple commentaire
public class _40_Algebre_de_Bool {

	public static void main(String[] args) {
		boolean[] A = new boolean[] {true, false};
		boolean[] B = new boolean[] {true, false};
		algebreDeBool(A, B);
	}
	public static void algebreDeBool(boolean A[], boolean B[]) {
		System.out.println("TABLE DE VERITE SUR LE ET");
		afficher("Table de vérité pour (A et B)");
		for (boolean valA : A) {
			for (boolean valB : B) {
				System.out.println( valA + "\t" + valB + "\t" + (valA&valB));
			}
		}
		
		afficher("Table de vérité pour (!A et !B)");
		for (boolean valA : A) {
			for (boolean valB : B) {
				System.out.println( valA + "\t" + valB + "\t" + (!valA&!valB));
			}
		}

		afficher("Table de vérité pour !(A et B)");
		for (boolean valA : A) {
			for (boolean valB : B) {
				System.out.println( valA + "\t" + valB + "\t" + !(valA&valB));
			}
		}

		afficher("Table de vérité pour !(!A et !B)");
		for (boolean valA : A) {
			for (boolean valB : B) {
				System.out.println( valA + "\t" + valB + "\t" + !(!valA&!valB));
			}
		}

		System.out.println("TABLE DE VERITE SUR LE OU");
		afficher("Table de vérité pour (A ou B)");
		for (boolean valA : A) {
			for (boolean valB : B) {
				System.out.println( valA + "\t" + valB + "\t" + (valA|valB));
			}
		}
		
		afficher("Table de vérité pour (!A ou !B)");
		for (boolean valA : A) {
			for (boolean valB : B) {
				System.out.println( valA + "\t" + valB + "\t" + (!valA|!valB));
			}
		}
		
		afficher("Table de vérité pour !(A ou B)");
		for (boolean valA : A) {
			for (boolean valB : B) {
				System.out.println( valA + "\t" + valB + "\t" + !(valA|valB));
			}
		}

		afficher("Table de vérité pour !(!A ou !B)");
		for (boolean valA : A) {
			for (boolean valB : B) {
				System.out.println( valA + "\t" + valB + "\t" + !(!valA|!valB));
			}
		}

		System.out.println("TABLE DE VERITE SUR LE OU EXCLUSIF");
		afficher("Table de vérité pour (A ou exclusif B)");
		for (boolean valA : A) {
			for (boolean valB : B) {
				System.out.println( valA + "\t" + valB + "\t" + (valA^valB));
			}
		}

		System.out.println("TABLE DE VERITE SUR LES ELEMENTS NEUTRES");
		afficher("Table de vérité pour l'élément neutre sur le ET (A et vrai)");
		for (boolean valA : A) {
			boolean valB=true;
			System.out.println( valA + "\t" + valB + "\t" + (valA&valB));
		}
		
		afficher("Table de vérité pour l'élément neutre sur le OU (A ou faux)");
		for (boolean valA : A) {
			boolean valB=false;
			System.out.println( valA + "\t" + valB + "\t" + (valA|valB));
		}
	}
	private static void afficher(String msg) {
		System.out.println();
		System.out.println(msg);
		System.out.println( "A\tB\tResult");
	}
}
