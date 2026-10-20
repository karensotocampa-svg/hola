package sedundoParcia;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TABLA {

	private JFrame frmCalculadora;
	private JTextField txtNumero;
	private JButton btnVer;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TABLA window = new TABLA();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TABLA() {
		initialize();
	}

	public void calcularTabla() {
		try {
			int n = Integer.parseInt(txtNumero.getText().toString());
			txtResultado.setText(n + " x 1 = " +
			                    (n * 1) + "\n" + n +" x 2 = " + (n * 2) + "\n" + n + " x 3 = "
					+ (n * 3) + "\n" + n + " x 4 = " + (n * 4) + "\n" + n + " x 5 = " + (n * 5) + "\n" + n + " x 6 = "
					+ (n * 6) + "\n" + n + " x 7 = " + (n * 7) + "\n" + n + " x 8 = " + (n * 8) + "\n" + n + " x 9 = "
					+ (n * 9) + "\n" + n + " x 10 = " + (n * 10));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo salio mal cecyto");
		}
	}

	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(TABLA.class.getResource("/img/Icono1.png")));
		frmCalculadora.setTitle("CALCULADORA 1");
		frmCalculadora.setBounds(100, 100, 416, 334);
		frmCalculadora.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCalculadora.setLocationRelativeTo(null);
		frmCalculadora.getContentPane().setLayout(null);

		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(10, 27, 64, 17);
		frmCalculadora.getContentPane().add(lblNumero);

		txtNumero = new JTextField();
		txtNumero.setBounds(84, 26, 86, 20);
		frmCalculadora.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);

		txtResultado = new JTextArea();
		txtResultado.setBounds(56, 68, 336, 218);
		txtResultado.setForeground(new Color(0, 0, 0));
		txtResultado.setEditable(false);
		txtResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmCalculadora.getContentPane().add(txtResultado);

		btnVer = new JButton("ver");
		btnVer.setBounds(180, 24, 89, 23);
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularTabla();
			}
		});
		frmCalculadora.getContentPane().add(btnVer);

		JButton btnDel = new JButton("Del");
		btnDel.setBounds(285, 24, 89, 23);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumero.setText("");
				txtResultado.setText("");
			}
		});
		frmCalculadora.getContentPane().add(btnDel);
	}
}