import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Rev {

	int IdRev,IdArt,IdEmpleado,IdDiseo,IdFotos,costo,Tot_Pag,Paginas,NumFotos;
	String ClasRev,Fecha_Entrega,Tipo_Papel,ClasifArt,Descripcion,NomArt,Nombre,Apellido,Profesion,Telefono,Tipodis,tipofot;
	//double peso;

	ResultSet rst;
	
	
	
	//METODOS PARA RETORNAR DATOS
	public int getIdRev(){
		return IdRev;
	}
	public int getNumFotos(){
		return NumFotos;
	}
	public int getIdArt(){
		return IdArt;
	}
	public int getIdEmpleado(){
		return IdEmpleado;
	}
	public int getIdDiseo(){
		return IdDiseo;
	}
	public int getIdFotos(){
		return IdFotos;
	}
	public int getcosto(){
		return costo;
	}
	public int getTot_Pag(){
		return Tot_Pag;
	}
	public int getPaginas(){
		return Paginas;
	}
	public String getClasRev(){
		return ClasRev;
	}
	public String getFecha_Entrega(){
		return Fecha_Entrega;
	}
	public String getTipo_Papel(){
		return Tipo_Papel;
	}
	public String getClasifArt(){
		return ClasifArt;
	}
	public String getDescripcion(){
		return Descripcion;
	}
	public String getNomArt(){
		return NomArt;
	}
	public String getNombre(){
		return Nombre;
	}
	public String getApellido(){
		return Apellido;
	}
	public String getProfesion(){
		return Profesion;
	}
	public String getTelefono(){
		return Telefono;
	}
	public String getTipodis(){
		return Tipodis;
	}
	public String gettipofot(){
		return tipofot;
	}
	
	//METODOS PARA INSERTAR DATOS
	public void setIdRev(int IdRev){
		this.IdRev=IdRev;
	}
	public void setNumFotos(int NumFotos){
		this.NumFotos=NumFotos;
	}
	public void setIdArt(int IdArt){
		this.IdArt=IdArt;
	}
	public void setIdEmpleado(int IdEmpleado){
		this.IdEmpleado=IdEmpleado;
	}
	public void setIdDiseo(int IdDiseo){
		this.IdDiseo=IdDiseo;
	}
	public void setIdFotos(int IdFotos){
		this.IdFotos=IdFotos;
	}
	public void setcosto(int costo){
		this.costo=costo;
	}
	public void setTot_Pag(int Tot_Pag){
		this.Tot_Pag=Tot_Pag;
	}
	public void setPaginas(int Paginas){
		this.Paginas=Paginas;
	}
	public void setClasRev(String ClasRev){
		this.ClasRev=ClasRev;
	}
	public void setFecha_Entrega(String Fecha_Entrega){
		this.Fecha_Entrega=Fecha_Entrega;
	}
	public void setTipo_Papel(String Tipo_Papel){
		this.Tipo_Papel=Tipo_Papel;
	}
	public void setClasifArt(String ClasifArt){
		this.ClasifArt=ClasifArt;
	}
	public void setDescripcion(String Descripcion){
		this.Descripcion=Descripcion;
	}
	public void setNomArt(String NomArt){
		this.NomArt=NomArt;
	}
	public void setNombre(String Nombre){
		this.Nombre=Nombre;
	}
	public void setApellido(String Apellido){
		this.Apellido=Apellido;
	}
	public void setProfesion(String Profesion){
		this.Profesion=Profesion;
	}
	public void setTelefono(String Telefono){
		this.Telefono=Telefono;
	}
	public void setTipodis(String Tipodis){
		this.Tipodis=Tipodis;
	}
	public void settipofot(String tipofot){
		this.tipofot=tipofot;
	}
	
	public void Insertarrevista(Connection con){
		try {
			Statement stmtl=con.createStatement();
			
			//AQUI SE INSERTAN LAS CONSULTAS DE LENGUAJE SQL
			stmtl.executeUpdate("INSERT INTO revista VALUES('"+this.IdRev+"','"+this.ClasRev+"','"+this.Tot_Pag+"','"+this.costo+"','"+this.Tipo_Papel+"','"+this.Fecha_Entrega+",')");
			System.out.println("se guardo");
		} catch (SQLException ex) {
		System.out.println(ex);	
		}
	}
	public void Insertararticulo(Connection con){
		try {
			Statement stmtl=con.createStatement();
			
			//AQUI SE INSERTAN LAS CONSULTAS DE LENGUAJE SQL
			stmtl.executeUpdate("INSERT INTO articulo VALUES('"+this.IdArt+"','"+this.IdRev+"','"+this.IdEmpleado+"','"+this.NomArt+"','"+this.Descripcion+"','"+this.ClasifArt+"','"+this.Paginas+",')");
			System.out.println("se guardo");
		} catch (SQLException ex) {
		System.out.println(ex);	
		}
	}
	public void Insertarempleado(Connection con){
		try {
			Statement stmtl=con.createStatement();
			//AQUI SE INSERTAN LAS CONSULTAS DE LENGUAJE SQL
			stmtl.executeUpdate("INSERT INTO empleado VALUES('"+this.IdEmpleado+"','"+this.IdRev+"','"+this.Nombre+"','"+this.Apellido+"','"+this.Profesion+"','"+this.Telefono+"')");
			System.out.println("se guardo");
			
		} catch (SQLException ex) {
		System.out.println(ex);	
		}
	}
	public void Insertardiseo(Connection con){
		try {
			Statement stmtl=con.createStatement();
			
			//AQUI SE INSERTAN LAS CONSULTAS DE LENGUAJE SQL
			stmtl.executeUpdate("INSERT INTO diseño VALUES('"+this.IdDiseo+"','"+this.IdRev+"','"+this.IdEmpleado+"','"+this.Tipodis+"')");
			System.out.println("se guardo");
		} catch (SQLException ex) {
		System.out.println(ex);	
		}
	}
	
	public void Insertarfotografias(Connection con){
		try {
			Statement stmtl=con.createStatement();
			
			//AQUI SE INSERTAN LAS CONSULTAS DE LENGUAJE SQL
			stmtl.executeUpdate("INSERT INTO fotografias VALUES('"+this.IdFotos+"','"+this.IdRev+"','"+this.IdEmpleado+"','"+this.NumFotos+"','"+this.tipofot+"')");
			System.out.println("se guardo");
		} catch (SQLException ex) {
		System.out.println(ex);	
		}
	}
	public void buscarRev(Connection conn){
		try {
			try(Statement estatuto= conn.createStatement()){
				
				//con executeQuery REALIZA LAS CONSULTAS ESPECIFICAS
				estatuto.executeQuery("SELECT * FROM revista WHERE IdRev='"+this.IdRev+"'");

				rst=estatuto.getResultSet();
				while(rst.next()){
					
					setIdRev(rst.getInt("IdRev"));
					setClasRev(rst.getString("ClasRev"));
					setTot_Pag(rst.getInt("Tot_Pag"));
					setcosto(rst.getInt("Costo"));
					setTipo_Papel(rst.getString("Tipo_Papel"));
					setFecha_Entrega(rst.getString("Fecha_entrega"));
					
					
					
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void buscararticulo(Connection conn){
		try {
			try(Statement estatuto= conn.createStatement()){
				
				//con executeQuery REALIZA LAS CONSULTAS ESPECIFICAS
					estatuto.executeQuery("SELECT * FROM articulo WHERE IdArt='"+this.IdArt+"'");	
					
				rst=estatuto.getResultSet();
				while(rst.next()){
						setIdArt(rst.getInt("IdArt"));
						setIdRev(rst.getInt("IdRev"));
						setIdEmpleado(rst.getInt("IdEmpleado"));
						setNomArt(rst.getString("NomArt"));
						setDescripcion(rst.getString("Descripcion"));
						setClasifArt(rst.getString("ClasifArt"));
						setPaginas(rst.getInt("Paginas"));
				
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
    
	public void buscarempleado(Connection conn){
		try {
			try(Statement estatuto= conn.createStatement()){
				
				//con executeQuery REALIZA LAS CONSULTAS ESPECIFICAS
					estatuto.executeQuery("SELECT * FROM empleado WHERE Idempleado='"+this.IdEmpleado+"'");
					
				rst=estatuto.getResultSet();
				while(rst.next()){
						setIdEmpleado(rst.getInt("Idempleado"));
						setIdRev(rst.getInt("IdRev"));
						setNombre(rst.getString("Nombre"));
						setApellido(rst.getString("Apellido"));
						setProfesion(rst.getString("Profesion"));
						setTelefono(rst.getString("Telefono"));
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void buscardiseo(Connection conn){
		try {
			try(Statement estatuto= conn.createStatement()){
				
				//con executeQuery REALIZA LAS CONSULTAS ESPECIFICAS
					estatuto.executeQuery("SELECT * FROM diseño WHERE iddiseño='"+this.IdDiseo+"'");
					
				rst=estatuto.getResultSet();
				while(rst.next()){
					    setIdDiseo(rst.getInt("iddiseño"));
						setIdRev(rst.getInt("IdRev"));
						setIdEmpleado(rst.getInt("Idempleado"));
						setTipodis(rst.getString("Tipo"));
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void buscarfotografias(Connection conn){
		try {
			try(Statement estatuto= conn.createStatement()){
				
				//con executeQuery REALIZA LAS CONSULTAS ESPECIFICAS
					estatuto.executeQuery("SELECT * FROM fotografias WHERE IdFotos='"+this.IdFotos+"'");
					
				rst=estatuto.getResultSet();
				while(rst.next()){
					        setIdFotos(rst.getInt("IdFotos"));
					        setIdRev(rst.getInt("IdRev"));
							setIdEmpleado(rst.getInt("Idempleado"));
							setNumFotos(rst.getInt("NumFotos"));
							settipofot(rst.getString("Categoria"));
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}