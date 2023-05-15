package com.javaPrograms.Importent;

public class SweapingProgram {
    public static void main(String[] args) {
      swap();
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
}
