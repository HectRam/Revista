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

public class Fotografias extends JFrame {

	private JPanel contentPane;
	private JTextField textIdFotos;
	private JTextField textNumFotos;
	private JTextField textTipo;
	private JTextField textIdRev;
	private JTextField textIdEmpleado;

	Conexion conexion=new Conexion();
	Rev rev=new Rev();
	
	public Fotografias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IdFotos");
		lblNewLabel.setBounds(69, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		textIdFotos = new JTextField();
		textIdFotos.setBounds(165, 37, 86, 20);
		contentPane.add(textIdFotos);
		textIdFotos.setColumns(10);
		
		JLabel lblNumfotos = new JLabel("Numero de Fotos");
		lblNumfotos.setBounds(69, 94, 86, 14);
		contentPane.add(lblNumfotos);
		
		JLabel lblTipoDeFotos = new JLabel("Tipo de fotos");
		lblTipoDeFotos.setBounds(69, 119, 75, 14);
		contentPane.add(lblTipoDeFotos);
		
		textNumFotos = new JTextField();
		textNumFotos.setBounds(165, 91, 86, 20);
		contentPane.add(textNumFotos);
		textNumFotos.setColumns(10);
		
		textTipo = new JTextField();
		textTipo.setBounds(165, 116, 86, 20);
		contentPane.add(textTipo);
		textTipo.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rev.setIdFotos(Integer.parseInt(textIdFotos.getText()));		/*primero toma del cuadro de texto el id del pez, luego lo envia a la clase Pez y lo busca*/			
				rev.buscarfotografias(conexion.conectar());						/*conecta el metodo pez con la base de Datos*/
				
				
				textIdFotos.setText(String.valueOf(rev.getIdDiseo()));		/*toma de la clase Pez el id, los transforma a String y lo envia al cuadro de texto*/
				textIdRev.setText(String.valueOf(rev.getIdRev()));
				textIdEmpleado.setText(String.valueOf(rev.getIdEmpleado()));	
				textNumFotos.setText(String.valueOf(rev.getNumFotos()));
				textTipo.setText(rev.gettipofot());
				
			}
		});
		btnBuscar.setBounds(26, 227, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rev.setIdFotos(Integer.parseInt(textIdFotos.getText()));  /*toma del cuadro de texto el dato y lo envia a la clase Rev*/
				rev.setIdRev(Integer.parseInt(textIdRev.getText()));
				rev.setIdEmpleado(Integer.parseInt(textIdEmpleado.getText())); 
				rev.setNumFotos(Integer.parseInt(textNumFotos.getText())); 
				rev.settipofot(textTipo.getText());
				
				
				rev.Insertarfotografias(conexion.conectar());						/*conecta conecta el metodo INSERTAR con la base de Datos*/
				
				textIdFotos.setText("");
				textIdRev.setText("");
				textIdEmpleado.setText("");
				textNumFotos.setText("");
				textTipo.setText("");
				
				//JOptionPane.showMessageDialog(textPez, "SU PEZ SE HA GUARDADO CORRECTAMENTE","CONEXION", getDefaultCloseOperation());
			}
		});
		btnInsertar.setBounds(165, 227, 89, 23);
		contentPane.add(btnInsertar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final Menu frame = new Menu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setBounds(335, 227, 89, 23);
		contentPane.add(btnRegresar);
		
		JLabel lblIdRevista = new JLabel("Id. Revista");
		lblIdRevista.setBounds(69, 15, 86, 14);
		contentPane.add(lblIdRevista);
		
		textIdRev = new JTextField();
		textIdRev.setBounds(165, 12, 86, 20);
		contentPane.add(textIdRev);
		textIdRev.setColumns(10);
		
		JLabel lblIdempleado = new JLabel("IdEmpleado");
		lblIdempleado.setBounds(69, 69, 86, 14);
		contentPane.add(lblIdempleado);
		
		textIdEmpleado = new JTextField();
		textIdEmpleado.setBounds(165, 66, 86, 20);
		contentPane.add(textIdEmpleado);
		textIdEmpleado.setColumns(10);
	}

}
