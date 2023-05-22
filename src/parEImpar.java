import java.util.Scanner;

public class parEImpar {
    /*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // interação com usuário

        //variaveis
        int quantNumeros;
        int numero;
        int quantPares=0,quantImpares =0;
        int count = 0;// contador

        System.out.println("Quantos numeros devem ser digitados? ");
        quantNumeros = scan.nextInt(); // digite a quantidade de numeros

        do {//loop
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();

            if (numero %2 == 0) quantPares++;// se o numero for divisível por 2 entao é par
            else quantImpares++;// se nao, é impar

            count++; // acrescentar +1 ao contador

        }while (count < quantNumeros); // condição: quando o contador for == quantidade de numeros, parar o loop

        System.out.println("Quantidade de pares "+ quantPares); // imprime os pares
        System.out.println("Quantidade de impares "+ quantImpares); // imprime os impares
    }


}


