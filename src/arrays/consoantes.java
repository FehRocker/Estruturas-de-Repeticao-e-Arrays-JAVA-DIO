package arrays;

import java.util.Scanner;

public class consoantes {
    /*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] consoantes = new String[6];//iniciando um arrays vazio com 6 posições
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            //para nao contar com as vogais
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                //atribua a letra ao elemento do vetor na posição indicada pelo contador, caso seja consoante.
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;//acrescente o valor 1 ao contador a cada loop

        } while (count < consoantes.length);//enquanto o contador tiver o valor menor que o tamanho do array

        for (String consoante : consoantes ) {//para cada consoante dentro do array consoantes
            if ( consoante != null)//se o valor da consoante for diferente de null
            System.out.print(consoante + " " );//imprima a consoante
        }
        System.out.println("quantidade de consoantes: " + quantidadeConsoantes);
    }
    
}
