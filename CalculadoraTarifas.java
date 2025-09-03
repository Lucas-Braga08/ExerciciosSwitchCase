/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios2;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class CalculadoraTarifas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Escolha o tipo de transporte:");
            System.out.println("1 - Ônibus urbano (R$ 4,40)");
            System.out.println("2 - Metrô (R$ 5,00)");
            System.out.println("3 - Trem intermunicipal (R$ 6,50)");
            System.out.println("4 - Ônibus rodoviário (R$ 12,00)");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            System.out.print("Quantidade de bilhetes: ");
            int quantidade = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Valor total: R$ %.2f%n", quantidade * 4.40);
                    break;
                case 2:
                    System.out.printf("Valor total: R$ %.2f%n", quantidade * 5.00);
                    break;
                case 3:
                    System.out.printf("Valor total: R$ %.2f%n", quantidade * 6.50);
                    break;
                case 4:
                    System.out.printf("Valor total: R$ %.2f%n", quantidade * 12.00);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        } finally {
            scanner.close();
        }
    }
}
