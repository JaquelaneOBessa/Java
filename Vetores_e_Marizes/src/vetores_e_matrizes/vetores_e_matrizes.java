//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o 
//escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.

package vetores_e_matrizes;

import java.util.Scanner;

public class vetores_e_matrizes {

	public static void main(String[] args) {
		
	Scanner numero=new Scanner(System.in);
	
		int[] pontos=new int [5];
		int maiorponto=0;
		
		for (int i=0; i<5; i++) {
			System.out.println("Digite o" + (i+1)+ " � valor: ");
			
			pontos[i]=numero.nextInt();
			System.out.println("Valor digitado: "+ pontos[i]);
			
			if(pontos[i]>maiorponto) {
			maiorponto=pontos[i];
			}
		}
			System.out.println("O maior ponto �: "+maiorponto);
			
			
			
			
			
			
			
			
			
			}		
			
	
	}

