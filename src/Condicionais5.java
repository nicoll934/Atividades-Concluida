public class Condicionais5 {
    public static void main(String[] args) {

        double SALARIO = 3800;
        double valorInss;

        double FAIXA_1 = 0.075;
        double FAIXA_2 = 0.09;
        double FAIXA_3 = 0.12;
        double FAIXA_4 = 0.14;

        double _FAIXAA_1 = 1212;
        double _FAIXAA_2 = 2427.35;
        double _FAIXAA_3 = 3641.03;
        double _FAIXAA_4 = 7087.22;

        double CONTRIBUICAO_MAXIMA_FAIXA_1 = _FAIXAA_1 * FAIXA_1;
        double CONTRIBUICAO_MAXIMA_FAIXA_2 = (_FAIXAA_2 - _FAIXAA_1) * FAIXA_2 +
                CONTRIBUICAO_MAXIMA_FAIXA_1;
        double CONTRIBUICAO_MAXIMA_FAIXA_3 = (_FAIXAA_3 - _FAIXAA_2) * FAIXA_3 +
                CONTRIBUICAO_MAXIMA_FAIXA_2;
        double CONTRIBUICAO_MAXIMA = (_FAIXAA_4 - _FAIXAA_3) * FAIXA_4 +
                CONTRIBUICAO_MAXIMA_FAIXA_3;

        if (SALARIO <= _FAIXAA_1) {
            valorInss = SALARIO * FAIXA_1;
        } else if (SALARIO <= _FAIXAA_2) {
            valorInss = (SALARIO - _FAIXAA_1) * FAIXA_2 + CONTRIBUICAO_MAXIMA_FAIXA_1;
        } else if (SALARIO <= _FAIXAA_3) {
            valorInss = (SALARIO - _FAIXAA_2) * FAIXA_3 + CONTRIBUICAO_MAXIMA_FAIXA_2;
        } else if (SALARIO <= _FAIXAA_4) {
            valorInss = (SALARIO - _FAIXAA_3) * FAIXA_4 + CONTRIBUICAO_MAXIMA_FAIXA_3;
        } else {
            valorInss = CONTRIBUICAO_MAXIMA;
        }

        System.out.printf("O salário bruto informado foi %.2f reais.\n", SALARIO);
        System.out.printf("O valor da contribuição ao INSS é de %.2f reais.", valorInss);
    }
}

