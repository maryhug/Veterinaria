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

public class Appointments extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Appointments() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 520);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 739, 481);
		contentPane.add(contentPane_1);

		JPanel panelResponse = new JPanel();
		panelResponse.setLayout(null);
		panelResponse.setBounds(240, 11, 489, 449);
		contentPane_1.add(panelResponse);

		JLabel lblCitasMedicas = new JLabel("Citas Medicas");
		lblCitasMedicas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCitasMedicas.setFont(new Font("Hello Valentica", Font.PLAIN, 50));
		lblCitasMedicas.setBounds(10, 11, 469, 60);
		panelResponse.add(lblCitasMedicas);

		JPanel panel = new JPanel();
		panel.setBounds(10, 82, 469, 356);
		panelResponse.add(panel);
		panel.setLayout(null);

		JPanel panelOptions = new JPanel();
		panelOptions.setLayout(null);
		panelOptions.setBounds(10, 11, 225, 449);
		contentPane_1.add(panelOptions);

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
		btnPatientList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PatientList lista = new PatientList();
				lista.setVisible(true);
			}
		});
		btnPatientList.setBackground(UIManager.getColor("Button.background"));
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
		btnAppointments.setBackground(new Color(240, 240, 240));
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
