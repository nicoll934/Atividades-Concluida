public class Condicionais1 {
    public static void main(String[] args) {
        /// Resultado dos alunos 1
        double notasAlunos = (5.0 + 8.0 + 6.0 + 7.0) / 4.0;
        double mediaFinal = notasAlunos;

        System.out.println("A média final é " + mediaFinal);
        if (mediaFinal < 6) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
       /// Resultados alunos 2
        double notasAlunos2 = (2.0 + 4.0 + 3.0 + 1.0) / 4.0;
        double mediaFinal2 = notasAlunos2;

        System.out.println("A média final é " + mediaFinal2);
        if (mediaFinal2 < 6) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");

        }

    }
}
