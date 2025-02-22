package P10T02;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;


public class P10T02Ventana extends JFrame{
		JTextArea areaDeTextoSuperior;
		JTextArea areaDeTextoInferior;
		public void configuracionVentanaChat() {
			 this.setTitle("Chat de la practica 10 de DAD");
			 this.setSize(700,700);
			 this.setLayout(new FlowLayout());
			 
			 areaDeTextoSuperior = new JTextArea();
			 areaDeTextoSuperior.setPreferredSize(new Dimension(650, 600));
			 areaDeTextoSuperior.setLineWrap(true);
			 areaDeTextoSuperior.setEditable(false);
			 areaDeTextoSuperior.setBackground(Color.LIGHT_GRAY);
			 
			 areaDeTextoInferior = new JTextArea();
			 areaDeTextoInferior.setPreferredSize(new Dimension (650, 20));
			 areaDeTextoInferior.setBackground(Color.PINK);
			 areaDeTextoInferior.setLineWrap(true);
			 
			 this.add(areaDeTextoSuperior);
			 this.add(areaDeTextoInferior);
			 this.setVisible(true);
		 }
}
