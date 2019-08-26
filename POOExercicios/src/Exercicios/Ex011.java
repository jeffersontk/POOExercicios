/**
 * Seleção questão 1 
 */
package Exercicios;

public class Ex011 {
	static int cod;
	
	
	public static void codigo() {
		System.out.println("Qual o codigo do produto? ");
		cod = Entrada.tcl.nextInt();
		if (cod == 1 ) {
			System.out.println("Sul");
		}else if (cod == 2 ) {
			System.out.println("Norte");
		}else if (cod == 3) {
				System.out.println("Leste");
		}else if (cod == 4) {
			System.out.println("Oeste");
		}else if ((cod == 5) || (cod == 6)){
			System.out.println("Nordeste");
		}else if ((cod == 7) || (cod == 8) || (cod == 9)) {
			System.out.println("Sudeste");
		}else if (cod == 10) {
			System.out.println("Centro-Oeste");
		}else if (cod == 11) {
			System.out.println("Noroeste");
		}else {
			System.out.println("Importado");
		}
			
	}

	public static void main(String[] args) {
		codigo();

	}
}
