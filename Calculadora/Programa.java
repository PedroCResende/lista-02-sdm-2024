package Calculadora;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Selecione a operação: 1-Somar, 2-Subtrair, 3-Multiplicar, 4-Dividir");
        int operacao = scanner.nextInt();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = calculadora.somar(num1, num2);
                break;
            case 2:
                resultado = calculadora.subtrair(num1, num2);
                break;
            case 3:
                resultado = calculadora.multiplicar(num1, num2);
                break;
            case 4:
                try {
                    resultado = calculadora.dividir(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.printf("O resultado é: %.2f%n", resultado);
        scanner.close();
    }
}