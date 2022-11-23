import java.util.Random;
import java.util.Scanner;

public class Laços4 {
    public static void main(String[] args) {
         int escolha;

         // numero que o usuario digitou
         int numero;

         // numero que vai ser usado para fazer o sorteio
         int sorteado = 0;

         // quantidade de vezes necessárias até acertar o número do usuário
         int soma = 0;

        Scanner scanner =new Scanner(System.in);
        System.out.println("digite um numero ");
        numero = scanner.nextInt();
        Random random = new Random();
        System.out.println("O numero escolhido " +numero);

        // verificar se o usuario digitou um número menor que zero ou maior que seis e reclamar
        if (numero <1 || numero >6){
            System.out.println("Você tera que escolher um numero de 0 a 6 para o sorteio ocorrer");
        }else {
            // ficar repetindo enquanto o número sorteado for diferente do número que o usuário digitou
            while (sorteado!= numero) {
                // escolher um número aleatório entre 1 e 6
                sorteado = random.nextInt(1, 7);
                soma++;
                System.out.println("O sorteado foi " + sorteado);
            }
            System.out.println("Foram necessários " +soma+ " sorteios para que o número " +numero+ " fosse sorteado");
        }
}

}
