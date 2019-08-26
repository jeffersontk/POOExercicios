/**
 * repetição ou seleção Exercicio 1
 */
package Exercicios;

public class Ex014 {
	static float  a, b, c;
	static float divisao;
	
public static void Divisao() {
		
		System.out.println("Digite um valor inteiro: ");
			a= Entrada.tcl.nextFloat();
		do {
		System.out.println("Digite outro valor inteiro: ");
			b= Entrada.tcl.nextFloat();
		System.out.println("para sair aperte 0: ");
			c= Entrada.tcl.nextFloat();
			
		}while( c != 0);
		
		divisao = a/b;
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
		
		System.out.println("A divisao do primeiro valor pelo segundo eh: "+ divisao);
	}
		
	public static void main(String[] args) {
		Divisao();

	}
}
