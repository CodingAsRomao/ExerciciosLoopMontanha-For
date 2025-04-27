import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        
        do {
            // Solicitar dados do investimento
            double[] dados = solicitarDadosInvestimento(scanner);
            double principal = dados[0];
            double taxaJuros = dados[1];
            int tempo = (int)dados[2];
            boolean capitalizacaoComposta = dados[3] == 1;
            
            // Calcular montante
            double montante = calcularMontante(principal, taxaJuros, tempo, capitalizacaoComposta);
            
            // Exibir resultados
            exibirResultado(principal, taxaJuros, tempo, montante, capitalizacaoComposta);
            
            // Perguntar se deseja continuar
            System.out.print("\nDeseja realizar um novo cálculo? (s/n): ");
            continuar = scanner.next().charAt(0);
            
        } while (continuar == 's' || continuar == 'S');
        
        System.out.println("\nCalculadora encerrada. Obrigado!");
        scanner.close();
    }
    
    // Método para solicitar dados do investimento
    public static double[] solicitarDadosInvestimento(Scanner scanner) {
        double[] dados = new double[4];
        
        System.out.println("\n=== Calculadora de Investimentos ===");
        System.out.print("Valor do investimento inicial (R$): ");
        dados[0] = scanner.nextDouble();
        
        System.out.print("Taxa de juros anual (%): ");
        dados[1] = scanner.nextDouble();
        
        System.out.print("Período de investimento (anos): ");
        dados[2] = scanner.nextDouble();
        
        System.out.print("Tipo de capitalização (1-Composta / 2-Simples): ");
        dados[3] = scanner.nextDouble();
        
        return dados;
    }
    
    // Método para calcular o montante
    public static double calcularMontante(double principal, double taxaJuros, int tempo, boolean composta) {
        if (composta) {
            // Fórmula juros compostos: M = P * (1 + r/100)^t
            return principal * Math.pow(1 + (taxaJuros / 100), tempo);
        } else {
            // Fórmula juros simples: M = P * (1 + (r/100) * t)
            return principal * (1 + (taxaJuros / 100) * tempo);
        }
    }
    
    // Método para exibir resultados formatados
    public static void exibirResultado(double principal, double taxaJuros, int tempo, 
                                     double montante, boolean composta) {
        System.out.println("\n=== Resultado do Investimento ===");
        System.out.printf("Investimento inicial: R$ %.2f%n", principal);
        System.out.printf("Taxa de juros anual: %.2f%%%n", taxaJuros);
        System.out.println("Período: " + tempo + " anos");
        System.out.println("Tipo: " + (composta ? "Juros Compostos" : "Juros Simples"));
        System.out.printf("Montante final: R$ %.2f%n", montante);
        
        // Calcular rendimento total
        double rendimento = montante - principal;
        System.out.printf("Rendimento total: R$ %.2f%n", rendimento);
    }
}
