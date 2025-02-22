package P11T02;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;



public class P11T02Ventana extends JFrame implements KeyListener{
		JTextArea areaDeTextoSuperior;
		JTextArea areaDeTextoInferior;
		DatagramSocket socket;
		DatagramPacket packet;
		String name;
		JScrollPane areaDeTextoSuperiorConScroll;
		
		public P11T02Ventana(DatagramSocket socket, DatagramPacket packet, String nombre) {
			this.socket = socket;
			this.packet = packet;
			this.name = nombre;
		}
		
		public void configuracionVentanaChat() {
			 this.setTitle("Chat de la practica 10 de DAD");
			 this.setSize(700,700);
			 this.setLayout(new FlowLayout());
			 
			 areaDeTextoSuperior = new JTextArea();
			 this.areaDeTextoSuperiorConScroll = new JScrollPane(areaDeTextoSuperior);
			 this.areaDeTextoSuperiorConScroll.setPreferredSize(new Dimension(650,600));
			 DefaultCaret caret = (DefaultCaret)areaDeTextoSuperior.getCaret();
			 caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
			 
			 
			 areaDeTextoSuperior.setLineWrap(true);
			 areaDeTextoSuperior.setEditable(false);
			 areaDeTextoSuperior.setBackground(Color.LIGHT_GRAY);
			 
			 areaDeTextoInferior = new JTextArea();
			 areaDeTextoInferior.setPreferredSize(new Dimension (650, 20));
			 areaDeTextoInferior.setBackground(Color.PINK);
			 areaDeTextoInferior.setLineWrap(true);
			 
			 this.add(areaDeTextoSuperiorConScroll);
			 this.add(areaDeTextoInferior);
			 areaDeTextoInferior.addKeyListener(this);
			 this.setVisible(true);

		}
		

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void keyPressed(KeyEvent pulsacion) {
				try {
					if(pulsacion.getKeyCode() == KeyEvent.VK_ENTER) {
						String mensaje = areaDeTextoInferior.getText();
						byte[] datos = (name + ": " + mensaje).getBytes();
						packet.setData(datos);
						socket.send(packet);
						String mensajeA = new String(packet.getData(), 0, packet.getLength());
						//System.out.println(mensaje);
						areaDeTextoSuperior.append(mensajeA +  "\n");
						areaDeTextoInferior.setText(null);
						pulsacion.consume();
					}
				}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
		}
}