import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazRevista extends JFrame {

	private JPanel contentPane;
	public static JTextField usuariocaja;
	public static JPasswordField contrasenacaja;

	
	public InterfazRevista() {
		setTitle("Acceso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblContrasea = new JLabel("Usuario");
		lblContrasea.setBounds(103, 56, 70, 14);
		contentPane.add(lblContrasea);
		
		usuariocaja = new JTextField();
		usuariocaja.setText("");
		usuariocaja.setBounds(201, 53, 86, 20);
		contentPane.add(usuariocaja);
		usuariocaja.setColumns(10);
		
		
		JLabel lblContrasea_1 = new JLabel("Contrase\u00F1a");
		lblContrasea_1.setBounds(103, 96, 70, 14);
		contentPane.add(lblContrasea_1);
		
		contrasenacaja = new JPasswordField();
		contrasenacaja.setBounds(201, 93, 86, 20);
		contentPane.add(contrasenacaja);
		final Contraseña data=new Contraseña();
		final Menu data2=new Menu();
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (data.Password()==1){
					JOptionPane.showMessageDialog(null,"Bienvenido");
					data2.setVisible(true);
					dispose(); //cierra la ventana
				}
				else{
					JOptionPane.showMessageDialog(null,"Contraseña Incorrecta");
				}
			}
		});
		btnAceptar.setBounds(86, 175, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(247, 175, 89, 23);
		contentPane.add(btnSalir);
	}

}
