/*5) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo. 
 * OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.*/

package tarefa7;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o valor do lado A: ");
		int ladoA = sc.nextInt();
		System.out.print("Informe o valor do lado B: ");
		int ladoB = sc.nextInt();
		System.out.print("Informe o valor do lado C: ");
		int ladoC = sc.nextInt();
		if (ladoA >= ladoB + ladoC || ladoB >= ladoA + ladoC || ladoC >= ladoA + ladoB) {
			System.out.print("Não forma um triangulo");
		} else {
			System.out.print("Forma um triangulo ");
			sc.close();
		}

	}

}