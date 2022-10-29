//1) Ler um valor e escrever se é positivo, negativo ou zero.//

package tarefa7;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor");
		int valor = sc.nextInt();

		if (valor > 0) {
			System.out.println("O valor digitado é positivo");

		} else if (valor == 0) {
			System.out.println("O valor digitado é zero");

		} else {

			System.out.println("O valor digitado é negativo");

			sc.close();

		}

	}

}