package appointments;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class List extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public List() {
setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 65, 220, 22);
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Pacientes: ");
		lblNewLabel.setBounds(10, 38, 145, 22);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dia:");
		lblNewLabel_1.setBounds(249, 16, 45, 22);
		add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(325, 11, 45, 26);
		add(comboBox_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mes: ");
		lblNewLabel_1_1.setBounds(249, 50, 45, 22);
		add(lblNewLabel_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(325, 47, 80, 26);
		add(comboBox_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Año:");
		lblNewLabel_1_1_1.setBounds(249, 86, 45, 22);
		add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(325, 83, 80, 26);
		add(comboBox_1_1_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(280, 162, 100, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Lugar:");
		lblNewLabel_1_1_1_1.setBounds(249, 118, 45, 22);
		add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setBounds(325, 119, 80, 26);
		add(comboBox_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Listar");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(31, 11, 119, 19);
		add(lblNewLabel_2);

	}

}
