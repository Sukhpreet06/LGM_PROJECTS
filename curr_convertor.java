package com;
import java.util.Scanner;
public class curr_convertor {
    public static void main(String[] args) {
        while (true) {
            System.out.println("____________________________________________________________________________________");
            System.out.println("choose one from thre following options");
            System.out.println("1--> USD to € (Euro) ");
            System.out.println("2--> € (Euro) to USD ");
            System.out.println("3--> £ (Pounds) to USD");
            System.out.println("4-->  (USD) to RUPEE (₹)");
            Scanner sc = new Scanner(System.in);
            int exchange = sc.nextInt();
            switch (exchange) {
                case 1: {
                    System.out.println("ENTER THE NUMBER OF USD");
                    double usd = sc.nextDouble();
                    if (usd > 0) {
                        System.out.println(usd + " USD is " + usd * 0.92 + " €  ");
                    } else {
                        System.out.println("Please Enter The Positive Number Of USD");
                    }
                }
                break;
                case 2: {
                    System.out.println("Enter The Number Of €");
                    double euro = sc.nextDouble();
                    if (euro > 0) {
                        System.out.println(euro + " € is " + euro * 1.101 + " USD .");
                    } else {
                        System.out.println("Please Enter The Positive Number Of  €");
                    }
                }
                break;
                case 3: {
                    System.out.println("ENTER THE NUMBER OF £");
                    double pounds = sc.nextDouble();
                    if (pounds > 0) {
                        System.out.println(pounds + " £ is " + pounds * 1.28 + " USD");
                    } else {
                        System.out.println("Please Enter The Positive Number");
                    }
                }
                break;
                case 4:{
                    System.out.println("ENTER THE NUMBER OF USD :");
                    double usdollar=sc.nextDouble();
                    if(usdollar>0){
                        System.out.println(usdollar + "  USD is  "+ usdollar *82.11+" INR in 2k23 " );
                    }
                    else {
                        System.out.println("please enter the positive number :");
                    }
                }
                break;
            }
        }
    }
}
