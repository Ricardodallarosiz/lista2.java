import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] vetor = new int[5];

        
        System.out.println("Digite 5 números (com exceção do primeiro, cada número deve ser maior que o anterior):");
        vetor[0] = scanner.nextInt(); 
        for (int i = 1; i < vetor.length; i++) {
            int numero = scanner.nextInt();
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("O número digitado não é maior que o anterior. Por favor, digite novamente:");
                i--; 
            }
        }

        
        System.out.println("Vetor preenchido de acordo com a regra:");
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }

        scanner.close(); 
    }
    
}
