/**
 * repetição ou/e seleção questão 9
 */
package Exercicios;

public class Ex017 {
	static float  nota1, nota2, media;
	static int resp, cont;
	
public static void QtdAlunosAprovados() {
		
		do {
			System.out.println("Digite a nota da 1a avaliacao: ");
			nota1= Entrada.tcl.nextFloat();
			
			System.out.println("Digite a nota da 2a avaliacao: ");
			nota2= Entrada.tcl.nextFloat();
			
			media = (nota1 + nota2) / 2;
			System.out.println("A media do aluno eh: "+ media);
			
			if (media >= 6.0) {
				cont = cont + 1;
			}			
			
			System.out.println("Calcular a media de outro aluno? 1.Sim 2.Nao ");
			resp= Entrada.tcl.nextInt();
			
		}while(resp == 1);
		System.out.println("Quantidade de alunos aprovados: "+ cont);
	}

	public static void main(String[] args) {
		QtdAlunosAprovados();

	}


}
