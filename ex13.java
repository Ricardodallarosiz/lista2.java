import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        
        int[] fibonacci = new int[n];

        
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        
        System.out.print("Sequência de Fibonacci com " + n + " termos: ");
        for (int termo : fibonacci) {
            System.out.print(termo + " ");
        }

        scanner.close(); 
    }
    
}
