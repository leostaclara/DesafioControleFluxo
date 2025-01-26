import java.util.Scanner;

// Classe de exceção personalizada...
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem informando o erro
            System.out.println("ATENÇÃO: " + e.getMessage());
        }
    }

    // Método para realizar a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é menor que parametroDois
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Realizar o loop para imprimir os números
        for (int i = parametroUm + 1; i <= parametroDois; i++) {
            System.out.println("Número: " + i);
        }
    }
}
