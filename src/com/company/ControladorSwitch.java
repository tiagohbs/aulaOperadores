package com.company;

import java.util.Scanner;

public class ControladorSwitch {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0;
        System.out.println("Aqui utilizaremos o controlador switch");
        System.out.println("Digite um numero entre 1 e 7 para o dia da semana: ");
        num = ler.nextInt();

        switch (num){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("ERRO");
                break;
        }
    }

}
