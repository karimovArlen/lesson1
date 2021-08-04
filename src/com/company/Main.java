package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String something;
        final int NUM = 24;
        String word = "read number ";
        something = word + NUM;
        System.out.println(something);
        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        }else{
            System.out.println("вы сохранили ноль");
        }


        String name = "Как тебя зовут?";
        Scanner scan = new Scanner(System.in);
        String x1 = scan.nextLine();
        System.out.println("Привет " + x1 + "!");


    }
}
