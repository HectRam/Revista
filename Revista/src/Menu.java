import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	
	public Menu() {
		
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRevista = new JButton("Revista");
		btnRevista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Revista frame = new Revista();
				frame.setVisible(true);
				dispose();
			}
		});
		btnRevista.setBounds(173, 73, 89, 23);
		contentPane.add(btnRevista);
		
		JButton btnEmpleados = new JButton("Empleados");
		btnEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final Empleados data4=new Empleados();
				data4.setVisible(true);
				dispose();
			}
		});
		btnEmpleados.setBounds(220, 96, 106, 23);
		contentPane.add(btnEmpleados);
		
		
		JButton btnArticulo = new JButton("Articulo");
		btnArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final Articulo data3=new Articulo();
				data3.setVisible(true);
				dispose();
			}
		});
		btnArticulo.setBounds(114, 96, 106, 23);
		contentPane.add(btnArticulo);
		
		JButton btnDiseo = new JButton("Diseño");
		btnDiseo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Diseño frame = new Diseño();
				frame.setVisible(true);
				dispose();
			}
		});
		btnDiseo.setBounds(220, 118, 106, 23);
		contentPane.add(btnDiseo);
		
		JButton btnFotografias = new JButton("Fotografias");
		btnFotografias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Fotografias frame = new Fotografias();
				frame.setVisible(true);
				dispose();
			}
		});
		btnFotografias.setBounds(114, 118, 106, 23);
		contentPane.add(btnFotografias);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
	}

}
