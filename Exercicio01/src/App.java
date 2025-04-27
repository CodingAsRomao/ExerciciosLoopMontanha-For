public class App {
    public static void main(String[] args) {
        int numero = 5;
        
        System.out.println("Tabela de multiplicação do " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}