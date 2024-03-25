import java.util.Scanner;

public class ex12 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] vetor = new int[12];

        
        System.out.println("Digite os 12 elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        int produto = calcularProdutoElementosPares(vetor);

        
        System.out.println("O produto dos elementos pares positivos é: " + produto);

        scanner.close(); 
    }

    
    public static int calcularProdutoElementosPares(int[] vetor) {
        int produto = 1; 
        for (int elemento : vetor) {
            
            if (elemento != 0 && elemento % 2 == 0 && elemento > 0) {
                produto *= elemento;
            }
        }
        return produto;
    }
    
}
