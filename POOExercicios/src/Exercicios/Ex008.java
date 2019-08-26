/**
 * seleção questão 13
 */
package Exercicios;

import java.util.Scanner;

public class Ex008 {

	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();
		if(num % 2 == 0) {
			System.out.println("o numero é par.");
		}else {
			System.out.println("o numero é impar");
		}
	}

}
