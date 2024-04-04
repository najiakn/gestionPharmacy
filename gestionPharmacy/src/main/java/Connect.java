
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connect {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pharmacie", "postgres",
                    "1234");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM produits");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("nom");
                int quantity = rs.getInt("quantité");
                int  prix = rs.getInt("prix");
                String  description = rs.getString("description");
                System.out.println(id + "  " + name + "  " + quantity + " " + description + " " + prix);
            }

            // Fermeture des ressources
            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}