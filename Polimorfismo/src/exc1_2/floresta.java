package exc1_2;

import java.util.Scanner;

public class floresta {

	public static void main(String[] args) {
		
		 String nome;
		 int idade;
		 
		 Scanner cs = new Scanner(System.in);
		 
		 Animal animais = new Animal();
		 Cavalo cavalo = new Cavalo();
		 Preguica preguica = new Preguica();
		 Cachorro cachorro = new Cachorro();
		 
		 System.out.println("Nome do cachorro: ");
		 nome = cs.next();
		 cachorro.setNome(nome);
		 
		 System.out.println("Idade do cachorro: ");
		 idade = cs.nextInt();
		 cachorro.setIdade(idade);
		 animais.fazerSom(cachorro);
		 cachorro.correr();
		 
		//cavalo
		 System.out.println("Nome do cavalo: ");
		 nome = cs.next();
		 cavalo.setNome(nome);
		 
		 System.out.println("Idade do cavalo: ");
		 idade = cs.nextInt();
		 cavalo.setIdade(idade);
		 animais.fazerSom(cavalo);
		 cavalo.correr();
		 
		 //preguiça
		 System.out.println("Nome do priguiça: ");
		 nome = cs.next();
		 preguica.setNome(nome);
		 
		 System.out.println("Idade do preguica: ");
		 idade = cs.nextInt();
		 preguica.setIdade(idade);
		 animais.fazerSom(preguica);
		 preguica.escalar();
		
		
	}

}
