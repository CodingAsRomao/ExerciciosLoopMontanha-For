import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        
        System.out.println("Digite 10 números inteiros:");
        
        // Preenche o vetor com valores digitados pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        
        System.out.println("\nElementos do vetor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\nA soma total dos elementos é: " + soma);
        scanner.close();
    }
}