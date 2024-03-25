import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] numeros = new int[5];
        
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        scanner.close(); 
        
        
        double media = calculaMedia(numeros);
        
        
        System.out.println("\nValores menores que a média:");
        apresentaValores(numeros, media, "menor");
        
        System.out.println("\nValores iguais à média:");
        apresentaValores(numeros, media, "igual");
        
        System.out.println("\nValores superiores à média:");
        apresentaValores(numeros, media, "superior");
    }
    
    
    public static double calculaMedia(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma / (double) numeros.length;
    }
    
    
    public static void apresentaValores(int[] numeros, double media, String tipo) {
        for (int numero : numeros) {
            if ((tipo.equals("menor") && numero < media) ||
                (tipo.equals("igual") && numero == media) ||
                (tipo.equals("superior") && numero > media)) {
                System.out.println(numero);
            }
        }
    }
}