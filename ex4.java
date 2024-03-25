import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int[] vetor = new int[5];
        System.out.println("Digite os 5 números do vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        System.out.print("Digite o número n: ");
        int n = scanner.nextInt();

        
        System.out.println("Índices dos elementos menores que " + n + ":");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < n) {
                System.out.println("Índice " + i + ": " + vetor[i]);
            }
        }

        scanner.close(); 
    }
    
}
