package panel;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import sign_in.IngresarU;

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
import javax.swing.UIManager;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textUser;
	private JPasswordField passwordField;
	private JButton btnEnter;
	private JButton btnRegister;
	private JPanel panelLogin;

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
        setBounds(100, 100, 755, 520);
	    setLocationRelativeTo(null);
		panelLogin = new JPanel();
		panelLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelLogin);
		panelLogin.setLayout(null);

		JPanel LoginPanel = new JPanel();
		LoginPanel.setForeground(new Color(0, 0, 0));
		LoginPanel
				.setBorder(UIManager.getBorder("TextField.border"));
		LoginPanel.setBounds(47, 50, 308, 362);
		panelLogin.add(LoginPanel);
		LoginPanel.setLayout(null);

		JLabel lblNameVet = new JLabel("PetVital");
		lblNameVet.setForeground(new Color(0, 0, 0));
		lblNameVet.setFont(new Font("Hello Valentica", Font.BOLD, 50));
		lblNameVet.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameVet.setBounds(59, 37, 188, 59);
		LoginPanel.add(lblNameVet);

		textUser = new JTextField();
		textUser.setBounds(60, 140, 200, 30);
		LoginPanel.add(textUser);
		textUser.setColumns(10);

		JLabel lblUser = new JLabel("Usuario: ");
		lblUser.setForeground(new Color(0, 0, 0));
		lblUser.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblUser.setBounds(69, 115, 65, 14);
		LoginPanel.add(lblUser);

		JLabel lblPassword = new JLabel("Contraseña: ");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblPassword.setBounds(70, 181, 100, 14);
		LoginPanel.add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(59, 206, 200, 30);
		LoginPanel.add(passwordField);

		btnEnter = new JButton("Ingresar");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Inicio i = new Inicio();
				i.setVisible(true);
			}
		});
		btnEnter.setBounds(110, 247, 110, 30);
		LoginPanel.add(btnEnter);

		btnRegister = new JButton("Registrate");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				IngresarU p = new IngresarU();
				p.setVisible(true);
			}
		});
		btnRegister.setBounds(110, 284, 110, 30);
		LoginPanel.add(btnRegister);

		JPanel panelDesignImagen = new JPanel();
		panelDesignImagen.setBackground(new Color(255, 255, 255));
		panelDesignImagen.setForeground(new Color(255, 255, 255));
		panelDesignImagen
				.setBorder(new TitledBorder(
						new TitledBorder(
								new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255),
										new Color(160, 160, 160)),
								"", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)),
						"", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelDesignImagen.setBounds(365, 50, 308, 362);
		panelLogin.add(panelDesignImagen);
		panelDesignImagen.setLayout(null);

		JLabel lblImagenLogin = new JLabel("");
		lblImagenLogin.setBackground(Color.WHITE);
		lblImagenLogin.setForeground(Color.WHITE);
		lblImagenLogin.setIcon(new ImageIcon(Login.class.getResource("/Images/Login.png")));
		lblImagenLogin.setBounds(10, 37, 288, 288);
		panelDesignImagen.add(lblImagenLogin);
	}
}
