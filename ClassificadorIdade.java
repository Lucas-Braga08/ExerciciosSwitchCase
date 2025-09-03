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

public class ClassificadorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int faixa;

        try {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            if
                    (idade >= 0 && idade <= 12) { faixa = 1; }
            else if 
                    (idade >= 13 && idade <= 17) { faixa = 2; }
            else if
                    (idade >= 18 && idade <= 59) { faixa = 3; }
            else if
                    (idade >= 60) { faixa = 4; }
            else {
                System.out.println("Idade inválida.");
                return;
            }

            switch (faixa) {
                case 1:
                    System.out.println("Faixa etária: Criança");
                    break;
                case 2:
                    System.out.println("Faixa etária: Adolescente");
                    break;
                case 3:
                    System.out.println("Faixa etária: Adulto");
                    break;
                case 4:
                    System.out.println("Faixa etária: Idoso");
                    break;
                default:
                    System.out.println("Erro na classificação.");
            }

        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        } finally {
            scanner.close();
        }
    }
}
