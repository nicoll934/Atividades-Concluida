import java.util.Random;
import java.util.Scanner;

public class Condicionais4 {
    public static void main(String[] args) {

        Random random = new Random(6);
        Scanner scanner = new Scanner(System.in);

        int UmNumero;
        int Aleatorios = random.nextInt(6);

        System.out.println("Digite aqui um numero de 1 a 6");
        UmNumero = scanner.nextInt();

        if (UmNumero <= 1 && UmNumero >= 6) {
            System.out.println("O numero selecionado foi " + UmNumero);
            System.out.println("Erro,Escolha um numero entre 1 e 6. ");
        } else if (UmNumero == Aleatorios) {
            System.out.println("O numero selecionado  " + UmNumero);
            System.out.println("O numero sorteado foi " + Aleatorios);
            System.out.println("Você acertou");

        } else if (UmNumero != Aleatorios) {
            System.out.println("O numero selecionado " + UmNumero);
            System.out.println("O numero sorteado foi " + Aleatorios);
            System.out.println("Você Errou");
        }

    }
}
