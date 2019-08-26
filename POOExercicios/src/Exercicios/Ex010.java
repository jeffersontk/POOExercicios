/**
 * seleção  questão 17
 */
package Exercicios;

public class Ex010 {
	public static void main(String[] args) {
		
		int a, b, op;
		a	= 0;
		b 	= 0;
		op  = 0;
		
		System.out.println("informe um valor: ");
		a = Entrada.tcl.nextInt();
		System.out.println("informe outro valor: ");
		b = Entrada.tcl.nextInt();
		System.out.println("1 Adição");
		System.out.println("2 subtração");
		System.out.println("3 Divisão");
		System.out.println("4 Multiplicação");
		op = Entrada.tcl.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Soma " + (a + b));
			break;

		case 2:
			System.out.println("Subitração " + (a - b));
			
			break;
		case 3:
			System.out.println("Divisão " + (a / b));
			
			break;
		case 4:
			System.out.println("Multiplicação " + (a * b));
			
			break;
		default:
			System.out.println("opção invalida");
			break;
		}
	}
}
