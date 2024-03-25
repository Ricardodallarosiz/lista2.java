import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] vetor = new int[5];

        
        System.out.println("Digite os 5 elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        int indiceMaior = encontrarIndiceMaiorElemento(vetor);

        
        if (indiceMaior != vetor.length - 1) { 
            int temp = vetor[indiceMaior];
            vetor[indiceMaior] = vetor[vetor.length - 1];
            vetor[vetor.length - 1] = temp;
        }

        
        System.out.println("Vetor atualizado:");
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }

        scanner.close(); 
    }

    
    public static int encontrarIndiceMaiorElemento(int[] vetor) {
        int indiceMaior = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }
        return indiceMaior;
    }
    
}
