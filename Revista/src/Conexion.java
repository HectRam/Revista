import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	public Connection con;
	public String Driver="jdbc:postgresql://localhost:5432/Revista";
	public String administrador="postgres";
	public String pass="hector5017570";
	
	public Connection conectar(){
		try{
			final String CONTROLADOR="org.postgresql.Drivers";
			Connection conexion=DriverManager.getConnection(Driver,administrador,pass);
			this.con=conexion;
		}
		catch (SQLException ex){
			System.out.println(ex);
		}
		return this.con;
	}

}
