package Exercicios;
import java.util.Scanner;

/**
 * 4)Escreva um programa para calcular e imprimir o número de lâmpadas necessárias para iluminar um
 * determinado cômodo de uma residência. Dados de entrada: a potência da lâmpada utilizada (em
 * watts), as dimensões (largura e comprimento, em metros) do cômodo. Considere que a potência
 * necessária é de 18 watts por metro quadrado.
 * 
 * @author jefferson
 *
 */

public class Ex004 {
	
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		double pot_lamp, larg_com, comp_com, area_com, pot_total;
		int num_lamp;
		
		/**
		 * {pot_lamp: potencia da lampada
		 *larg_com: largura do comodo
		 *comp_com: comprimento do comodo
		 *area_com: area do comodo
		 *pot_total: potencia total
		 *num_lamp: numero de lampadas
		 */
		System.out.println("Qual a potencia da lampada (em watts)? ");
		pot_lamp = entrada.nextDouble();
		System.out.println("'Qual a largura do comodo (em metros)? ");
		larg_com = entrada.nextDouble();
		System.out.println("'Qual o comprimento do comodo (em metros)? ");
		comp_com = entrada.nextDouble();
		
		area_com = larg_com * comp_com;
		
		pot_total = area_com * 18;
		
		num_lamp = (int) Math.round(pot_total/ pot_lamp);
	
		System.out.println("Numero de lampadas necessarias para iluminar esse comodo: " + num_lamp);
		
	}

}
