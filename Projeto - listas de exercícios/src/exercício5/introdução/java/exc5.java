/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

package exercício5.introdução.java;

import java.util.Scanner;

public class exc5 {

	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite a 1° nota: ");
		n1 = dados.nextDouble();
		System.out.println("Digite a 2° nota: ");
		n2 = dados.nextDouble();
		System.out.println("Digite a 3° nota: ");
		n3 = dados.nextDouble();
		
		media = (n1*2+n2*3+n3*5)/(2+3+5);
		System.out.println("A média ponderada é: "+media);
		dados.close();
		
		

	}

}
