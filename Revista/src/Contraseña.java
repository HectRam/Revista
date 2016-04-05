

public class Contraseña {
	public Contraseña(){
	}
	String usuario1="";
	String pass="";
	
	public int Password()
	{
		usuario1=InterfazRevista.usuariocaja.getText();
		pass= InterfazRevista.contrasenacaja.getText();
		if (usuario1.equals("HectorRamirez")&&pass.equals("hector5017570")){
			return 1;
		}
		else {
			return 0;
		}
	}

}
