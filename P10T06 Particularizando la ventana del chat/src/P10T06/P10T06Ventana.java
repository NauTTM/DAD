package P10T06;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;


public class P10T06Ventana extends JFrame implements KeyListener{
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
		
		 public void escribirEnAreaDeTextoSuperior(String String){
			 areaDeTextoSuperior.append(String + "\n");
			 areaDeTextoInferior.addKeyListener(this);

		 }

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void keyPressed(KeyEvent pulsacion) {
			if(pulsacion.getKeyCode() == KeyEvent.VK_ENTER) {
				String mensaje = areaDeTextoInferior.getText();
				System.out.println(mensaje);
				areaDeTextoInferior.setText(null);
				pulsacion.consume();
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		
		

}
