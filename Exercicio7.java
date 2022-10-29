/*7) Ler dois valores e imprimir uma das três mensagens a seguir:

‘Números iguais’, caso os números sejam iguais

‘Primeiro é maior’, caso o primeiro seja maior que o segundo;

‘Segundo maior’, caso o segundo seja maior que o primeiro.*/

package tarefa7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digte o primeiro numero");
		int numero1 = sc.nextInt();
		System.out.println("Digte o segundo numero");
		int numero2 = sc.nextInt();
		if (numero1 > numero2) {
			System.out.println("O Primeiro numero é maior");
		} else if (numero2 > numero1) {
			System.out.println("O Segundo numero é maior");
		} else {
			System.out.println("Numeros iguais");
			sc.close();
		}

	}
}
