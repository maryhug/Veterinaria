package appointments;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Add extends JPanel {

	private static final long serialVersionUID = 1L;

	public Add() {
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 59, 220, 22);
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Pacientes: ");
		lblNewLabel.setBounds(10, 34, 145, 22);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dia:");
		lblNewLabel_1.setBounds(268, 13, 45, 22);
		add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setBounds(323, 11, 45, 26);
		add(comboBox_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mes: ");
		lblNewLabel_1_1.setBounds(268, 48, 45, 22);
		add(lblNewLabel_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		comboBox_1_1.setBounds(323, 46, 80, 26);
		add(comboBox_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Año:");
		lblNewLabel_1_1_1.setBounds(268, 83, 45, 22);
		add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		comboBox_1_1_1.setBounds(323, 81, 80, 26);
		add(comboBox_1_1_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(268, 158, 100, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Lugar:");
		lblNewLabel_1_1_1_1.setBounds(268, 118, 45, 22);
		add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1_1_1_1.setBounds(323, 116, 80, 26);
		add(comboBox_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Agregar");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 10, 119, 19);
		add(lblNewLabel_2);

	}

}
