package Exercicios;
/**
 * seleção questão 7
 */

import java.util.Scanner;

public class Ex006 {

	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		double x, y;
		x = 0;
		y = 0;
		
		System.out.println("digite um valor: ");
		x = entrada.nextDouble();
		System.out.println("digite outro valor: ");
		y = entrada.nextDouble();
		
		if(x > y) {
			System.out.println("o maior é: " + x);
		}else {
			System.out.println("o maior é: " + y);
		}
		
	}

}
