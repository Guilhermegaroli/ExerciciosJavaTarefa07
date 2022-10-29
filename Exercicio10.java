/*10) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão sempre diferentes 
 * entre si, bem como as das mulheres). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das 
 * idades do homem mais novo com a mulher mais velha.*/

package tarefa7;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade do homem mais velho");
		int idadehomemmaisvelho = sc.nextInt();
		System.out.println("Digite a idade do homem mais novo");
		int idadehomemmaisnovo = sc.nextInt();
		System.out.println("Digite a idade da mulher mais velha");
		int idademulhermaisvelha = sc.nextInt();
		System.out.println("Digite a idade da mulher mais nova");
		int idademulhermaisnova = sc.nextInt();
		int soma = idadehomemmaisvelho + idademulhermaisnova;
		int soma1 = idadehomemmaisnovo + idademulhermaisvelha;
		if (idadehomemmaisvelho > idadehomemmaisnovo && (idademulhermaisnova < idademulhermaisvelha)) {
			System.out.println("A soma da idade do homem mais velho e a mulher mais nova é: " + soma);

			System.out.println("A soma da idade do homem mais novo e a mulher mais velha é: " + soma1);
		} else if ((idadehomemmaisvelho <= idadehomemmaisnovo) && (idademulhermaisnova <= idademulhermaisvelha)) {
			System.out.printf("Idades iguais nÃ£o serÃ£o mostrados");
			sc.close();
		}

	}

}
