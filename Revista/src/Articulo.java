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

public class Articulo extends JFrame {

	private JPanel contentPane;
	private JTextField textIdArt;
	private JTextField textNomArt;
	private JTextField textDescripcion;
	private JLabel lblNewLabel_2;
	private JTextField textClasifArt;
	private JLabel lblPaginas;
	private JTextField textPaginas;
	private JButton btnRegresar;
	private JButton btnBuscar;
	private JButton btnInsertar;
	private JLabel lblIdRevista;
	private JTextField textIdRev;
	private JLabel lblNumEmpleado;
	private JTextField textIdEmpleado;

	Conexion conexion=new Conexion();
	Rev rev=new Rev();
	
	public Articulo() {
		setTitle("Articulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id de Articulo");
		lblNewLabel.setBounds(46, 11, 84, 14);
		contentPane.add(lblNewLabel);
		
		textIdArt = new JTextField();
		textIdArt.setBounds(169, 8, 86, 20);
		contentPane.add(textIdArt);
		textIdArt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del Articulo");
		lblNewLabel_1.setBounds(46, 79, 102, 14);
		contentPane.add(lblNewLabel_1);
		
		textNomArt = new JTextField();
		textNomArt.setBounds(169, 79, 86, 20);
		contentPane.add(textNomArt);
		textNomArt.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(46, 107, 102, 14);
		contentPane.add(lblDescripcion);
		
		textDescripcion = new JTextField();
		textDescripcion.setBounds(169, 107, 215, 66);
		contentPane.add(textDescripcion);
		textDescripcion.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Clasificacion de Articulo");
		lblNewLabel_2.setBounds(46, 181, 121, 14);
		contentPane.add(lblNewLabel_2);
		
		textClasifArt = new JTextField();
		textClasifArt.setBounds(169, 178, 86, 20);
		contentPane.add(textClasifArt);
		textClasifArt.setColumns(10);
		
		lblPaginas = new JLabel("Paginas");
		lblPaginas.setBounds(46, 202, 56, 14);
		contentPane.add(lblPaginas);
		
		textPaginas = new JTextField();
		textPaginas.setBounds(169, 199, 86, 20);
		contentPane.add(textPaginas);
		textPaginas.setColumns(10);
		
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final Menu frame=new Menu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setBounds(335, 227, 89, 23);
		contentPane.add(btnRegresar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rev.setIdArt(Integer.parseInt(textIdArt.getText()));		/*primero toma del cuadro de texto el id del pez, luego lo envia a la clase Pez y lo busca*/			
				rev.buscararticulo(conexion.conectar());						/*conecta el metodo pez con la base de Datos*/
				
				textIdArt.setText(String.valueOf(rev.getIdArt()));
				textIdEmpleado.setText(String.valueOf(rev.getIdEmpleado()));
				textIdRev.setText(String.valueOf(rev.getIdRev()));		/*toma de la clase Pez el id, los transforma a String y lo envia al cuadro de texto*/
				textNomArt.setText(rev.getNomArt());
				textDescripcion.setText(rev.getDescripcion());	
				textClasifArt.setText(rev.getClasifArt());
				textPaginas.setText(String.valueOf(rev.getPaginas()));
			}
		});
		btnBuscar.setBounds(41, 227, 89, 23);
		contentPane.add(btnBuscar);
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rev.setIdArt(Integer.parseInt(textIdArt.getText()));
				rev.setIdEmpleado(Integer.parseInt(textIdEmpleado.getText()));
				rev.setIdRev(Integer.parseInt(textIdRev.getText()));  /*toma del cuadro de texto el dato y lo envia a la clase Rev*/
				rev.setNomArt(textNomArt.getText());
				rev.setDescripcion(textDescripcion.getText());  
				rev.setClasifArt(textClasifArt.getText());
				rev.setPaginas(Integer.parseInt(textPaginas.getText()));
				
				rev.Insertararticulo(conexion.conectar());						/*conecta conecta el metodo INSERTAR con la base de Datos*/
				
				textIdArt.setText("");
				textIdEmpleado.setText("");
				textIdRev.setText("");
				textNomArt.setText("");
				textDescripcion.setText("");
				textClasifArt.setText("");
				textPaginas.setText("");
			}
		});
		btnInsertar.setBounds(146, 227, 89, 23);
		contentPane.add(btnInsertar);
		
		lblIdRevista = new JLabel("Id. Revista");
		lblIdRevista.setBounds(46, 34, 69, 14);
		contentPane.add(lblIdRevista);
		
		textIdRev = new JTextField();
		textIdRev.setBounds(169, 31, 86, 20);
		contentPane.add(textIdRev);
		textIdRev.setColumns(10);
		
		lblNumEmpleado = new JLabel("Num. Empleado");
		lblNumEmpleado.setBounds(46, 59, 103, 14);
		contentPane.add(lblNumEmpleado);
		
		textIdEmpleado = new JTextField();
		textIdEmpleado.setBounds(169, 56, 86, 20);
		contentPane.add(textIdEmpleado);
		textIdEmpleado.setColumns(10);
	}
}
