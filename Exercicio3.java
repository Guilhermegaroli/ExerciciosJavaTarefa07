/*3) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.*/

package tarefa7;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero");
		int numero1 = sc.nextInt();

		System.out.println("Digite o segundo numero");
		int numero2 = sc.nextInt();

		System.out.println("Digite o terceiro numero");
		int numero3 = sc.nextInt();

		if (numero3 < numero1 && (numero1 < numero2)) {
			System.out.println(numero1+numero2);
		}

		if (numero2 < numero1 && (numero1 < numero3)) {
			System.out.println(numero1+numero3);

		} else {
			System.out.println(numero2+numero3);
			sc.close();

		}

	}

}
