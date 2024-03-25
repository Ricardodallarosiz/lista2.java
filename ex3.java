import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o tamanho da sequência: ");
        int tamanho = scanner.nextInt();

        
        int[] vetorOriginal = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }

        
        int[] vetorDobro = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        
        System.out.println("\nValores do vetor dobrados:");
        for (int numero : vetorDobro) {
            System.out.println(numero);
        }

        scanner.close(); 
    }
    
}
