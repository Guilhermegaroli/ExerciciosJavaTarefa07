/*15) Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um dos 
 seguintes requisitos deve ser satisfeito:
- Ter no mínimo 65 anos de idade.
- Ter trabalhado no mínimo 30 anos.
- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano de seu nascimento e o ano de seu 
ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou
'Não requerer'. */

package tarefa7;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite nome do solicitante");
		String solicitante = sc.nextLine();
		System.out.println("Digite o ano de nascimento do solicitante");
		int anodenascimento = sc.nextInt();
		System.out.println("Digite o ano atual.");
		int anoatual = sc.nextInt();
		int idade = anoatual - anodenascimento;

		System.out.println("Digite o ano de admissão no trabalho");
		int anodeadmissao = sc.nextInt();

		int tempodetrabalho = anoatual - anodeadmissao;

		if (idade >= 65) {

			System.out.println("O solicitante " + solicitante + "," + "pode se aposentar.");

		} else if (tempodetrabalho >= 30) {
			System.out.println("O solicitante " + solicitante + "," + "pode se aposentar.");
		} else if (idade >= 60 && tempodetrabalho >= 25) {
			System.out.println("O solicitante " + solicitante + "," + "pode se aposentar.");

		} else {
			System.out.println("Não requerer.");
			sc.close();
		}

	}

}
