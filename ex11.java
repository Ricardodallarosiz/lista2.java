import java.util.Scanner;

public class ex11 {
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

        
        int produtoEscalar = calcularProdutoEscalar(vetorA, vetorB);

        
        System.out.println("O produto escalar entre A e B é: " + produtoEscalar);

        scanner.close(); 
    }

    
    public static int calcularProdutoEscalar(int[] vetorA, int[] vetorB) {
        int produtoEscalar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }
        return produtoEscalar;
    }
    
}
