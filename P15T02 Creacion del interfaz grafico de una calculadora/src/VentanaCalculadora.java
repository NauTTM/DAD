import java.awt.EventQueue;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class VentanaCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoTexto1;
	private JTextField campoTexto2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculadora frame = new VentanaCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCalculadora() {
		setTitle("Calculadora DAD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta2 = new JLabel("Número 2: ");
		etiqueta2.setBounds(10, 48, 46, 14);
		contentPane.add(etiqueta2);
		
		JLabel etiqueta1 = new JLabel("Número 1:");
		etiqueta1.setBounds(10, 10, 50, 14);
		contentPane.add(etiqueta1);
		
		campoTexto1 = new JTextField();
		campoTexto1.setText("1");
		campoTexto1.setHorizontalAlignment(SwingConstants.RIGHT);
		campoTexto1.setBounds(64, 7, 86, 20);
		contentPane.add(campoTexto1);
		campoTexto1.setColumns(10);
		
		campoTexto2 = new JTextField();
		campoTexto2.setText("1");
		campoTexto2.setHorizontalAlignment(SwingConstants.RIGHT);
		campoTexto2.setBounds(64, 45, 86, 20);
		contentPane.add(campoTexto2);
		campoTexto2.setColumns(10);
		
		JButton botonSuma = new JButton("Suma");
		botonSuma.setBounds(10, 100, 89, 23);
		contentPane.add(botonSuma);
		
		JButton botonResta = new JButton("Resta");
		botonResta.setBounds(109, 100, 89, 23);
		contentPane.add(botonResta);
		
		JButton botonMultiplicacion = new JButton("Multiplicación");
		botonMultiplicacion.setBounds(208, 100, 118, 23);
		contentPane.add(botonMultiplicacion);
		
		JButton btnNewButton = new JButton("División");
		btnNewButton.setBounds(335, 100, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel etiquetaResultado = new JLabel("El resultado de la operación es:");
		etiquetaResultado.setBounds(23, 162, 150, 14);
		contentPane.add(etiquetaResultado);
	}
}
