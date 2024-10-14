package appointments;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Modify extends JPanel {

	private static final long serialVersionUID = 1L;

	public Modify() {
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 62, 220, 22);
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Pacientes: ");
		lblNewLabel.setBounds(10, 37, 145, 22);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dia:");
		lblNewLabel_1.setBounds(260, 11, 45, 22);
		add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(320, 11, 45, 26);
		add(comboBox_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mes: ");
		lblNewLabel_1_1.setBounds(260, 48, 45, 22);
		add(lblNewLabel_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(320, 48, 80, 26);
		add(comboBox_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Año:");
		lblNewLabel_1_1_1.setBounds(260, 90, 45, 22);
		add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(320, 88, 80, 26);
		add(comboBox_1_1_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(280, 160, 100, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Lugar:");
		lblNewLabel_1_1_1_1.setBounds(260, 125, 45, 22);
		add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setBounds(320, 125, 80, 26);
		add(comboBox_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Modificar");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(23, 7, 119, 19);
		add(lblNewLabel_2);

	}

}
