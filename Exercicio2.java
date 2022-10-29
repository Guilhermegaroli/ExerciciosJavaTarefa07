/*2) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.*/

package tarefa7;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero");
		int numero1 = sc.nextInt();

		System.out.println("Digite o segundo numero");
		int numero2 = sc.nextInt();

		System.out.println("Digite o terceiro numero");
		int numero3 = sc.nextInt();

		if (numero1 > numero2) {
			System.out.println("O numero maior digitado é: " + numero1);

		} else if (numero2 > numero3) {
			System.out.println("O numero maior digitado é: " + numero2);

		} else if (numero3 > numero2) {
			System.out.println("O numero maior digitado é: " + numero3);

		} else if (numero2 > numero1) {
			System.out.println("O numero maior digitado é: " + numero2);

			sc.close();
		}

	}

}
