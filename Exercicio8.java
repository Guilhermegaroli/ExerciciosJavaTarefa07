/*8) Seja o seguinte algoritmo:
início
ler x
ler y
z <- (x*y) + 5
se z <= 0 então
resposta <- ‘A’
senão
se z <= 100 então
resposta <- ‘B’
senão
resposta <- ‘C’
fim_se
fim_se
escrever z, resposta
fim
Faça um teste de mesa e complete o quadro a seguir para os seguintes valores:*/

package tarefa7;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digte o valor de x");
		int x = sc.nextInt();
		System.out.println("Digte o valor de y");
		int y = sc.nextInt();
		int z = (x * y) + 5;
		if (z <= 0) {
			System.out.println("Resposta A");
		} else if (z <= 100) {
			System.out.println("Resposta B");
		} else {
			System.out.println("Resposta C");
			sc.close();

		}

	}

}
