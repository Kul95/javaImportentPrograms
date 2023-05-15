package com.javaPrograms.Importent;

public class SweapingProgram {
    public static void main(String[] args) {
      swap();
        factorial();
        fibonacci();
    }
    public static void swap(){
        int num1=20,num2=50;
        int temp;
        System.out.println("Before sweaping :"+num1+" and "+num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After sweaping :"+num1+" and "+num2);
    }
    public static void factorial(){
        int fact=1;
        int num=5;
        for(int i=1;i<=num;i++){
          fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void fibonacci(){
       int num1=0,num2=1;
       int num3;
       for(int i=0;i<=10;i++){
           num3=num1+num2;
           System.out.print("  "+num3);
           num1=num2;
           num2=num3;
       }
    }
}
