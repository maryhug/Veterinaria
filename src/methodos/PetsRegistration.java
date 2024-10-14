package methodos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import panel.Login;
import panel.SearchPatients;

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
import java.awt.Dimension;

public class PetsRegistration extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    
    public PetsRegistration() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 755, 502);
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
        btnPatientList.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		PatientList listar = new PatientList();
        		listar.setVisible(true);
        	}
        });
        btnPatientList.setBounds(0, 108, 225, 49);
        panelOptions.add(btnPatientList);

        JButton btnMedicalHistory = new JButton("Historial Clinico");
        btnMedicalHistory.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		MedicalHistory historial = new MedicalHistory();
        		historial.setVisible(true);
        	}
        });
        btnMedicalHistory.setBounds(0, 160, 225, 49);
        panelOptions.add(btnMedicalHistory);

        JButton btnAppointments = new JButton("Agenda de Citas");
        btnAppointments.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Appointments citas = new Appointments();
        		citas.setVisible(true);
        	}
        });
        btnAppointments.setBounds(0, 211, 225, 49);
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

        JButton btnBusquedaPacientes = new JButton("Busqueda de Pacientes");
        btnBusquedaPacientes.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		SearchPatients buscar = new SearchPatients();
        		buscar.setVisible(true);
        	}
        });
        btnBusquedaPacientes.setBounds(0, 266, 225, 49);
        panelOptions.add(btnBusquedaPacientes);

        JPanel panelResponse = new JPanel();
        panelResponse.setLayout(null);
        panelResponse.setBounds(245, 11, 489, 449);
        contentPane.add(panelResponse);

        JLabel lblPetsRegistration = new JLabel("Ingresar Pacientes");
        lblPetsRegistration.setHorizontalAlignment(SwingConstants.CENTER);
        lblPetsRegistration.setFont(new Font("Hello Valentica", Font.PLAIN, 50));
        lblPetsRegistration.setBounds(10, 11, 469, 60);
        panelResponse.add(lblPetsRegistration);

        // Crear JScrollPane
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 82, 469, 359);
        panelResponse.add(scrollPane);

        // Crear un panel que contendrá todos los campos y agregarlo al JScrollPane
        JPanel panelInfo = new JPanel();
        panelInfo.setLayout(null);
        panelInfo.setPreferredSize(new Dimension(450, 1050)); // Ajusta el tamaño para activar el scroll
        scrollPane.setViewportView(panelInfo);

        // Añadir los campos al panelInfo
        JLabel lblNewLabel = new JLabel("Nombre de la mascota:");
        lblNewLabel.setBounds(10, 20, 160, 14);
        panelInfo.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(10, 40, 430, 30);
        panelInfo.add(textField);
        textField.setColumns(10);

        JLabel lblEspecieDeLa = new JLabel("Especie de la mascota:");
        lblEspecieDeLa.setBounds(10, 80, 160, 14);
        panelInfo.add(lblEspecieDeLa);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Perro", "Gato", "Conejo", "Tortuga", "Otro"}));
        comboBox.setBounds(10, 100, 190, 22);
        panelInfo.add(comboBox);

        textField_1 = new JTextField();
        textField_1.setBounds(210, 100, 230, 22);
        panelInfo.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblEspecie = new JLabel("Otra especie:");
        lblEspecie.setBounds(210, 80, 160, 14);
        panelInfo.add(lblEspecie);

        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(10, 140, 160, 14);
        panelInfo.add(lblSexo);

        textField_2 = new JTextField();
        textField_2.setBounds(10, 160, 430, 30);
        panelInfo.add(textField_2);

        JLabel lblEdadOFecha = new JLabel("Edad o Fecha de nacimiento:");
        lblEdadOFecha.setBounds(10, 200, 190, 14);
        panelInfo.add(lblEdadOFecha);

        textField_3 = new JTextField();
        textField_3.setBounds(10, 220, 430, 30);
        panelInfo.add(textField_3);

        JLabel lblColorOMarcas = new JLabel("Color o marcas distintivas:");
        lblColorOMarcas.setBounds(10, 260, 190, 14);
        panelInfo.add(lblColorOMarcas);

        textField_4 = new JTextField();
        textField_4.setBounds(10, 280, 430, 30);
        panelInfo.add(textField_4);

        JLabel lblPeso = new JLabel("Peso:");
        lblPeso.setBounds(10, 320, 160, 14);
        panelInfo.add(lblPeso);

        textField_5 = new JTextField();
        textField_5.setBounds(10, 340, 430, 30);
        panelInfo.add(textField_5);

        JLabel lblEsterilizacion = new JLabel("Esterilización?");
        lblEsterilizacion.setBounds(10, 380, 160, 14);
        panelInfo.add(lblEsterilizacion);

        JComboBox<String> comboBox_1 = new JComboBox<>();
        comboBox_1.setModel(new DefaultComboBoxModel<>(new String[]{"Sí", "No"}));
        comboBox_1.setBounds(10, 400, 190, 22);
        panelInfo.add(comboBox_1);

        JLabel lblHistorialMedico = new JLabel("Historial médico previo:");
        lblHistorialMedico.setBounds(10, 440, 430, 14);
        panelInfo.add(lblHistorialMedico);

        textField_6 = new JTextField();
        textField_6.setBounds(10, 460, 430, 30);
        panelInfo.add(textField_6);

        JLabel lblDatosDueno = new JLabel("Datos del Dueño");
        lblDatosDueno.setFont(new Font("Segoe Script", Font.BOLD, 15));
        lblDatosDueno.setHorizontalAlignment(SwingConstants.CENTER);
        lblDatosDueno.setBounds(10, 500, 430, 30);
        panelInfo.add(lblDatosDueno);

        JLabel lblNombrePropietario = new JLabel("Nombre del propietario:");
        lblNombrePropietario.setBounds(10, 540, 160, 14);
        panelInfo.add(lblNombrePropietario);

        textField_7 = new JTextField();
        textField_7.setBounds(10, 560, 430, 30);
        panelInfo.add(textField_7);

        JLabel lblDireccionPropietario = new JLabel("Dirección del propietario:");
        lblDireccionPropietario.setBounds(10, 600, 160, 14);
        panelInfo.add(lblDireccionPropietario);

        textField_8 = new JTextField();
        textField_8.setBounds(10, 620, 430, 30);
        panelInfo.add(textField_8);

        JLabel lblTelefonoPropietario = new JLabel("Teléfono del propietario:");
        lblTelefonoPropietario.setBounds(10, 660, 160, 14);
        panelInfo.add(lblTelefonoPropietario);

        textField_9 = new JTextField();
        textField_9.setBounds(10, 680, 430, 30);
        panelInfo.add(textField_9);

        JLabel lblCorreoPropietario = new JLabel("Correo del propietario:");
        lblCorreoPropietario.setBounds(10, 720, 160, 14);
        panelInfo.add(lblCorreoPropietario);

        textField_10 = new JTextField();
        textField_10.setBounds(10, 740, 430, 30);
        panelInfo.add(textField_10);
        
        JLabel lblDatosExtra = new JLabel("Datos Extra");
        lblDatosExtra.setFont(new Font("Segoe Script", Font.BOLD, 15));
        lblDatosExtra.setHorizontalAlignment(SwingConstants.CENTER);
        lblDatosExtra.setBounds(10, 780, 430, 30);
        panelInfo.add(lblDatosExtra);
        
        JLabel lblVeterinario = new JLabel("Veterinario asiganado:");
        lblVeterinario.setBounds(10, 820, 160, 14);
        panelInfo.add(lblVeterinario);

        textField_11 = new JTextField();
        textField_11.setBounds(10, 840, 430, 30);
        panelInfo.add(textField_11);

        JLabel lblFechaIngreso = new JLabel("Teléfono del propietario:");
        lblFechaIngreso.setBounds(10, 880, 160, 14);
        panelInfo.add(lblFechaIngreso);

        textField_12 = new JTextField();
        textField_12.setBounds(10, 900, 430, 30);
        panelInfo.add(textField_12);
        
        JLabel lblextra = new JLabel("Datos extra del propietario:");
        lblextra.setBounds(10, 940, 160, 14);
        panelInfo.add(lblextra);

        textField_13 = new JTextField();
        textField_13.setBounds(10, 960, 430, 30);
        panelInfo.add(textField_13);
        
        JButton btnSave = new JButton("Guardar");
        btnSave.setBounds(10, 1000, 430
        		, 30);
        panelInfo.add(btnSave);
        
    }

}