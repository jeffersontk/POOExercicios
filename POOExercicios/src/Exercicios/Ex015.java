/**
 * repetição ou seleção Exercicio 13
 */

package Exercicios;

public class Ex015 {
	static float  altura, maior;
	static String  nome, nome_m;
	static int  num, sair;
	
	
public static void maiorMoca() {
		sair = 0;
		while (sair != 1) { 
			if(num > 0) {
				System.out.println("Deseja sair (digite 1): ");
				sair = Entrada.tcl.nextInt();
			}
				if (sair == 1) {					
					System.out.println("Total de mocas no concurso: "+num);
					System.out.println("Moca mais alta: "+ nome_m);
					System.out.println("Altura: "+ maior);
				
				}else {
					
				System.out.println("Nome: ");
				nome= Entrada.tcl.next();
					
				System.out.println("Altura: ");
				altura = Entrada.tcl.nextFloat();
				
				num = num + 1;
				if (altura > maior) { 
					maior = altura;
					nome_m = nome;
				}	
	
			}
		}
	}
	public static void main(String[] args) {
		maiorMoca();

	}

}
