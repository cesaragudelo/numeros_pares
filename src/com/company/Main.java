package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData=new Scanner(System.in);
        int num,par;
        System.out.println("ingrese numero");
        num=inputData.nextInt();
        for (int i=1; i<=num;i++ ){
            par= i%2;
            if(par==0){
                System.out.print(i+"-");
            }

        }
    }
}
