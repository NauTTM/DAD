package P02T03a;

public class PasoValorVariable {
	
	public static void main(String[] args){
		int a=2;
		cuadrado(a);
		System.out.println("El valor de la variable a al final del metodo main() es "+a);
	}
	public static void cuadrado(int a){
		a=a*a;
		System.out.println("El valor de la variable a al final del metodo cuadrado() es "+a);
		return;
	}
}
