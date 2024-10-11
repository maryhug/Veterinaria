package sign_in;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import panel.Login;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresarU extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelRegister;
	private JTextField textUsuario;
	private JPasswordField passwordField;
	private JButton btnIngresar;

	public IngresarU() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 510);
	    setLocationRelativeTo(null);
		panelRegister = new JPanel();
		panelRegister.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelRegister);
		panelRegister.setLayout(null);
		
		JPanel LoginPanel = new JPanel();
		LoginPanel.setForeground(new Color(0, 0, 0));
		LoginPanel.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 128, 128)));
		LoginPanel.setBounds(379, 50, 308, 362);
		panelRegister.add(LoginPanel);
		LoginPanel.setLayout(null);
		
		JLabel lblNombreVet = new JLabel("Registrate!");
		lblNombreVet.setForeground(new Color(0, 0, 0));
		lblNombreVet.setFont(new Font("Hello Valentica", Font.BOLD, 50));
		lblNombreVet.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreVet.setBounds(36, 37, 236, 59);
		LoginPanel.add(lblNombreVet);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(59, 140, 200, 30);
		LoginPanel.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setForeground(new Color(0, 0, 0));
		lblUsuario.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblUsuario.setBounds(69, 115, 65, 14);
		LoginPanel.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña: ");
		lblContraseña.setForeground(new Color(0, 0, 0));
		lblContraseña.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblContraseña.setBounds(70, 181, 100, 14);
		LoginPanel.add(lblContraseña);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(59, 206, 200, 30);
		LoginPanel.add(passwordField);
		
		btnIngresar = new JButton("Crear");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
				Login l = new Login();
					l.setVisible(true);
			}
		});
		btnIngresar.setBounds(120, 280, 90, 30);
		LoginPanel.add(btnIngresar);
		
		JPanel DiseñoPanel = new JPanel();
		DiseñoPanel.setBackground(new Color(250, 215, 139));
		DiseñoPanel.setForeground(new Color(255, 255, 255));
		DiseñoPanel.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		DiseñoPanel.setBounds(40, 50, 308, 362);
		panelRegister.add(DiseñoPanel);
		DiseñoPanel.setLayout(null);
				
		JLabel lblImagenLogin = new JLabel("");
		lblImagenLogin.setBackground(Color.WHITE);
		lblImagenLogin.setForeground(Color.WHITE);
		lblImagenLogin.setIcon(new ImageIcon(IngresarU.class.getResource("/Images/Register.png")));
		lblImagenLogin.setBounds(10, 37, 288, 288);
		DiseñoPanel.add(lblImagenLogin);
	}
}
