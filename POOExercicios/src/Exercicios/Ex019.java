/**
 * Matriz questão 3 
 */
package Exercicios;

public class Ex019 {
	static int[][]  d = new int[10][10];
	static int i,j,x,teste;
	
public static void Matrizes() {
		
		for (i=0; i<= 3;i++ ){
			for (j=0; j<= 3; j++) {
				System.out.println("Digite um numero inteiro para a matriz D3X3: ");
			d[i][j] = Entrada.tcl.nextInt();
			}
		}
		
		for (i=0; i<= 3;i++ ){
			for (j=0; j<= 3; j++) {
				System.out.println("i["+ i +"]" + " j["+ j +"] ="+d[i][j] );
			}
		}
		
		System.out.println("Digite um numero inteiro para verificar se existe na matriz D: ");
		x = Entrada.tcl.nextInt();
		for (i=0; i<= 3;i++ ){
			for (j=0; j<= 3; j++) {
				if (x == d[i][j]) {
				System.out.println("i["+ i +"]" + " j["+ j +"] ="+d[i][j] );
				teste = 1;
				}
			}
		}
		
		if (teste == 1) {
			System.out.println("Este numero existe na matriz D");
		}else {
			System.out.println("Este numero nao existe na matriz D");
		}
				

		
		
		

}


	public static void main(String[] args) {
		Matrizes();

	}

}
