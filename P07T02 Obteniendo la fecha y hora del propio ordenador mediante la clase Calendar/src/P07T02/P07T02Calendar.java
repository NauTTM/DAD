package P07T02;

import java.util.Calendar;
import java.util.Date;

public class P07T02Calendar {
	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		Date fechaActual = calendario.getTime();
		System.out.println("Hora del sistema:"+fechaActual);
	}
}