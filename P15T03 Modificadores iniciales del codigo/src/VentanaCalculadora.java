import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class VentanaCalculadora extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoTexto1;
	private JTextField campoTexto2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaCalculadora (){
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
		botonSuma.addMouseListener((MouseListener) this);
		contentPane.add(botonSuma);
		
		JButton botonResta = new JButton("Resta");
		botonResta.setBounds(109, 100, 89, 23);
		contentPane.add(botonResta);
		botonResta.addMouseListener((MouseListener) this);
		contentPane.add(botonResta);
		
		JButton botonMultiplicacion = new JButton("Multiplicación");
		botonMultiplicacion.setBounds(208, 100, 118, 23);
		contentPane.add(botonMultiplicacion);
		botonMultiplicacion.addMouseListener((MouseListener) this);
		contentPane.add(botonMultiplicacion);
		
		JButton botonDivision = new JButton("División");
		botonDivision.setBounds(335, 100, 89, 23);
		contentPane.add(botonDivision);
		botonDivision.addMouseListener((MouseListener) this);
		contentPane.add(botonDivision);
		
		JLabel etiquetaResultado = new JLabel("El resultado de la operación es:");
		etiquetaResultado.setBounds(23, 162, 150, 14);
		contentPane.add(etiquetaResultado);
		
		
	}
	
	public void configuracionVentana() {
		this.setVisible(true);
		}
	
	public void mousePressed(MouseEvent evento) {
		 System.out.println("Se ha pulsado un boton. Aún no se sabe que boton es.");
	}//fin mousePressed()
	
	public void mouseClicked(MouseEvent evento) {
	}//fin mouseClicked()
	
	public void mouseReleased(MouseEvent evento) {
	}//fin mouseReleased()
	
	public void mouseEntered(MouseEvent evento) {
	}//fin mouseEntered()
	
	public void mouseExited(MouseEvent evento) {
	}//fin mouseExited()
}
