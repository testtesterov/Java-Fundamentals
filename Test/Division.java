package com.company;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int x=0;
        if(number%10==0) {x=10;}
        System.out.println(x);
    }
}
