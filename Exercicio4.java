/*4) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.*/

package tarefa7;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero :");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo numero :");
		int numero2 = sc.nextInt();
		System.out.println("Digite o terceiro numero :");
		int numero3 = sc.nextInt();

		if ((numero1 < numero2) && (numero2 < numero3)) {
			System.out.println(
					"Os numeros digitados na ordem crescente são: " + numero1 + " , " + numero2 + " e " + numero3);
		} else if ((numero2 < numero3) && (numero3 < numero1)) {
			System.out.println(
					"Os numeros digitados na ordem crescente são: " + numero2 + " , " + numero3 + " e " + numero1);
		} else if ((numero3 < numero1) && (numero1 < numero2)) {
			System.out.println(
					"Os numeros digitados na ordem crescente são: " + numero3 + " , " + numero1 + " e " + numero2);
		} else if ((numero3 < numero2) && (numero2 < numero1)) {
			System.out.println(
					"Os numeros digitados na ordem crescente são: " + numero3 + " , " + numero2 + " e " + numero1);
		} else if ((numero1 < numero3) && (numero3 < numero2)) {
			System.out.println(
					"Os numeros digitados na ordem crescente são: " + numero3 + " , " + numero2 + " e " + numero1);
			sc.close();
		}
	}

}