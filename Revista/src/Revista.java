import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Revista extends JFrame {

	private JPanel contentPane;
	private JTextField textClasRev;
	private JTextField textTipo_Papel;
	private JTextField textIdRev;
	private JTextField textTot_Pag;
	private JTextField textCosto;
	private JTextField textFecha_Entrega;
	
	Conexion conexion=new Conexion();
	Rev rev=new Rev();
	
	public Revista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoDeRevista = new JLabel("Tipo de Revista");
		lblTipoDeRevista.setBounds(64, 53, 79, 14);
		contentPane.add(lblTipoDeRevista);
		
		textClasRev = new JTextField();
		textClasRev.setBounds(184, 50, 181, 20);
		contentPane.add(textClasRev);
		textClasRev.setColumns(10);
		
		JLabel lblTipoDePapel = new JLabel("Tipo de papel");
		lblTipoDePapel.setBounds(64, 78, 86, 14);
		contentPane.add(lblTipoDePapel);
		
		textTipo_Papel = new JTextField();
		textTipo_Papel.setBounds(184, 75, 181, 20);
		contentPane.add(textTipo_Papel);
		textTipo_Papel.setColumns(10);
		
		JLabel lblIdDeRevista = new JLabel("Id de Revista");
		lblIdDeRevista.setBounds(64, 24, 79, 14);
		contentPane.add(lblIdDeRevista);
		
		textIdRev = new JTextField();
		textIdRev.setBounds(184, 21, 86, 20);
		contentPane.add(textIdRev);
		textIdRev.setColumns(10);
		
		JLabel lblTotalDePaginas = new JLabel("Total de Paginas");
		lblTotalDePaginas.setBounds(64, 103, 91, 14);
		contentPane.add(lblTotalDePaginas);
		
		textTot_Pag = new JTextField();
		textTot_Pag.setBounds(184, 100, 86, 20);
		contentPane.add(textTot_Pag);
		textTot_Pag.setColumns(10);
		
		JLabel lblCosto = new JLabel("Costo");
		lblCosto.setBounds(64, 129, 46, 14);
		contentPane.add(lblCosto);
		
		textCosto = new JTextField();
		textCosto.setBounds(184, 126, 86, 20);
		contentPane.add(textCosto);
		textCosto.setColumns(10);
		
		JLabel lblFechaEntrega = new JLabel("Fecha Entrega");
		lblFechaEntrega.setBounds(64, 154, 79, 14);
		contentPane.add(lblFechaEntrega);
		
		textFecha_Entrega = new JTextField();
		textFecha_Entrega.setBounds(184, 151, 86, 20);
		contentPane.add(textFecha_Entrega);
		textFecha_Entrega.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rev.setIdRev(Integer.parseInt(textIdRev.getText()));		/*primero toma del cuadro de texto el id del pez, luego lo envia a la clase Pez y lo busca*/			
				rev.buscarRev(conexion.conectar());						/*conecta el metodo pez con la base de Datos*/
				
				
				textIdRev.setText(String.valueOf(rev.getIdRev()));		/*toma de la clase Pez el id, los transforma a String y lo envia al cuadro de texto*/
				textClasRev.setText(rev.getClasRev());
				textTot_Pag.setText(String.valueOf(rev.getTot_Pag()));	
				textCosto.setText(String.valueOf(rev.getcosto()));
				textTipo_Papel.setText(rev.getTipo_Papel());
				textFecha_Entrega.setText(rev.getFecha_Entrega());
				
			}
		});
		btnBuscar.setBounds(37, 227, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rev.setIdRev(Integer.parseInt(textIdRev.getText()));  /*toma del cuadro de texto el dato y lo envia a la clase Rev*/
				rev.setClasRev(textClasRev.getText());
				rev.setTot_Pag(Integer.parseInt(textTot_Pag.getText())); 
				rev.setcosto(Integer.parseInt(textCosto.getText())); 
				rev.setTipo_Papel(textTipo_Papel.getText());
				rev.setFecha_Entrega(textFecha_Entrega.getText());
				
				rev.Insertarrevista(conexion.conectar());						/*conecta conecta el metodo INSERTAR con la base de Datos*/
				
				textIdRev.setText("");
				textClasRev.setText("");
				textTot_Pag.setText("");
				textCosto.setText("");
				textTipo_Papel.setText("");
				textFecha_Entrega.setText("");
				
			}
		});
		btnInsertar.setBounds(181, 227, 89, 23);
		contentPane.add(btnInsertar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu frame = new Menu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setBounds(335, 227, 89, 23);
		contentPane.add(btnRegresar);
	}

}
