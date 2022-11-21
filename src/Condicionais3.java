public class Condicionais3 {
    public static void main(String[] args) {
        int idade = 19;
        double salario = 1345;
        double valorEmprestimo = 30000;
        int numeroParcelas = 3;

        double valorParcela = valorEmprestimo / numeroParcelas;
        double valorMaximoParcela = salario * 0.3;

        System.out.printf(
                "A pessoa que está solicitando o empréstimo tem %d anos de idade e tem o salário de %.2f reais.\n" +
                        "O valor solicitado é de %.2f reais para ser pago em %d parcelas.\n",
                idade, salario, valorEmprestimo, numeroParcelas
        );

        boolean abaixoIdade = idade < 18;
        boolean acimaIdade = idade > 65;
        boolean abaixoNumeroParcelas = numeroParcelas < 3;
        boolean acimaNumeroParcelas = numeroParcelas > 24;
        boolean acimaComprometimentoRenda = valorParcela > valorMaximoParcela;

        if(
                abaixoIdade || acimaIdade ||
                        abaixoNumeroParcelas || acimaNumeroParcelas ||
                        acimaComprometimentoRenda
        ) {
            System.out.println("O empréstimo foi reprovado pelos seguintes motivos: ");

            if(abaixoIdade) {
                System.out.println("- a idade não pode ser menor que 18 anos.");
            }

            if(acimaIdade) {
                System.out.println("- a idade não pode ser maior que 65 anos.");
            }

            if(abaixoNumeroParcelas) {
                System.out.println("- a quantidade de parcelas não pode ser menor que 3.");
            }

            if(acimaNumeroParcelas) {
                System.out.println("- a quantidade de parcelas não pode ser maior que 24.");
            }

            if(acimaComprometimentoRenda) {
                double porcentagemDeComprometimento = (100 * valorParcela) / salario;

                System.out.printf(
                        "- o valor da parcela desse empréstimo é de %.2f reais, e corresponde a %.0f%% da " +
                                "renda da pessoa. Esse valor não pode ser superior a 30%%.",
                        valorParcela, porcentagemDeComprometimento
                );
            }
        } else {
            System.out.println("O empréstimo foi aprovado.");
        }

    }
}
