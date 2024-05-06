import java.util.Locale;
import java.util.Scanner;

public class Operacoes {

    public double depositoConta (DadosConta dados, double depositoValor){
        double valorTotal;
        return valorTotal = dados.getSaldo() + depositoValor;

    }

    public void  saqueConta(DadosConta dados){
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        double saqueValuer;
        double taxa = 5;
        System.out.println("\n-------------------------------------------");
        System.out.println("\nDigite um valor acima de 20 reais apara saque:");
        saqueValuer = tc.nextDouble();
       double valorComtaxa = saqueValuer + taxa;



       if (saqueValuer <20 || saqueValuer> dados.getSaldoTotal()){
           throw new IllegalArgumentException("Saldo insuficiente para saque !!");
       }

       else {
           double saldo = dados.getSaldoTotal() - valorComtaxa;
           System.out.println("Saque realizado com sucesso!!");
           System.out.printf("Nome:%s",dados.getNomeDaConta());
           System.out.printf("\nConta:%d",dados.getNumeroDaconta());
           System.out.printf("\nTaxa de saque cobrada: R$%.2f\n", taxa);
           System.out.printf("\nSaldo atual: R$%.2f",saldo);
           dados.setSaldo(saldo);
       }


    }
}
