package P03T03;

import javax.swing.*;
public class ventanaP03T03 {
	JFrame marco;
	public void configuracionVentana(){
		marco = new JFrame("Buscaminas");
		JButton boton = new JButton();
		
		boton.setIcon(new javax.swing.ImageIcon("imagenes/uno.jpg"));
		boton.setBounds(70,100,32,32);
		marco.add(boton);
		
		marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		marco.setSize(400,400);
		marco.setLayout(null);
		marco.setVisible(true);
		
	} // fin método
} // fin clase
