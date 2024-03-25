import java.util.Scanner;

public class ex8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] vetorA = new int[5];
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        
        int[] vetorB = new int[5];
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        
        int[] vetorC = new int[vetorA.length + vetorB.length];
        int index = 0;
        for (int elemento : vetorA) {
            vetorC[index] = elemento;
            index++;
        }
        for (int elemento : vetorB) {
            vetorC[index] = elemento;
            index++;
        }

        
        System.out.println("Vetor C (concatenação de A e B):");
        for (int elemento : vetorC) {
            System.out.print(elemento + " ");
        }

        scanner.close(); 
    }
    
}
