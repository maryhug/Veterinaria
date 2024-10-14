package appointments;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Modify extends JPanel {

	private static final long serialVersionUID = 1L;

	public Modify() {
		setLayout(null);
		
		JComboBox comboBoxPatients = new JComboBox();
		comboBoxPatients.setBounds(10, 59, 220, 22);
		add(comboBoxPatients);
		
		JLabel lblPatients = new JLabel("Pacientes: ");
		lblPatients.setBounds(10, 34, 145, 22);
		add(lblPatients);
		
		JLabel lblDay = new JLabel("Dia:");
		lblDay.setBounds(268, 13, 45, 22);
		add(lblDay);
		
		JComboBox comboBoxDay = new JComboBox();
		comboBoxDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDay.setBounds(323, 11, 45, 26);
		add(comboBoxDay);
		
		JLabel lblMonth = new JLabel("Mes: ");
		lblMonth.setBounds(268, 48, 45, 22);
		add(lblMonth);
		
		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		comboBoxMonth.setBounds(323, 46, 80, 26);
		add(comboBoxMonth);
		
		JLabel lblNewLabelYear = new JLabel("Año:");
		lblNewLabelYear.setBounds(268, 83, 45, 22);
		add(lblNewLabelYear);
		
		JComboBox comboBoxYear = new JComboBox();
		comboBoxYear.setModel(new DefaultComboBoxModel(new String[] {"2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		comboBoxYear.setBounds(323, 81, 80, 26);
		add(comboBoxYear);
		
		JButton btnSave = new JButton("Guardar");
		btnSave.setBounds(268, 158, 100, 23);
		add(btnSave);
		
		JLabel lblNewLabelPlace = new JLabel("Lugar:");
		lblNewLabelPlace.setBounds(268, 118, 45, 22);
		add(lblNewLabelPlace);
		
		JComboBox comboBoxPlace = new JComboBox();
		comboBoxPlace.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBoxPlace.setBounds(323, 116, 80, 26);
		add(comboBoxPlace);
		
		JLabel lblModify = new JLabel("Modificar");
		lblModify.setHorizontalAlignment(SwingConstants.CENTER);
		lblModify.setBounds(20, 10, 119, 19);
		add(lblModify);

	}

}