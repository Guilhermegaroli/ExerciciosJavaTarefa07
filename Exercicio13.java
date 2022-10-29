/*13) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total
 *  (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
- Se quantidade <= 5 o desconto será de 2%
- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
- Se quantidade > 10 o desconto será de 5%*/

package tarefa7;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		double valorfinal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o produto");
		String produto = sc.nextLine();
		System.out.println("Digite a quantidade do produto");
		double quantidadedoproduto = sc.nextDouble();
		System.out.println("Digite o valor do produto");
		double custodoproduto = sc.nextDouble();

		if (quantidadedoproduto <= 5) {
			valorfinal = quantidadedoproduto * (custodoproduto - (custodoproduto * 2 / 100));
			System.out.println(" O valor total do(a) " + produto + " é: " + valorfinal);
		} else if (quantidadedoproduto > 5 && (quantidadedoproduto <= 10)) {
			valorfinal = quantidadedoproduto * (custodoproduto - (custodoproduto * 3 / 100));
			System.out.println(" O valor total do(a) " + produto + " é: " + valorfinal);
		} else if (quantidadedoproduto > 10) {
			valorfinal = quantidadedoproduto * (custodoproduto - (custodoproduto * 5 / 100));
			System.out.println(" O valor total do(a) " + produto + " é: " + valorfinal);

			sc.close();
		}

	}

}
