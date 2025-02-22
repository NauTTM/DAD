package P03T04;

import java.awt.GridLayout;

import javax.swing.*;
public class ventanaP03T04 {
	JFrame marco;
	public void configuracionVentana(){
		marco = new JFrame("Buscaminas");
		JButton[][] boton = new JButton[7][7];
		
		marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		marco.setSize(400,400);
		//Layout
		marco.setLayout (new GridLayout (7,7));  //7x7 el Layout
		for(int x=0; x<7; x++) {
			for(int y=0; y<7; y++) {
				boton[x][y] = new JButton();
				boton[x][y].setIcon(new javax.swing.ImageIcon("imagenes/cuadrado.jpg"));
				marco.add(boton[x][y]);
			}
		}
		marco.setVisible(true);
		
	} // fin método
} // fin clase
