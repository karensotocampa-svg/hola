package sedundoParcia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Component;
import javax.swing.Box;
import java.awt.BorderLayout;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TABLAS2 {

	private JFrame frmTablas;
	private JSlider sldNumero;
	private JLabel lblNumero;
	private JTextArea txtResultado;
	public JFrame frmBotonOpcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TABLAS2 window = new TABLAS2();
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
	public TABLAS2() {
		initialize();
	}

	public void calcularTabla() {
		try {
			int n = sldNumero.getValue();
			txtResultado.setText(n + "x1=" + (n * 1) + "\n" + n + "x2=" + (n * 2) + "\n" + n + "x3=" + (n * 1) + "\n"
					+ n + "x4=" + (n * 1) + "\n" + n + "x5=" + (n * 1) + "\n" + n + "x6=" + (n * 1) + "\n" + n + "x7="
					+ (n * 1) + "\n" + n + "x8=" + (n * 1) + "\n" + n + "x9=" + (n * 1) + "\n" + n + "x10=" + (n * 1)
					+ "\n");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo salio mal");

		}
	}

	private void initialize() {
		frmTablas = new JFrame();
		frmTablas.setIconImage(Toolkit.getDefaultToolkit().getImage(TABLAS2.class.getResource("/img/Icono1.png")));
		frmTablas.setTitle("TABLAS 2");
		frmTablas.setFont(new Font("Dialog", Font.PLAIN, 20));
		frmTablas.setBounds(100, 100, 457, 448);
		frmTablas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablas.getContentPane().setLayout(null);
		frmTablas.setLocationRelativeTo(null);

		lblNumero = new JLabel("0");
		lblNumero.setBounds(343, 29, 55, 26);
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumero.setForeground(new Color(0, 0, 0));
		frmTablas.getContentPane().add(lblNumero);

		txtResultado = new JTextArea();
		txtResultado.setBackground(new Color(217, 255, 255));
		txtResultado.setEditable(false);
		txtResultado.setBounds(22, 114, 318, 272);
		frmTablas.getContentPane().add(txtResultado);

		sldNumero = new JSlider();
		sldNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNumero.setText("" + sldNumero.getValue());
				calcularTabla();
			}
		});
		sldNumero.setMajorTickSpacing(10);
		sldNumero.setSnapToTicks(true);
		sldNumero.setPaintTicks(true);
		sldNumero.setValue(0);
		sldNumero.setPaintLabels(true);
		sldNumero.setAutoscrolls(true);
		sldNumero.setBounds(10, 29, 318, 53);
		frmTablas.getContentPane().add(sldNumero);

		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sldNumero.setValue(0);
				lblNumero.setText("0");
				txtResultado.setText("");

			}
		});
		btnDel.setBounds(330, 84, 84, 20);
		frmTablas.getContentPane().add(btnDel);

	}
}
