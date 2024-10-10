package Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelOpciones = new JPanel();
		panelOpciones.setBounds(10, 11, 225, 449);
		contentPane.add(panelOpciones);
		panelOpciones.setLayout(null);
		
		JButton btnRegistroMascotas = new JButton("Ingresar Pacientes");
		btnRegistroMascotas.setBounds(0, 105, 225, 49);
		panelOpciones.add(btnRegistroMascotas);
		
		JButton btnListaPacientes = new JButton("Lista de Pacientes");
		btnListaPacientes.setBounds(0, 158, 225, 49);
		panelOpciones.add(btnListaPacientes);
		
		JButton btnHistorialClinico = new JButton("Historial Clinico");
		btnHistorialClinico.setBounds(0, 210, 225, 49);
		panelOpciones.add(btnHistorialClinico);
		
		JButton btnAgendaCitas = new JButton("Agenda de Citas");
		btnAgendaCitas.setBounds(0, 261, 225, 49);
		panelOpciones.add(btnAgendaCitas);
		
		JButton btnSalida = new JButton("Salir del programa");
		btnSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalida.setBounds(0, 399, 225, 49);
		panelOpciones.add(btnSalida);
		
		JLabel lblNewLabel_1 = new JLabel("Menu Opciones");
		lblNewLabel_1.setFont(new Font("Hello Valentica", Font.PLAIN, 35));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 25, 205, 55);
		panelOpciones.add(lblNewLabel_1);
		
		JButton btnBusquedaPacientes = new JButton("Busqueda de Pacientes");
		btnBusquedaPacientes.setBounds(0, 316, 225, 49);
		panelOpciones.add(btnBusquedaPacientes);
		
		JPanel panelRespuesta = new JPanel();
		panelRespuesta.setBounds(245, 11, 489, 449);
		contentPane.add(panelRespuesta);
		panelRespuesta.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\maryh\\Downloads\\banner.gif"));
		lblNewLabel.setBounds(0, 121, 489, 200);
		panelRespuesta.add(lblNewLabel);
	}
}
