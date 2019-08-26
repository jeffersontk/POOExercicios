/**
 * seleção questão 14
 */
package Exercicios;

public class Ex009 {
	
	public static void main(String[] args) {
		
		int gols_g, gols_i;
		gols_g = 0;
		gols_i = 0;
		
		System.out.println("Gols do Gremio: ");
		gols_g = Entrada.tcl.nextInt();
		System.out.println("Gols do Inter: ");
		gols_i = Entrada.tcl.nextInt();
		
		if(gols_g > gols_i) {
			System.out.println("GREMIO!!!");
		}else {
			if(gols_i > gols_g) {
				System.out.println("INTER!!!");
			}else {
				System.out.println("Empate...");
			}
		}
		
	}

}
