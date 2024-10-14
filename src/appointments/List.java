package appointments;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class List extends JPanel {

	private static final long serialVersionUID = 1L;

	public List() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Pacientes: ");
		lblNewLabel.setBounds(10, 38, 145, 22);
		add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 65, 220, 22);
		add(comboBox);

		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(280, 162, 100, 23);
		add(btnNewButton);

	}

}
