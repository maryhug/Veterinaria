package Panel;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import Ingreso.IngresarU;

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

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField passwordField;
	private JButton btnIngresar;
	private JButton btnRegistrate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel LoginPanel = new JPanel();
		LoginPanel.setForeground(new Color(0, 0, 0));
		LoginPanel.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 128, 128)));
		LoginPanel.setBounds(47, 50, 308, 362);
		contentPane.add(LoginPanel);
		LoginPanel.setLayout(null);
		
		JLabel lblNombreVet = new JLabel("PetVital");
		lblNombreVet.setForeground(new Color(0, 0, 0));
		lblNombreVet.setFont(new Font("Hello Valentica", Font.BOLD, 50));
		lblNombreVet.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreVet.setBounds(59, 37, 188, 59);
		LoginPanel.add(lblNombreVet);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(60, 140, 200, 30);
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
		passwordField.setEchoChar('*');
		passwordField.setBounds(59, 206, 200, 30);
		LoginPanel.add(passwordField);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] clave = passwordField.getPassword();
				String claveFinal = new String(clave);
				
				if(textUsuario.getText().equals("Maryhug") && claveFinal.equals("1234")) {
					dispose();
					Inicio i = new Inicio();
					i.setVisible(true);
				}else {
					dispose();
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña Inconrrectos",claveFinal, JOptionPane.ERROR_MESSAGE, null);
					Inicio i = new Inicio();
					i.setVisible(true);
				}
				
			}
		});
		btnIngresar.setBounds(110, 247, 110, 30);
		LoginPanel.add(btnIngresar);
		
		btnRegistrate = new JButton("Registrate");
		btnRegistrate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				IngresarU p = new IngresarU();
				p.setVisible(true);
			}
		});
		btnRegistrate.setBounds(110, 284, 110, 30);
		LoginPanel.add(btnRegistrate);
		
		JPanel DiseñoPanel = new JPanel();
		DiseñoPanel.setBackground(new Color(255, 255, 255));
		DiseñoPanel.setForeground(new Color(255, 255, 255));
		DiseñoPanel.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		DiseñoPanel.setBounds(365, 50, 308, 362);
		contentPane.add(DiseñoPanel);
		DiseñoPanel.setLayout(null);
		
		JLabel lblImagenLogin = new JLabel("");
		lblImagenLogin.setBackground(Color.WHITE);
		lblImagenLogin.setForeground(Color.WHITE);
		lblImagenLogin.setIcon(new ImageIcon("C:\\Users\\maryh\\Downloads\\288x288.png"));
		lblImagenLogin.setBounds(10, 37, 288, 288);
		DiseñoPanel.add(lblImagenLogin);
	}
}
