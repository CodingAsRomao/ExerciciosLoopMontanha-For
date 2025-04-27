import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo (até 12): ");
        int numero = scanner.nextInt();
        
        // Verifica se o número é válido (0 a 12)
        if (numero < 0) {
            System.out.println("Erro: O número deve ser positivo!");
        } else if (numero > 12) {
            System.out.println("Erro: Números acima de 12 geram resultados muito grandes!");
        } else {
            int fatorial = 1;
            
            // Calcula o fatorial usando for
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
            }
            
            System.out.println(numero + "! = " + fatorial);
        }
        
        scanner.close();
    }
}