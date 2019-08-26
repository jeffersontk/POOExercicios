package Exercicios;

import java.util.Scanner;
public class Ex003 {
	private static Scanner tecla = new Scanner(System.in); 

	public static void main(String[] args) {			
			double temp_f, temp_c;
			//temp_f é a temperatura fahrenheit
			//temp_c é a temperatura celsius
			temp_f = 0;
			temp_c = 0;
			System.out.println("informe a temperatura em graus celsius: ");
			temp_c = tecla.nextDouble();
			temp_f = (9*temp_c + 160 )/5;
			System.out.println("A temperatura em graus Fahrenheit é: " + temp_f);
		}

}
