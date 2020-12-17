package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    String Driver="com.mysql.jdbc.Driver";
    String URL="jdbc:mysql://localhost:3306/bd_bancafy";
    String usuario="root";
    String clave="mysql";

    public Conexion() {
        try {
            Class.forName(Driver);
            con=DriverManager.getConnection(URL,usuario,clave);
        } catch (Exception e) {
        }
    }
    public Connection getConnection(){
        return con;
    }
}
