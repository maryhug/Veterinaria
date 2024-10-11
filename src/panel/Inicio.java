package panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import action_frame.PetsRegistration;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelHome;

	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 510);
	    setLocationRelativeTo(null);
		panelHome = new JPanel();
		panelHome.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelHome);
		panelHome.setLayout(null);
		
		JPanel panelOptions = new JPanel();
		panelOptions.setBounds(10, 11, 225, 449);
		panelHome.add(panelOptions);
		panelOptions.setLayout(null);
		
		JButton btnPetsRegistration = new JButton("Ingresar Pacientes");
		btnPetsRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PetsRegistration p = new PetsRegistration();
				p.setVisible(true);
			}
		});
		btnPetsRegistration.setBackground(new Color(231, 206, 234));
		btnPetsRegistration.setBounds(0, 105, 225, 49);
		panelOptions.add(btnPetsRegistration);
		
		JButton btnPatientList = new JButton("Lista de Pacientes");
		btnPatientList.setBounds(0, 158, 225, 49);
		panelOptions.add(btnPatientList);
		
		JButton btnMedicalHistory = new JButton("Historial Clinico");
		btnMedicalHistory.setBounds(0, 210, 225, 49);
		panelOptions.add(btnMedicalHistory);
		
		JButton btnAppointments = new JButton("Agenda de Citas");
		btnAppointments.setBounds(0, 261, 225, 49);
		panelOptions.add(btnAppointments);
		
		JButton btnExit = new JButton("Salir del programa");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login l = new Login();
				l.setVisible(true);
			}
		});
		btnExit.setBounds(0, 399, 225, 49);
		panelOptions.add(btnExit);
		
		JLabel lblTextMenu = new JLabel("Menu Opciones");
		lblTextMenu.setFont(new Font("Hello Valentica", Font.PLAIN, 35));
		lblTextMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextMenu.setBounds(10, 25, 205, 55);
		panelOptions.add(lblTextMenu);
		
		JButton btnBusquedaPacientes = new JButton("Busqueda de Pacientes");
		btnBusquedaPacientes.setBounds(0, 316, 225, 49);
		panelOptions.add(btnBusquedaPacientes);
		
		JPanel panelResponse = new JPanel();
		panelResponse.setBounds(245, 11, 489, 449);
		panelHome.add(panelResponse);
		panelResponse.setLayout(null);
		
		JLabel lblGifResponse = new JLabel("");
		lblGifResponse.setHorizontalAlignment(SwingConstants.CENTER);
		lblGifResponse.setIcon(new ImageIcon(Inicio.class.getResource("/images/mainBanner.gif")));
		lblGifResponse.setBounds(0, 121, 489, 200);
		panelResponse.add(lblGifResponse);
	}
}
