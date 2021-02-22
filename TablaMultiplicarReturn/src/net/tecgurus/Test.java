/**
 * 
 */
package net.tecgurus;

/**
 * @author Cesar
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Tabla de multiplicar del 7");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("7 * " + i + " = " + multiplicar(7, i));
		}
	}
	
	public static int multiplicar(int a, int b){
		return a * b;
	}
}