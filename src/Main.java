import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo = 1000;
        double valor;
        int opcao;
        int continuar = 1;
        Scanner leitura = new Scanner(System.in);

        while (continuar == 1) {
            System.out.println("---Menu do Banco---\n1-Saldo\n2-Saque\n3-Depósito\n4-Sair");
            System.out.println("Digite a opção desejada:");
            opcao = leitura.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("---Consulta de Saldo---\nSeu saldo atual é de: R$" + saldo);
                    System.out.println("---Deseja fazer mais alguma operação?---\n1-Sim\n2-Não\n:");
                    continuar = leitura.nextInt();
                    break;
                case 2:
                    System.out.println("---Saque---\nSaldo Disponível: R$ "+ saldo +"\nQual valor deseja sacar?");
                    valor = leitura.nextDouble();
                    saldo = saldo - valor;
                    System.out.println("Saldo Disponível Atualizado: R$" + saldo);
                    System.out.println("---Deseja fazer mais alguma operação?---\n1-Sim\n2-Não\n:");
                    continuar = leitura.nextInt();
                    break;
                case 3:
                    System.out.println("---Depósito---\nSaldo Disponível: R$ "+ saldo +"\nQual valor deseja depositar?");
                    valor = leitura.nextDouble();
                    saldo = saldo + valor;
                    System.out.println("Saldo Disponível Atualizado: R$" + saldo);
                    System.out.println("---Deseja fazer mais alguma operação?---\n1-Sim\n2-Não\n:");
                    continuar = leitura.nextInt();
                    break;
                case 4:
                    System.out.println("Confirma que deseja sair?\n1-Não\n2-Sim");
                    continuar = leitura.nextInt();
                    break;
            }

        }



    }
}