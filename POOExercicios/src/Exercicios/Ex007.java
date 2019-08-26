/**
 * seleção questão 11
 */
package Exercicios;
import java.util.Scanner;

public class Ex007 {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int senha;
		senha = 0;
		System.out.println("Digite a senha(quatro digitos: ");
		senha = entrada.nextInt();
		
		if(senha == 1234) {
			System.out.println("Acesso Permitido!");
		}else {
			System.out.println("Acesso Negado..");
		}
	}

}
