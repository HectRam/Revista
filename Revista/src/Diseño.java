import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Diseño extends JFrame {

	private JPanel contentPane;
	private JTextField textIdDiseo;
	private JTextField textTipo;
	
	private JTextField textIdRev;
	private JTextField textIdEmpleado;
	Conexion conexion=new Conexion();
	Rev rev=new Rev();
	
	public Diseño() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIddiseo = new JLabel("Id Diseño");
		lblIddiseo.setBounds(54, 32, 60, 14);
		contentPane.add(lblIddiseo);
		
		textIdDiseo = new JTextField();
		textIdDiseo.setBounds(184, 29, 86, 20);
		contentPane.add(textIdDiseo);
		textIdDiseo.setColumns(10);
		
		JLabel lblTipoDeDiseo = new JLabel("Tipo de Diseño");
		lblTipoDeDiseo.setBounds(54, 122, 89, 14);
		contentPane.add(lblTipoDeDiseo);
		
		textTipo = new JTextField();
		textTipo.setBounds(184, 119, 86, 20);
		contentPane.add(textTipo);
		textTipo.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rev.setIdDiseo(Integer.parseInt(textIdDiseo.getText()));		/*primero toma del cuadro de texto el id del pez, luego lo envia a la clase Pez y lo busca*/			
				rev.buscardiseo(conexion.conectar());						/*conecta el metodo pez con la base de Datos*/
				
				
				//textIdDiseño.setText(String.valueOf(rev.getIdDiseo()));		/*toma de la clase Pez el id, los transforma a String y lo envia al cuadro de texto*/
				textIdRev.setText(String.valueOf(rev.getIdRev()));
				textIdEmpleado.setText(String.valueOf(rev.getIdEmpleado()));	
				textTipo.setText(rev.getTipodis());
				
			}
		});
		btnBuscar.setBounds(10, 227, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rev.setIdDiseo(Integer.parseInt(textIdDiseo.getText()));  /*toma del cuadro de texto el dato y lo envia a la clase pez*/
				rev.setIdRev(Integer.parseInt(textIdRev.getText()));
				rev.setIdEmpleado(Integer.parseInt(textIdEmpleado.getText())); 
				rev.setTipodis(textTipo.getText());
				
				
				rev.Insertardiseo(conexion.conectar());						/*conecta conecta el metodo INSERTAR con la base de Datos*/
				
				textIdDiseo.setText("");
				textIdRev.setText("");
				textIdEmpleado.setText("");
				textTipo.setText("");
				
				//JOptionPane.showMessageDialog(textPez, "SU PEZ SE HA GUARDADO CORRECTAMENTE","CONEXION", getDefaultCloseOperation());
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
		
		JLabel lblIdRevista = new JLabel("Id Revista");
		lblIdRevista.setBounds(54, 63, 89, 14);
		contentPane.add(lblIdRevista);
		
		textIdRev = new JTextField();
		textIdRev.setBounds(184, 60, 86, 20);
		contentPane.add(textIdRev);
		textIdRev.setColumns(10);
		
		JLabel lblNumEmpleado = new JLabel("Num. Empleado");
		lblNumEmpleado.setBounds(54, 88, 81, 14);
		contentPane.add(lblNumEmpleado);
		
		textIdEmpleado = new JTextField();
		textIdEmpleado.setBounds(184, 88, 86, 20);
		contentPane.add(textIdEmpleado);
		textIdEmpleado.setColumns(10);
	}
}
