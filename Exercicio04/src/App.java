public class App {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 100 (um por linha):");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {  // Verifica se o número é ímpar
                System.out.println(i);
            }
        }
    }
}