package CarangoVelho;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //A concessionaria de veiculos "Carango velho" esta vendendo os seus veiculos com desconto.
        //Faca um algoritimo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de varios carros.
        //O desconto devera ser calculado de acordo com o ano do veiculo.
        //Ate o ano 2000 -> 12% e acima de 2000 -> 7%. 
        //O sistema devera perguntar se dejsea continuar a calcular os desconto até que a resposta seja "Nao"
        //Informar total de carros com o ano te 2000 e o total de carros no geral

        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        char desejaRepetir = 'S';
        Scanner leitor = new Scanner(System.in);
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;

        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;

        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            System.out.println("Digite o ano de fabricacao do veiculo :");
            anoFabricacao = leitor.nextInt();

            System.out.println("Digite o valor do veiculo :");
            valorCarro = leitor.nextFloat();

            if (anoFabricacao <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;

            valorDesconto = valorCarro * porcentagemDesconto;
            valorPagar = valorCarro - valorDesconto;

            System.out.println("O valor do desconto foi de: " + valorDesconto);
            System.out.println("O valor que deve ser pago e: " + valorPagar);

            System.out.println("Deseja fazer mais cadastros? S - SIm / N - Nao");
            desejaRepetir = leitor.next().charAt(0);
        }

        System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
    }
}
