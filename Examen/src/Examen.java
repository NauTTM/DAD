import java.util.Scanner;
public class Examen{
 static char[][] matrizMinas = {{'.','.','.','.','.','.','.'},
 {'.','.','.','.','.','.','.'},
 {'.','#','.','.','.','.','.'},
 {'.','#','.','.','#','.','.'},
 {'.','#','#','#','#','.','.'},
 {'.','.','.','.','.','.','.'},
 {'.','.','.','.','.','.','.'}};
 static Scanner input;
 public static void main( String[] args ){
 int fila;
 int columna;
 System.out.println("La matriz matrizMinas original es:");
 mostrarArray(matrizMinas);
 input = new Scanner( System.in );
 System.out.print( "Introduzca la fila (0-6): " );
 fila = input.nextInt();
 System.out.print( "Introduzca la columna (0-6): " );
 columna = input.nextInt();
 procesarMatrizMinas(fila, columna);
 System.out.println("La matriz mapaMinas procesada es:");
 mostrarArray(matrizMinas);
 input.close();
 } // end method main

 public static void mostrarArray(char[][] array){
 for (int row=0; row < array.length; row++){
 for (int column = 0; column < array[row].length;column++){
 System.out.printf("%c ",array[row][column]);
 } //fin for interno
 System.out.println();
 } //fin for externo
 } // fin mostrarArray()

 public static int contarMinas(int fila, int columna){
 int numeroMinas=0;
 int dimensionFilas=matrizMinas.length-1;
 int dimensionColumnas=matrizMinas[0].length-1;
 if ((columna-1>=0)&&(matrizMinas[fila][columna-1]=='#'))
 numeroMinas++;
 if ((fila+1<=dimensionFilas)&&(matrizMinas[fila+1][columna]=='#'))
 numeroMinas++;
 if ((columna+1<=dimensionColumnas)&&(matrizMinas[fila][columna+1]=='#'))
 numeroMinas++;
 if ((fila-1>=0)&&(matrizMinas[fila-1][columna]=='#'))
 numeroMinas++;
 return numeroMinas;
 }// fin metodo contarMinas()

 public static void procesarMatrizMinas(int fila,int columna){
 int numeroMinasAdyacentes=contarMinas(fila, columna);
 if (numeroMinasAdyacentes!=0) matrizMinas[fila][columna]=(Integer.toString(numeroMinasAdyacentes)).charAt(0);
 if (numeroMinasAdyacentes==0) {
 matrizMinas[fila][columna]='0';
 System.out.println("Se pone 0 en (columna, fila) en el orden " + columna + fila);
 if (columna-1>=0) {
 if (matrizMinas[fila][columna-1]=='.') procesarMatrizMinas(fila,columna-1);
 }// end if
 if (fila+1<=6) {
 if (matrizMinas[fila+1][columna]=='.') procesarMatrizMinas(fila+1,columna);
 }// end if
 if (columna+1<=6) {
 if (matrizMinas[fila][columna+1]=='.') procesarMatrizMinas(fila,columna+1);
 }// end if
 if (fila-1>=0) {
 if (matrizMinas[fila-1][columna]=='.') procesarMatrizMinas(fila-1,columna);
 }// end if
 }// end if

 return;
 }// fin metodo procesaMapaMinas()
} // fin clase
