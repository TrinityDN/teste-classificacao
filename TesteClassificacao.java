package Continue;

import java.util.Scanner;

public class TesteClassificacao {
	
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		Funcionario objeto1 = new Funcionario();
		
		System.out.println("Digite seu nome:");
		objeto1.nome = in.nextLine();
		System.out.println("Digite a sua idade:");
		objeto1.idade = in.nextInt();
		
		System.out.println("Nome: " + objeto1.nome);
		System.out.println("Idade: " + objeto1.idade);
		
		
		for(int x = 0; x > objeto1.idade; x++) {
			
			if(objeto1.idade < 50) {
				continue;
			}
			System.out.println("Você tem direito a PDV!");
		}
	}
}
