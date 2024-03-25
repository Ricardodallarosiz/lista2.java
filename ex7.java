import java.util.Arrays;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] vetor1 = new int[5];
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        
        int[] vetor2 = new int[5];
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        
        boolean saoIguais = Arrays.equals(vetor1, vetor2);

        
        if (saoIguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }

        scanner.close(); 
    }
    
}
