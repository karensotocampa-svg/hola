package sedundoParcia;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TRA3 {

	private JFrame frmTablas;
	private JTextArea textResultado;
	private JScrollBar sclNumero;
	private JButton btnBorrar;
	private JLabel lblNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRA3 window = new TRA3();
					window.frmTablas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TRA3() {
		initialize();
	}

	public void calcularTabla() {
		try {
			int n = sclNumero.getValue();
			lblNumero.setText("" + sclNumero.getValue());
			textResultado.setText(n + " X 1=" + (n * 1) + "\n" + n + " X 2=" + (n * 2) + "\n" + n + " X 3=" + (n * 3)
					+ "\n" + n + " X 4=" + (n * 4) + "\n" + n + " X 5=" + (n * 5) + "\n" + n + " X 6=" + (n * 6) + "\n"
					+ n + " X 7=" + (n * 7) + "\n" + n + " X 8=" + (n * 8) + "\n" + n + " X 9=" + (n * 9) + "\n" + n
					+ " X 10=" + (n * 10));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error");
		}
	}

	private void initialize() {
		frmTablas = new JFrame();
		frmTablas.setIconImage(Toolkit.getDefaultToolkit().getImage(TRA3.class.getResource("/img/Icono1.png")));
		frmTablas.setTitle("TABLAS 3");
		frmTablas.setBounds(100, 100, 383, 366);
		frmTablas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablas.getContentPane().setLayout(null);
		frmTablas.setLocationRelativeTo(null);

		sclNumero = new JScrollBar();
		sclNumero.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				calcularTabla();
			}
		});
		sclNumero.setBlockIncrement(2);
		sclNumero.setOrientation(JScrollBar.HORIZONTAL);
		sclNumero.setBounds(20, 24, 251, 23);
		frmTablas.getContentPane().add(sclNumero);

		textResultado = new JTextArea();
		textResultado.setEditable(false);
		textResultado.setBounds(20, 57, 251, 263);
		frmTablas.getContentPane().add(textResultado);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sclNumero.setValue(0);
				textResultado.setText("");
			}
		});
		btnBorrar.setBounds(280, 46, 89, 23);
		frmTablas.getContentPane().add(btnBorrar);

		lblNumero = new JLabel("0");
		lblNumero.setBounds(280, 20, 59, 25);
		frmTablas.getContentPane().add(lblNumero);
	}
}