/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios2;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class SimuladorBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Menu de Atendimento Bancário:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Encerrar atendimento");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            // Saldo inicial fixo, usado só para consulta e comparação
            final double SaldoIicial = 1000.00;

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo é: R$ %.2f%n", SaldoIicial);
                    break;
                case 2:
                    System.out.print("Valor para saque: ");
                    double saque = scanner.nextDouble();
                    if (saque > SaldoIicial) {
                        System.out.println("Erro: Saldo insuficiente.");
                    } else {
                        System.out.printf("Saque realizado. Novo saldo: R$ %.2f%n", SaldoIicial - saque);
                    }
                    break;
                case 3:
                    System.out.print("Valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    System.out.printf("Depósito realizado. Novo saldo: R$ %.2f%n", SaldoIicial + deposito);
                    break;
                case 4:
                    System.out.println("Atendimento encerrado.");
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
