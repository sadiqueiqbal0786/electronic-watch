package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;

        p2 = p2 / 60;

        p2= (p2>=24)?0:p2;

        String min = String.format("%02d" , p3);
        String m=(p3<10)? min : String.valueOf(p3);
        String sec = String.format("%02d" , p1);
        String s=(p1<10 && p1>-1)? sec : String.valueOf(p1);

        System.out.print(p2 + ":" + m + ":" + s);


    }
}
