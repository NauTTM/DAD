package P09T05;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Hilo extends Thread {
	int port;
	
	public Hilo(int port) {
		this.port = port;
	}
	public void run() {
		try {
			DatagramSocket socket = new DatagramSocket(port);
			byte[] almacen = new byte[1024];
			while(true) {
				DatagramPacket paqueteEnP=new DatagramPacket(almacen, almacen.length);
				socket.receive(paqueteEnP);
				String mensajeB = new String(paqueteEnP.getData(), 0, paqueteEnP.getLength());
				String message = String.format("mensaje recibido;\n %s", mensajeB);
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JOptionPane.showMessageDialog(null, message);
                    }
                });
			}
		}catch(Exception e){
			
		}
	}
	
}
