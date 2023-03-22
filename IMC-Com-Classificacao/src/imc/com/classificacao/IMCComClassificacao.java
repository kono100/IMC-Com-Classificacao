package imc.com.classificacao;

/*
5) Altere o algoritmo feito no exercício anterior para exibir a descrição dos
 valores de acordo com a tabela abaixo:
 */

import java.util.Scanner;

public class IMCComClassificacao {

    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Qual eh seu peso? ");

        peso = sc.nextDouble();

        System.out.print("Qual a sua altura? ");

        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("\nSeu IMC eh : %.2f\n\n", imc);

        if (imc <= 18.5) {

            System.out.printf("voce esta abaixo do Peso normal\n");

        } else if (imc <= 24.9) {

            System.out.printf("voce esta no Peso normal\n");

        } else if (imc <= 29.9) {

            System.out.printf("voce esta em excesso de Peso\n");

        } else if (imc <= 34.9) {

            System.out.printf("voce esta em Obesidade|\n");

        } else if (imc <= 39.9) {

            System.out.printf("voce esta em Obesidade||\n");

        } else if (imc >= 40) {

            System.out.printf("voce esta em Obesidade|||\n");

        }

        System.out.printf("\n");

    }

}

}
