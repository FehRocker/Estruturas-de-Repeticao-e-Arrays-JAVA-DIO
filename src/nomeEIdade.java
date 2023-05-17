import java.util.Scanner;

public class nomeEIdade {
    /*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variaveis
        String nome; // armazenar o nome
        int idade; // armazenar a idade

        //metodo
        while (true) { // enquanto o loop for verdadeiro
            System.out.println("Digite seu nome");
            nome = scan.next();// escreva o nome

            if (nome.equals("0")) { // se o nome for igual a zero
                break; // parar o código
            }

            System.out.println("Digite a Idade");
            idade = scan.nextInt();// digitar a idade
        }
    }
}
