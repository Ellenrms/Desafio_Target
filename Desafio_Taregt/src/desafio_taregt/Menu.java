package desafio_taregt;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMenu de Opcoes:");
            System.out.println("1. Verificar se um numero pertence a sequencia de Fibonacci");
            System.out.println("2. Contar ocorrencias da letra 'a' em uma string");
            System.out.println("3. Calcular o valor final da variavel SOMA");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    fibonacciCheck(scanner);
                    break;
                case 2:
                    countLetterA(scanner);
                    break;
                case 3:
                    calculateSum();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        } while (option != 4);

        scanner.close();
    }

    public static void fibonacciCheck(Scanner scanner) {
        System.out.print("Informe um numero: ");
        int num = scanner.nextInt();
        
        if (isFibonacci(num)) {
            System.out.println("O numero " + num + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("O numero " + num + " nao pertence a sequencia de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        int a = 0, b = 1;
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == n;
    }

    public static void countLetterA(Scanner scanner) {
        System.out.print("Informe uma string: ");
        scanner.nextLine(); 
        String input = scanner.nextLine();

        int count = countLetterA(input);

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' nao aparece na string.");
        }
    }

    public static int countLetterA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    public static void calculateSum() {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor final da variavel SOMA eh " + SOMA + ".");
    }
}
