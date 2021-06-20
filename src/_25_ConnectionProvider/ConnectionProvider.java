package _25_ConnectionProvider;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/* Le datasource est comme une société de location de voiture
 * A son initialisation, il créé autant de connection à la base de donné (voiture) que ce qui est autorisé dans ses paramètres de config
 * Ensuite chaque méthode (personne) va louer une connection le temps de son travail (trajet) et rend la connection (voiture) au datasource(loueur)
 * pour qu'une autre méthode (personne) puisse l'utiliser
 * Si toutes les connections (voiture) sont utilisées en même temps, une liste d'attente est établie pour que chaque méthode (personne) attende sont tour.
 * Si l'attente est trop longue, une exception sera levée
 */
public class ConnectionProvider {
    private static DataSource ds;
    static{
        try {
            Context ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myDataSource");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
