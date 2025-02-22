package P09T04;

public class ProgramaQueSeEjecutaComoHilo extends Thread{
	int identificacion;
	private int identificacionHilo;
	
	ProgramaQueSeEjecutaComoHilo(int identificacion){
		this.identificacionHilo=identificacion;
	}
	
	public void run() {
		int i;
		for (i=1;i<6;i++) {
			System.out.println("Hilo "+identificacionHilo+" en la iteración del bucle "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
