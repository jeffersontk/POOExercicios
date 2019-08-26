package Exercicios;
/**
 * 2)Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
 *	correspondente em graus Celsius.
 */

import java.util.Scanner;

public class Ex002 {

	private static Scanner tecla = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		double temp_f, temp_c;
		//temp_f é a temperatura fahrenheit
		//temp_c é a temperatura celsius
		temp_f = 0;
		temp_c = 0;
		System.out.println("informe a temperatura em graus Fahrenheit: ");
		temp_f = tecla.nextDouble();
		temp_c = ((temp_f - 32)* 5)/9;
		System.out.println("A temperatura em graus celsius é: " + temp_c);
	}

}
