//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package exc1;

import java.util.Scanner;

public class Exc1Decisao {

	public static void main(String[] args) {

		int n1, n2, n3;
		
		Scanner sc = new Scanner(System.in);
								
		System.out.println("Escreva 1� n�mero: ");
		n1 = sc.nextInt();
		System.out.println("Escreva 2� n�mero: ");
		n2 = sc.nextInt();
		System.out.println("Escreva 3� n�mero: ");
		n3 = sc.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("Esse � o maior n�mero: "+n1);
			
			
			
		}
		if(n2>n1 && n2>n3) {
			System.out.println("Esse � o maior n�mero: "+n2);
			
			
			
		}
		if(n3>n2 && n3>n1) {
			System.out.println("Esse � o maior n�mero: "+n3);
			
			
			
		}
	}

}
