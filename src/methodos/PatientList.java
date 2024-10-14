package methodos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import panel.Login;
import panel.SearchPatients;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public PatientList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 755, 520);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelResponse = new JPanel();
		panelResponse.setLayout(null);
		panelResponse.setBounds(240, 11, 489, 449);
		contentPane.add(panelResponse);
		
		JLabel lblListarPacientes = new JLabel("Listar Pacientes");
		lblListarPacientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblListarPacientes.setFont(new Font("Hello Valentica", Font.PLAIN, 50));
		lblListarPacientes.setBounds(10, 11, 469, 60);
		panelResponse.add(lblListarPacientes);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 82, 469, 356);
		panelResponse.add(panel);
		
		JPanel panelOptions = new JPanel();
		panelOptions.setLayout(null);
		panelOptions.setBounds(10, 11, 225, 449);
		contentPane.add(panelOptions);
		
		JButton btnPetsRegistration = new JButton("Ingresar Pacientes");
		btnPetsRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PetsRegistration l = new PetsRegistration();
				l.setVisible(true);
			}
		});
		btnPetsRegistration.setBackground(UIManager.getColor("Button.background"));
		btnPetsRegistration.setBounds(0, 57, 225, 49);
		panelOptions.add(btnPetsRegistration);
		
		JButton btnPatientList = new JButton("Lista de Pacientes");
		btnPatientList.setBackground(new Color(240, 240, 240));
		btnPatientList.setBounds(0, 110, 225, 49);
		panelOptions.add(btnPatientList);
		
		JButton btnMedicalHistory = new JButton("Historial Clinico");
		btnMedicalHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MedicalHistory l = new MedicalHistory();
				l.setVisible(true);
			}
		});
		btnMedicalHistory.setBounds(0, 162, 225, 49);
		panelOptions.add(btnMedicalHistory);
		
		JButton btnAppointments = new JButton("Agenda de Citas");
		btnAppointments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Appointments l = new Appointments();
				l.setVisible(true);
			}
		});
		btnAppointments.setBounds(0, 213, 225, 49);
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
		
		JButton btnSearchPatients = new JButton("Busqueda de Pacientes");
		btnSearchPatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SearchPatients l = new SearchPatients();
				l.setVisible(true);
			}
		});
		btnSearchPatients.setBounds(0, 268, 225, 49);
		panelOptions.add(btnSearchPatients);
	}

}
