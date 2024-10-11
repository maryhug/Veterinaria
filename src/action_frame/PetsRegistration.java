package action_frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import panel.Login;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class PetsRegistration extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_7;
    private JTextField textField_6;
    private JTextField textField_8;

    public PetsRegistration() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 780, 788);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panelOptions = new JPanel();
        panelOptions.setLayout(null);
        panelOptions.setBounds(10, 11, 225, 449);
        contentPane.add(panelOptions);
        
        JButton btnPetsRegistration = new JButton("Ingresar Pacientes");
        btnPetsRegistration.setBackground(new Color(240, 240, 240));
        btnPetsRegistration.setBounds(0, 55, 225, 49);
        panelOptions.add(btnPetsRegistration);
        
        JButton btnPatientList = new JButton("Lista de Pacientes");
        btnPatientList.setBounds(0, 108, 225, 49);
        panelOptions.add(btnPatientList);
        
        JButton btnMedicalHistory = new JButton("Historial Clinico");
        btnMedicalHistory.setBounds(0, 160, 225, 49);
        panelOptions.add(btnMedicalHistory);
        
        JButton btnAppointments = new JButton("Agenda de Citas");
        btnAppointments.setBounds(0, 211, 225, 49);
        panelOptions.add(btnAppointments);
        
        JButton btnExit = new JButton("Salir del programa");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                // Suponiendo que Login es otra clase que quieres mostrar.
                Login l = new Login();
                l.setVisible(true);
            }
        });
        btnExit.setBounds(0, 399, 225, 49);
        panelOptions.add(btnExit);
        
        JButton btnBusquedaPacientes = new JButton("Busqueda de Pacientes");
        btnBusquedaPacientes.setBounds(0, 266, 225, 49);
        panelOptions.add(btnBusquedaPacientes);
        
        JPanel panelResponse = new JPanel();
        panelResponse.setLayout(null);
        panelResponse.setBounds(245, 11, 509, 844);
        contentPane.add(panelResponse);
        
        JLabel lblPetsRegistration = new JLabel("Ingresar Pacientes");
        lblPetsRegistration.setHorizontalAlignment(SwingConstants.CENTER);
        lblPetsRegistration.setFont(new Font("Hello Valentica", Font.PLAIN, 50));
        lblPetsRegistration.setBounds(10, 11, 469, 60);
        panelResponse.add(lblPetsRegistration);
        
        // Panel con la información
        JPanel panelInfo = new JPanel();
        panelInfo.setLayout(null);
        panelInfo.setBounds(0, 0, 469, 900); // Panel con gran tamaño para que se desplace

        // Añadir JScrollPane para permitir desplazamiento
        JScrollPane scrollPane = new JScrollPane(panelInfo);
        scrollPane.setBounds(10, 82, 489, 641); // Establecer límites del área visible
        panelResponse.add(scrollPane);

        // Resto de componentes dentro de panelInfo
        textField = new JTextField();
        textField.setBounds(10, 55, 430, 30);
        panelInfo.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Nombre de la mascosta:");
        lblNewLabel.setBounds(10, 36, 160, 14);
        panelInfo.add(lblNewLabel);
        
        JLabel lblEspecieDeLa = new JLabel("Especie de la mascosta:");
        lblEspecieDeLa.setBounds(10, 96, 160, 14);
        panelInfo.add(lblEspecieDeLa);
        
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Perro", "Gato", "Conejo", "Tortuga", "Hámster", "Loro", "Pez", "Otro:"}));
        comboBox.setToolTipText("");
        comboBox.setBounds(10, 121, 190, 22);
        panelInfo.add(comboBox);
        
        textField_1 = new JTextField();
        textField_1.setBounds(210, 122, 230, 21);
        panelInfo.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblEspecie = new JLabel("Otra especie:");
        lblEspecie.setBounds(210, 96, 150, 14);
        panelInfo.add(lblEspecie);
        
        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(10, 154, 160, 14);
        panelInfo.add(lblSexo);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(10, 173, 430, 30);
        panelInfo.add(textField_2);
        
        JLabel lblEdadOFecha = new JLabel("Edad o Fecha de nacimiento: ");
        lblEdadOFecha.setBounds(10, 214, 160, 14);
        panelInfo.add(lblEdadOFecha);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(10, 233, 430, 30);
        panelInfo.add(textField_3);
        
        JLabel lblColorOMarcas = new JLabel("Color o marcas distintivas:");
        lblColorOMarcas.setBounds(10, 274, 160, 14);
        panelInfo.add(lblColorOMarcas);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(10, 293, 430, 30);
        panelInfo.add(textField_4);
        
        JLabel lblPeso = new JLabel("Peso:");
        lblPeso.setBounds(10, 334, 160, 14);
        panelInfo.add(lblPeso);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(10, 353, 430, 30);
        panelInfo.add(textField_5);
        
        JLabel lblEsterilizacion = new JLabel("Esterilización?: ");
        lblEsterilizacion.setBounds(10, 394, 160, 14);
        panelInfo.add(lblEsterilizacion);
        
        JComboBox<String> comboBox_1 = new JComboBox<>();
        comboBox_1.setModel(new DefaultComboBoxModel<>(new String[] {"Si", "No"}));
        comboBox_1.setToolTipText("");
        comboBox_1.setBounds(10, 419, 190, 22);
        panelInfo.add(comboBox_1);
        
        JLabel lblHistorialMdicoPrevio = new JLabel("Historial médico previo (vacunas, enfermedades, alergias): ");
        lblHistorialMdicoPrevio.setBounds(10, 454, 430, 14);
        panelInfo.add(lblHistorialMdicoPrevio);
        
        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(10, 473, 430, 30);
        panelInfo.add(textField_7);
        
        JLabel lblDatosDueo = new JLabel("Datos Dueño");
        lblDatosDueo.setFont(new Font("Segoe Script", Font.BOLD, 15));
        lblDatosDueo.setHorizontalAlignment(SwingConstants.CENTER);
        lblDatosDueo.setBounds(10, 514, 449, 14);
        panelInfo.add(lblDatosDueo);
        
        JLabel lblHistorialMdicoPrevio_1 = new JLabel("Historial médico previo (vacunas, enfermedades, alergias): ");
        lblHistorialMdicoPrevio_1.setBounds(10, 537, 430, 14);
        panelInfo.add(lblHistorialMdicoPrevio_1);
        
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(10, 556, 430, 30);
        panelInfo.add(textField_6);
        
        JLabel lblHistorialMdicoPrevio_1_1 = new JLabel("Historial médico previo (vacunas, enfermedades, alergias): ");
        lblHistorialMdicoPrevio_1_1.setBounds(10, 597, 430, 14);
        panelInfo.add(lblHistorialMdicoPrevio_1_1);
        
        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(10, 616, 430, 30);
        panelInfo.add(textField_8);
    }
}
