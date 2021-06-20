package _00_Initiation_et_procedurale;

public class _00_Types_Primitifs_Wrappers {
	public static void Entiers() {
		//Type variable = valeurParDefaut
		byte b = 0; 	// Encodé sur 8  bits : 					  -128 à 					   127
		short s = 0; 	// Encodé sur 16 bits : 					-32768 à 					 32767
		int i = 0;		// Encodé sur 32 bits : 			-2 147 483 648 à 			 2 147 483 647
		long l = 0L;	// Encodé sur 64 bits : -9 223 372 036 854 775 808 à 9 223 372 036 854 775 807
	}
	public static void Decimaux() {
		//Type variable = valeurParDefaut
		float f = 0.0F;	// Encodé sur 32 bits :
		double d = 0.0; // Encodé sur 64 bits :
	}
	public static void Texte() {
		//Type variable = valeurParDefaut
		char c = '\u0000';	// Encodé sur 16 bits
		String s = ""; 		// Chaine de charactère. Attention, il ne s'agit pas d'un type primitif mais référence !
	}
	public static void Booléen() {
		boolean b = false;	// Encodé sur 1 bit : true / false
	}

	public static void Wrapper() {
		//Les wrappers permettent de transformer les types primitifs en type objet avec un transtypage implicite reversible
		//Les types primitifs on maintenant des méthodes.
		Integer Ii = 0;
		int ii = Ii;
		Ii=ii;
		
		Byte B;	Short S; Integer I;	Long L;
		Float F; Double D;
		Character C;
		Boolean Bn;
	}
}
