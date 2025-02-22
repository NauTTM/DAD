package P09T04;

public class ProgramaQueCreaTresHilos extends ProgramaQueSeEjecutaComoHilo{

	ProgramaQueCreaTresHilos(int identificacion) {
		super(identificacion);
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) {
		ProgramaQueSeEjecutaComoHilo P1 = new ProgramaQueSeEjecutaComoHilo(1);
		P1.start();
		ProgramaQueSeEjecutaComoHilo P2 = new ProgramaQueSeEjecutaComoHilo(2);
		P2.start();
		ProgramaQueSeEjecutaComoHilo P3 = new ProgramaQueSeEjecutaComoHilo(3);
		P3.start();
		}//end main()
}
