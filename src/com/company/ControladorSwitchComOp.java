package com.company;

import java.util.Scanner;

public class ControladorSwitchComOp {
    public static void main(String[] args) {
        int num = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Aqui o switch sera usado com operadores lógicos");
        System.out.println("Digite um numero inteiro entre 1 e 5 e veja o resultado: ");
        num = ler.nextInt();

        switch (num){
            case 1:  // resultado mostrado sera entre 1 e 3
            case 2:
            case 3:
                System.out.println("Certo!");
                break;
            case 4:
                System.out.println("Errado!");
                break;
            case 5:
                System.out.println("Talvez...");
                break;
            default:
                System.out.println("Resultado intangível");
                break;

        }

    }
}
