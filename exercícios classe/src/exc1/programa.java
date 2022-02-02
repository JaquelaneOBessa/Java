package exc1;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		 String nome, rua, produto;
		 int idade, cpf;	
	
		
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite sea rua: ");
		rua = sc.next();
		
		System.out.println("Digite sea idade: ");
		idade = sc.nextInt();
		
		System.out.println("Digite seu cpf: ");
		cpf = sc.nextInt();
		
		System.out.println("Digite o produto que deseja: ");
		produto = sc.next();
		
		Cliente cliente = new Cliente(nome, rua, produto, idade, cpf); 
		System.out.println(cliente.toString());
		cliente.comprar(produto);
		
	}

}
