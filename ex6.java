import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[] notas = new double[5];
        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        
        double[] pesos = new double[5];
        System.out.println("Digite os 5 pesos correspondentes:");
        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Peso " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }

        
        double mediaPonderada = calculaMediaPonderada(notas, pesos);

        
        System.out.println("A média ponderada do aluno é: " + mediaPonderada);

        scanner.close(); 
    }

    
    public static double calculaMediaPonderada(double[] notas, double[] pesos) {
        double somaProdutos = 0;
        double somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaProdutos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        return somaProdutos / somaPesos;
    }
    
}
