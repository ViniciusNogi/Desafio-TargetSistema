public class DesafioFaturamentoMensal {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        double percentualSP = (sp / total) * 100;
        double percentualRJ = (rj / total) * 100;
        double percentualMG = (mg / total) * 100;
        double percentualES = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;

        System.out.println("Percentual que cada estado teve dentro do valor total mensal da distribuidora:");
        System.out.printf("Faturamento SP: R$%-12.2f | Percentual: %.2f%% \n", sp, percentualSP);
        System.out.printf("Faturamento RJ: R$%-12.2f | Percentual: %.2f%% \n", rj, percentualRJ);
        System.out.printf("Faturamento MG: R$%-12.2f | Percentual: %.2f%% \n", mg, percentualMG);
        System.out.printf("Faturamento ES: R$%-12.2f | Percentual: %.2f%% \n", es, percentualES);
        System.out.printf("Faturamento Outros: R$%.2f | Percentual: %.2f%% \n", outros, percentualOutros);

      
    }
}
