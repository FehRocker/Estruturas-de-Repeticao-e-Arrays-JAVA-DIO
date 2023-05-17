import java.util.Scanner;

public class Nota {
    /*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// interação com usuário digitando

        double nota; // aceita numeros quebrados

        System.out.println("Insira uma nota de Zero a 10");
        nota = scan.nextDouble();// interação com usuário

        while (nota < 0 | nota > 10) { // loop de repetição em caso de nao satisfazer as condições
            System.out.println("Valor Invalido");
            System.out.println("Digite um valor Valido");
            nota = scan.nextDouble(); // interação novamente

        }
        if (nota<=5){ // condição de aprovado ou reprovado
            System.out.println("Reprovado");
        }else if (nota>=6){
            System.out.println("Aprovado");
        }
    }
}
