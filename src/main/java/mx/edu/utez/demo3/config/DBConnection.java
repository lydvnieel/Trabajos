package mx.edu.utez.demo3.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


    

public class DBConnection {

    private static final String URL      = "jdbc:oracle:thin:@qvqwb13tjhnkkzyb_low";
    private static final String USER     = "ADMIN";
    private static final String PASSWORD = "Siempresemeolvida2005";
  

    // Obtiene una conexión nueva
    public static Connection getConnection() throws SQLException {
        // 1. Apunta al directorio donde descomprimiste el wallet
        System.setProperty("oracle.net.tns_admin", "C:\\Users\\danie\\Desktop\\Wallet_QVQWB13TJHNKKZYB");
        // 2. (Opcional) fuerza la validación de nombre de servidor en el certificado
        System.setProperty("oracle.net.ssl_server_dn_match", "true");
        // 3. Obtiene la conexión usando alias, user y pass
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    

    public static void main(String[] args) throws SQLException {
        try (Connection conn = getConnection()) {
        
            System.out.println("¡Conexión exitosa!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
