
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch ( Exception RuntimeException) {
            System.out.println("O primeiro numero é maior que o segundo numero.");
        }
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosIvanlidosExpection {
        if (parametroUm > parametroDois) {
           throw new ParametrosIvanlidosExpection();
        }

        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <=contagem;i++){
            System.out.println("Imprimindo o numero " + i);
        }

    }
}
