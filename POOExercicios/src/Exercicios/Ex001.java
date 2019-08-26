package Exercicios;
/**
 * 1) Escreva um programa para ler o raio de um círculo, calcular e escrever a sua área.
 */
import java.util.Scanner;

public class Ex001 {

	private static Scanner tecla;

	public static void main(String[] args) {
		tecla = new Scanner(System.in);
		
		double raio, area;
		raio = 0;
		area = 0;
		
		System.out.print("Digite o raio: ");
		raio = tecla.nextDouble();
		
		area = Math.PI *  Math.sqrt(raio);
		
		System.out.println("a area do raio é " + area);
		
	}

}
