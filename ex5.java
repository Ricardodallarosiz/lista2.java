import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] vetor = new int[5];
        System.out.println("Digite 5 números:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        
        System.out.print("Digite um número para contar as ocorrências: ");
        int n = scanner.nextInt();

        
        int contador = contaOcorrencias(vetor, n);

        
        System.out.println("O número " + n + " aparece " + contador + " vezes no vetor.");

        scanner.close(); 
    }

    
    public static int contaOcorrencias(int[] vetor, int n) {
        int contador = 0;
        for (int elemento : vetor) {
            if (elemento == n) {
                contador++;
            }
        }
        return contador;
    }

    
}
