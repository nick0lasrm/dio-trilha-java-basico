import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Bem-vindo ao banco Itaú");
        System.out.println("=======================");

        System.out.println("Por favor, informe seu nome:");
        var name = in.next();

        System.out.printf("Olá, %s. Informe o número da agência:\n", name);
        var agency = in.nextInt();

        System.out.println("Agora informe o número da conta com o dígito:");
        var account = in.next();

        System.out.println("Digite seu saldo:");
        var balance = in.nextDouble();
        
        System.out.printf("Olá, %s. Obrigado por criar uma conta no nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque.", name, agency, account, balance);
    }
}
