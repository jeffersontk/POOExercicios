/**
 * repetição ou seleção Exercicio 3
 */
package Exercicios;

public class Ex013 {

	static float  a, b, c;
	static float divisao;
	
	
public static void Divisao() {
		
		System.out.println("Digite um valor inteiro: ");
			a= Entrada.tcl.nextFloat();
			c = 1;
		while ( c != 0){
		System.out.println("Digite outro valor inteiro: ");
			b= Entrada.tcl.nextFloat();
			
		System.out.println("para sair aperte 0: ");
			c= Entrada.tcl.nextFloat();
					
		}
		
		divisao = a/b;
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
		
		System.out.println("A divisao do primeiro valor pelo segundo eh: "+ divisao);
	}

	public static void main(String[] args) {
		Divisao();

	}


}
