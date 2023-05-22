import java.util.Scanner;

public class maiorEMedia {
    /*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // interação com usuario

        //variaveis
        int numero;
        int count = 0; // contador
        int maiorNumero = 0;
        int soma=0;

        //laço de repetição doWhile
        do {//loop
            System.out.println("numero: ");
            numero = scan.nextInt();
            count = count +1;// somar +1 ao contador
            soma = soma+numero;// somar os numeros inseridos para tirar a media no final

            if (numero > maiorNumero) maiorNumero = numero; /* o maior numero informado ganha o valor
            da variavel numero*/

        }while (count <5);// condição: quando o contador for menos que 5, pare o programa!

        System.out.println("O maior numero é: "+ maiorNumero);//imprime o maior numero
        System.out.println("A Média é: "+ (soma/5));//imprime a média dos numeros


    }
}
