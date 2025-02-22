package P03T01;

import javax.swing.*;
public class VentanaP03T01 {
	JFrame marco;
	public void configuracionVentana(){
		marco = new JFrame("Buscaminas");
		marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		marco.setSize(500,500);
		marco.setLayout(null);
		marco.setVisible(true);
	} // fin método
} // fin clase