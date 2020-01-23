package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        Days days = Days.Monday;
        System.out.println(days);
        switch (days) {
            case Monday:
            case Friday:
            case Sunday:
            case Wednesday:
                System.out.println("Выходной не учимся!");
        }
       Days thursday = Days.valueOf("Thursday");
        Days days1 = Days.Tuesday;
        System.out.println(days1);
        switch (days1) {
            case Tuesday:
            case Thursday:
                System.out.println("Учимся :)");
                System.out.println(thursday);
            case Saturday:
                System.out.println("Учимся :)");

        }
    }
}
