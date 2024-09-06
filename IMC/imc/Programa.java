import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IMC imc = new IMC();

        System.out.print("Informe o seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a sua altura (m): ");
        double altura = scanner.nextDouble();

        double resultado = imc.calcularIMC(peso, altura);
        System.out.printf("Seu IMC é: %.2f%n", resultado);
        
        scanner.close();
    }
}