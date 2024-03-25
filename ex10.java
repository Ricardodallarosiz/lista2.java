import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] vetorA = new int[5];
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[vetorA.length - 1 - i];
        }

        
        System.out.println("Vetor B com elementos de A invertidos:");
        for (int elemento : vetorB) {
            System.out.print(elemento + " ");
        }

        scanner.close(); 
    }
    
}
