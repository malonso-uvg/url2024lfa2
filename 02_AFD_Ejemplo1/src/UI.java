/**
 * 
 */
package src;

import java.util.Scanner;

/**
 * 
 */
public class UI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Ingrese una cadena");
		
		Scanner in = new Scanner(System.in);
		
		if (SyntaxAnalyzer.stringIsAccepted(in.nextLine() ) == SyntaxAnalyzer.ACCEPTED) {
			System.out.println("La cadena fue aceptada");
		} else {
			System.out.println("Ocurrio un error");
		}
		

	}

}
