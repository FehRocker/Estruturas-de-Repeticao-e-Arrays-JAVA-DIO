import java.util.Scanner;

public class tabuada {
    /*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Tabuada do numero ");
        tabuada = scan.nextInt();
        if (tabuada>10) // se o valor for maior que 10
            System.out.println("O numero deve ser de 1 a 10");
        tabuada = scan.nextInt();
        for (int i = 1; i <= 10; i++) { // i= contador, deve ser menor ou igual a 10, e incremento no contador
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}
