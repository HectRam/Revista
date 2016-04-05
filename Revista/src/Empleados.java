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

public class Empleados extends JFrame {

	private JPanel contentPane;
	private JTextField textIdEmpleado;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textProfesion;

	Conexion conexion=new Conexion();
	Rev rev=new Rev();
	private JTextField textIdRev;
	
	public Empleados() {
		setTitle("Empleados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Num. de Empleado");
		lblNewLabel.setBounds(33, 11, 92, 14);
		contentPane.add(lblNewLabel);
		
		textIdEmpleado = new JTextField();
		textIdEmpleado.setText("");
		textIdEmpleado.setBounds(182, 8, 86, 20);
		contentPane.add(textIdEmpleado);
		textIdEmpleado.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(33, 57, 46, 14);
		contentPane.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(182, 54, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(33, 82, 46, 14);
		contentPane.add(lblApellido);
		
		textApellido = new JTextField();
		textApellido.setBounds(182, 79, 86, 20);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(33, 107, 46, 14);
		contentPane.add(lblTelefono);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(182, 104, 86, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblProfesion = new JLabel("Profesion");
		lblProfesion.setBounds(33, 132, 46, 14);
		contentPane.add(lblProfesion);
		
		textProfesion = new JTextField();
		textProfesion.setBounds(182, 129, 86, 20);
		contentPane.add(textProfesion);
		textProfesion.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				rev.setIdEmpleado(Integer.parseInt(textIdEmpleado.getText()));		/*primero toma del cuadro de texto el id del pez, luego lo envia a la clase Pez y lo busca*/			
				rev.buscarempleado(conexion.conectar());						/*conecta el metodo pez con la base de Datos*/
				
				textIdEmpleado.setText(String.valueOf(rev.getIdEmpleado()));
				textIdRev.setText(String.valueOf(rev.getIdRev()));		/*toma de la clase Pez el id, los transforma a String y lo envia al cuadro de texto*/
				textNombre.setText(rev.getNombre());
				textApellido.setText(rev.getApellido());	
				textProfesion.setText(String.valueOf(rev.getProfesion()));
				textTelefono.setText(rev.getTelefono());
			 
			}
		});
		btnBuscar.setBounds(36, 227, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rev.setIdEmpleado(Integer.parseInt(textIdEmpleado.getText()));
				rev.setIdRev(Integer.parseInt(textIdRev.getText()));  /*toma del cuadro de texto el dato y lo envia a la clase Rev*/
				rev.setNombre(textNombre.getText());
				rev.setApellido(textApellido.getText());  
				rev.setProfesion(textProfesion.getText());
				rev.setTelefono(textTelefono.getText());
				
				rev.Insertarempleado(conexion.conectar());						/*conecta conecta el metodo INSERTAR con la base de Datos*/
				
				textIdEmpleado.setText("");
				textIdRev.setText("");
				textNombre.setText("");
				textApellido.setText("");
				textTelefono.setText("");
				textProfesion.setText("");
				
			}
		});
		btnInsertar.setBounds(135, 227, 89, 23);
		contentPane.add(btnInsertar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final Menu frame=new Menu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setBounds(335, 227, 89, 23);
		contentPane.add(btnRegresar);
		
		JLabel lblIdRevista = new JLabel("Id Revista");
		lblIdRevista.setBounds(33, 32, 92, 14);
		contentPane.add(lblIdRevista);
		
		textIdRev = new JTextField();
		textIdRev.setBounds(182, 29, 86, 20);
		contentPane.add(textIdRev);
		textIdRev.setColumns(10);
	}

}
