package P04T04;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class ventanaP04T04 implements MouseListener {
	JFrame marco;
	JButton[][] boton = new JButton[7][7];
	public void configuracionVentana(){
		marco = new JFrame("Buscaminas");
		
		marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		marco.setSize(400,400);
		//Layout
		marco.setLayout (new GridLayout (7,7));  //7x7 el Layout
		for(int x=0; x<7; x++) {
			for(int y=0; y<7; y++) {
				boton[x][y] = new JButton();
				boton[x][y].setIcon(new javax.swing.ImageIcon("imagenes/cuadrado.jpg"));
				boton[x][y].addMouseListener(this);
				marco.add(boton[x][y]);
			}
		}
		marco.setVisible(true);
		
	} // fin método
	@Override
	public void mouseClicked(MouseEvent e) {

		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		JButton botonPulsado = (JButton) e.getSource();
		
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 7; y++) {
				if (boton[x][y] == botonPulsado) {
					if (e.getButton()==MouseEvent.BUTTON1){
						mainP04T04.botonIzquierdo(x, y);
						}
					else if(e.getButton()==MouseEvent.BUTTON3) {
						mainP04T04.botonDerecho(x, y);
					}
                    break;
                }
            }
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	public void ponerBandera(int fila, int columna) {
		boton[fila][columna].setIcon(new javax.swing.ImageIcon("imagenes/bandera.jpg"));
	}
	
	public void ponerInicial(int fila, int columna) {
		boton[fila][columna].setIcon(new javax.swing.ImageIcon("imagenes/cuadrado.jpg"));
	}
} // fin clase
