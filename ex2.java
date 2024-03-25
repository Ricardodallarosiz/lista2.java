import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o tamanho da sequência (máximo 100): ");
        int tamanho = scanner.nextInt();

       
        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            
            if (numeros[i] > 0) {
                System.out.println("O número " + numeros[i] + " na posição " + i + " é positivo");
            } else if (numeros[i] < 0) {
                System.out.println("O número " + numeros[i] + " na posição " + i + " é negativo");
            } else {
                System.out.println("O número " + numeros[i] + " na posição " + i + " é zero");
            }
        }

        scanner.close(); 
    }
    
}
