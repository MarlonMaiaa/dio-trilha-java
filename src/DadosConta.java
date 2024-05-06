import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class DadosConta {

    private double saldo;
    private String abriConta;
    private int numeroDaconta;
    private String nomeDaConta;
    private double depositoInicial;
    private double saldoTotal = 0 ;

    public DadosConta (){
        this.saldo = 30;

    }

    public void inputDadosConta (){
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        System.out.println("Deseja abri uma conta 's' para sim e 'n' nao");
         abriConta = tc.next();
         abriConta = abriConta.toLowerCase();

        if (abriConta.equals("s")||abriConta.equals("sim")) {
            System.out.println("Digite o numero da conta:");
            numeroDaconta = tc.nextInt();
            tc.nextLine();
            System.out.println("Digite o Seu nome completo:");
            nomeDaConta = tc.nextLine();

            System.out.println("\"Realize um deposito inicial no valor minimo de R$:20 reais:");
            this.depositoInicial = tc.nextDouble();

        }
            else {
            throw  new IllegalArgumentException
                    ("Operacao encerrada !!");

            }

            if (depositoInicial <20){
                throw  new IllegalArgumentException
                        ("Favor realizar deposito acima de R$:20 para abertura de conta");



            }

        else {
                this.saldoTotal = this.saldo + this.depositoInicial;
            System.out.printf("Conta aberta com sucesso!! \n Conta: %d\n Nome: %s \n Valor Total R$:%.2f",
                    numeroDaconta,nomeDaConta,this.saldoTotal);
                System.out.printf("\nParabens voce ganhou R$:%.2f" , this.saldo);

        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaconta() {
        return numeroDaconta;
    }

    public void setNumeroDaconta(int numeroDaconta) {
        this.numeroDaconta = numeroDaconta;
    }

    public String getNomeDaConta() {
        return nomeDaConta;
    }

    public void setNomeDaConta(String nomeDaConta) {
        this.nomeDaConta = nomeDaConta;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
}
