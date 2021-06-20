package _20_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class _00_ConnectionJDBC {

    final static String URL = "jdbc:sqlserver://localhost:1433;databaseName=BDD_DEMO";
    final static String USER = "sa";
    final static String PASSWORD = "Pa$$w0rd";
    final static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final static String FIND_ALL= "SELECT noStagiaire, nom, prenom, dateDeNaissance, motDePasse FROM Stagiaires";
    final static String INSERT = "INSERT INTO Stagiaires (nom, prenom, dateDeNaissance, motDePasse) VALUES (?, ?, ?, ?)";

    public static void main(String[] args) {
        chargementDriver();
        connectionBdd();
        selectStatement();
        insertStatement();
        selectStatement();
    }

    public static void chargementDriver() {
        //Chargement du driver
        /*
         * Mauvaise méthode :
         * 		couplage fort car la bibliothèque est nécessaire à la compilation
         * 		Méthode dédiée à la base de donnée utilisée.
         * 		Pas de modification possible par un fichier config mais uniquement par une modif du code
         */
        try {
            DriverManager.registerDriver(new SQLServerDriver());
        } catch (SQLException sqle) {
            System.out.println("Un problème est survenue au chargement du driver");
            sqle.printStackTrace();
        }

        System.out.println("Fin du chargement du premier driver");



        /* Bonne méthode :
         * 		couplage faible, le .jar du driver n'est pas nécessaire pour la compilation
         * 		le nom du driver est mis en variable
         */
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Attention le driver n'a pas été trouvé");
            cnfe.printStackTrace();
        }

        System.out.println("Fin du chargement du second driver");
    }

    public static void connectionBdd() {
        //Connexion à la base de donnée sans fermeture automatique à la fin du try
        Connection cnx = null;
        try {
            cnx = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            if (cnx!=null) {
                try {
                    cnx.close();
                } catch(SQLException sqle) {
                    sqle.printStackTrace();
                }
            }
        }
        System.out.println("Fin de la première connexion");

        //Connexion à la base de donnée avec fermeture automatique à la fin du try
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD))
        {
            //Traitement
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        System.out.println("Fin de la seconde connexion");
    }

    public static void selectStatement() {
        //Connexion à la base de donnée avec fermeture automatique à la fin du try
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement())
        {
            ResultSet rs = stmt.executeQuery(FIND_ALL);
            while(rs.next()) {
                int id = rs.getInt("noStagiaire");
                String prenom = rs.getString("prenom");
                String nom = rs.getString("nom");
                Date dateNaissance = rs.getDate("dateDeNaissance");
                String password = rs.getString("motDePasse");
                System.out.println( id + ":" + prenom + ":" + nom + ":" + dateNaissance + ":" + password );
            }
            rs.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        System.out.println("Fin de la première requete select");
    }

    public static void insertStatement() {
        //Connexion à la base de donnée avec fermeture automatique à la fin du try
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt =  conn.prepareStatement(INSERT))
        {
            String nom = "LeBlanc";
            String prenom = "Juste";
            Date ddn = new Date(100,4,12);
            String mdp = "123456";

            pstmt.setString(1, nom);
            pstmt.setString(2, prenom);
            pstmt.setDate(3, new java.sql.Date(ddn.getTime()));
            pstmt.setString(4, mdp);

            pstmt.executeUpdate();

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        System.out.println("Fin de la première insertion select");
    }
}
