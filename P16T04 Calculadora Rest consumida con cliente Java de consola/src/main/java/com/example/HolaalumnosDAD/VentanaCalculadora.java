package com.example.HolaalumnosDAD;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

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
	String direccionIPServidor="localhost";
	int puertoRegistroRMI=3000;
	String rutaDelObjetoEnElRegistroRMI="/SumaRestaMultiplicacionDivision";
	String urlObjetoRemoto = "rmi://"+direccionIPServidor+":"+puertoRegistroRMI+rutaDelObjetoEnElRegistroRMI;



	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaCalculadora (){
		try {
			
			//String direccionIPServidor="localhost";
			//int puertoRegistroRMI=3000;
			//String rutaDelObjetoEnElRegistroRMI="/SumaRestaMultiplicacionDivision";
			//String urlObjetoRemoto = "rmi://"+direccionIPServidor+":"+puertoRegistroRMI+rutaDelObjetoEnElRegistroRMI;
			
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
		

			etiquetaResultado.setBounds(10, 156, 316, 14);
			contentPane.add(etiquetaResultado);
		}
		
		catch(Exception excepcion) {
			System.out.println("En HolaCliente se ha producido la excepcion " + excepcion);
		}
		
		
	}
	
	public void configuracionVentana() {
		this.setVisible(true);
		}
	
	public void mousePressed(MouseEvent evento) {
		try {
			
			SRMDInterface referenciaObjetoRemoto = (SRMDInterface)Naming.lookup(this.urlObjetoRemoto);
			float resultado = 0;
			float num1 = Float.parseFloat(campoTexto1.getText());
			float num2 = Float.parseFloat(campoTexto2.getText());
			if (botonSuma==evento.getSource()) {
				resultado=referenciaObjetoRemoto.sumar(num1, num2);
				etiquetaResultado.setText("El resultado de la operación es: " + resultado);
			}
			if (botonResta==evento.getSource()) {
				resultado=referenciaObjetoRemoto.restar(num1, num2);
				etiquetaResultado.setText("El resultado de la operación es: " + resultado);
			}
			if (botonMultiplicacion==evento.getSource()) {
				resultado=referenciaObjetoRemoto.multiplicar(num1, num2);
				etiquetaResultado.setText("El resultado de la operación es: " + resultado);
			}
			if (botonDivision==evento.getSource()) {
	            resultado=referenciaObjetoRemoto.dividir(num1, num2);
	            etiquetaResultado.setText("El resultado de la operación es: " + resultado);
			}
		}
		catch(Exception excepcion) {
				
		}
		 
		 
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