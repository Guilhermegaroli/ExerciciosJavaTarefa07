/* 11) Uma fruteira está vendendo frutas com a seguinte tabela de preços: morango r$2,50 por kg até 5kg, acima de 5kg r$2,20
 *maça r$ 1,80 por kg até 5kg, acima de 5kg r$ 1,50 por kg */
/*Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre 
este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor
a ser pago pelo cliente.*/

package tarefa7;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		double valordamaca, valordomorango;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de kg do morango");
		double quantidadedomorango = sc.nextDouble();

		System.out.println("Digite a quantidade da maçã: ");
		double quantidadedamaca = sc.nextDouble();
		double quantidadedefrutas = quantidadedomorango + quantidadedamaca;

		if (quantidadedomorango <= 5) {
			valordomorango = 2.50 * quantidadedomorango;
		} else {
			valordomorango = 2.20 * quantidadedomorango;
		}
		if (quantidadedamaca <= 5) {
			valordamaca = 1.80 * quantidadedamaca;
		} else {
			valordamaca = 1.50 * quantidadedamaca;
		}
		double valortotalpago = valordomorango + valordamaca;
		System.out.println("O valor total a ser pago é: R$" + valortotalpago
				+ " e a quantidade total de kg de frutas foi: " + quantidadedefrutas + ".");
		sc.close();
	}

}
