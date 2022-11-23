import java.util.Random;

public class Laços3 {
    public static void main(String[] args) {
        int numeroDeSorteio = Integer.parseInt(args[0]);
        Random random = new Random();
        int soma = 0;

        for (int i = 0; i < numeroDeSorteio; i++) {
            int numeroSorteado = random.nextInt(1, 7);
            soma += numeroSorteado ;
            System.out.println("O sorteado foi " +numeroSorteado);

        }
        System.out.println("A soma dos numeros foram " +soma);
    }
}