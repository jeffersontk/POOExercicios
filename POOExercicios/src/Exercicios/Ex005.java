package Exercicios;
/**
 * Seleção
 * 3) Escreva um programa para ler as notas das duas avaliações de um aluno no semestre, calcular e
 * escrever a média semestral e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se
 * o aluno foi aprovado (considere 6.0 a média mínima para aprovação).
 */
import java.util.Scanner;

public class Ex005 {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1, nota2, media;
		nota1 = 0; 
		nota2 = 0; 
		media = 0;
		System.out.println("Digite a nota da primeira avaliação: ");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a nota da sengunda avaliação");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 6) {
			System.out.println("PARABENS! voce foi aprovado");
		}
	}

}
