package sedundoParcia;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
public class SIGNOZODIACAL {
	private JFrame frame;
	private JLabel lblValorDia;
	private JSlider sldDia;
	private JComboBox cmbMes;
	private JLabel lblFecha;
	private JLabel lblSigno;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SIGNOZODIACAL window = new SIGNOZODIACAL();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SIGNOZODIACAL() {
		initialize();
	}

	public void calcularSigno() {
		int dia = sldDia.getValue();
		lblValorDia.setText("" + dia);
		String mes = cmbMes.getSelectedItem().toString();
		lblFecha.setText(dia + " de " + mes);
		switch (mes) {
		case "Enero":
			if (dia >= 20) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/ACUARIO.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/capricornio.png")));
			}
			break;
		case "Febrero":
			if (dia >= 19) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/piscis.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/ACUARIO.png")));
			}
			break;
		case "Marzo":
			if (dia >= 21) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/aries.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/piscis.png")));
			}
			break;
		case "Abril":
			if (dia >= 20) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/tauro.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/aries.png")));
			}
			break;
		case "Mayo":
			if (dia >= 21) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/geminis.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/tauro.png")));
			}
			break;
		case "Junio":
			if (dia >= 21) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/cancer.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/geminis.png")));
			}
			break;
		case "Julio":
			if (dia >= 23) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/leo.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/cancer.png")));
			}
			break;
		case "Agosto":
			if (dia >= 23) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/virgo.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/leo.png")));
			}
			break;
		case "Septiembre":
			if (dia >= 23) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/libra.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/virgo.png")));
			}
			break;
		case "Octubre":
			if (dia >= 23) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/escorpio.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/libra.png")));
			}
			break;
		case "Noviembre":
			if (dia >= 22) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/sagitario.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/escorpio.png")));
			}
			break;
		case "Diciembre":
			if (dia >= 22) {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/capricornio.png")));
			} else {
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/sagitario.png")));
			}
			break;
		}
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("SIGNO ZODIACAL");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(SIGNOZODIACAL.class.getResource("/img/Icono1.png")));
		frame.setBounds(100, 100, 1003, 550);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDia.setBounds(24, 22, 73, 44);
		frame.getContentPane().add(lblDia);

		lblSigno = 
				new JLabel("");
		lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/PORTADA SIGNOS.png")));
		lblSigno.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSigno.setBounds(416, 38, 563, 435);
		frame.getContentPane().add(lblSigno);

		lblValorDia = new JLabel("1");
		lblValorDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorDia.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblValorDia.setBounds(350, 66, 79, 52);
		frame.getContentPane().add(lblValorDia);

		JLabel lblMesTexto = new JLabel("Mes");
		lblMesTexto.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMesTexto.setBounds(24, 126, 73, 44);
		frame.getContentPane().add(lblMesTexto);

		lblFecha = new JLabel("Mes");
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFecha.setBounds(24, 225, 382, 44);
		frame.getContentPane().add(lblFecha);

		cmbMes = new JComboBox();
		cmbMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		cmbMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularSigno();
			}
		});
		cmbMes.setFont(new Font("Tahoma", Font.BOLD, 30));
		cmbMes.setBounds(24, 168, 287, 35);
		frame.getContentPane().add(cmbMes);

		sldDia = new JSlider();
		sldDia.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				calcularSigno();
			}
		});
		sldDia.setValue(1);
		sldDia.setPaintTicks(true);
		sldDia.setPaintLabels(true);
		sldDia.setMinimum(1);
		sldDia.setMaximum(30);
		sldDia.setMajorTickSpacing(2);
		sldDia.setBounds(24, 63, 319, 52);
		frame.getContentPane().add(sldDia);

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sldDia.setValue(1);
				lblValorDia.setText("1");
				cmbMes.setSelectedIndex(0);
				lblSigno.setIcon(new ImageIcon(SIGNOZODIACAL.class.getResource("/img/PORTADA SIGNOS.png")));
				lblFecha.setText("");
			}
		});
		btnReset.setBounds(317, 306, 89, 23);
		frame.getContentPane().add(btnReset);
	}
}