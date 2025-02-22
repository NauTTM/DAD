import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VentanaCalculadora extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoTexto1;
	private JTextField campoTexto2;
	JButton botonSuma = new JButton("Suma");
	JButton botonResta = new JButton("Resta");
	JButton botonMultiplicacion = new JButton("Multiplicación");
	JButton botonDivision = new JButton("División");
	JLabel etiquetaResultado = new JLabel("El resultado de la operación es:");

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
		

		botonSuma.setBounds(10, 100, 89, 23);
		contentPane.add(botonSuma);
		botonSuma.addMouseListener((MouseListener) this);
		contentPane.add(botonSuma);
		System.out.println(etiqueta1);

		
		
		botonResta.setBounds(109, 100, 89, 23);
		contentPane.add(botonResta);
		botonResta.addMouseListener((MouseListener) this);
		contentPane.add(botonResta);

		

		botonMultiplicacion.setBounds(208, 100, 118, 23);
		contentPane.add(botonMultiplicacion);
		botonMultiplicacion.addMouseListener((MouseListener) this);
		contentPane.add(botonMultiplicacion);
		

		botonDivision.setBounds(335, 100, 89, 23);
		contentPane.add(botonDivision);
		botonDivision.addMouseListener((MouseListener) this);
		contentPane.add(botonDivision);
		

		etiquetaResultado.setBounds(10, 156, 250, 14);
		contentPane.add(etiquetaResultado);
		
		
	}
	
	public void configuracionVentana() {
		this.setVisible(true);
		}
	
	public void mousePressed(MouseEvent evento) {
		
		float resultado = 0;
		float num1 = Float.parseFloat(campoTexto1.getText());
		float num2 = Float.parseFloat(campoTexto2.getText());
		 if (botonSuma==evento.getSource()) {
			 System.out.println("Se ha pulsado el boton suma");
			 resultado = num1 + num2;
			 
		 }
		 if (botonResta==evento.getSource()) {
			 System.out.println("Se ha pulsado el boton resta");
			 resultado = num1 - num2;
		 }
		 if (botonMultiplicacion==evento.getSource()) {
			 System.out.println("Se ha pulsado el boton multiplicacion");
			 resultado = num1 * num2;
		 }
		 if (botonDivision==evento.getSource()) {
			 System.out.println("Se ha pulsado el boton divivision");
	            if (num2 != 0) {
	                resultado = num1 / num2;
	            } else {
	            	etiquetaResultado.setText("SYNTAX ERROR");
	                return;
	            }
		 }
		 
		 etiquetaResultado.setText("El resultado de la operación es: " + resultado);
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
