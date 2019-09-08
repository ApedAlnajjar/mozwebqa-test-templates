package com.jma.Fourapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Width :");
        Double Width = input.nextDouble();

        System.out.println("Enter The lingth :");
        Double lingth = input.nextDouble();


        System.out.println("Enter The Width blouk in cm :");
        Double bWidth = input.nextDouble();


        System.out.println("Enter The lingth blouk in cm :");
        Double blingth = input.nextDouble();


        System.out.println("Enter The price  of blouk in NIS :");
        Double price  = input.nextDouble();


        double num = (Width/(bWidth/100))  *  (lingth/(blingth/100));
        double totalprice = Width * lingth * price ;

        System.out.println("The blouk need is : "+num);
        System.out.println("The totalprice is :"+ totalprice);


    }
}
