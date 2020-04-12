package org.pkg.work;

public class PrimitiveTypes {

    public static void main (String[] args){
        byte myByteWork = 10;
        short myShortWork = 1432;
        int myIntWork = 10992;
        long myLongWorkTotal = 50000L+10L * (myByteWork+myShortWork+myIntWork);
        short myShortWorkTotal = (short) (50000+10 * (myByteWork+myShortWork+myIntWork));
        System.out.println(myShortWorkTotal);

        float myMaxFloat = Float.MAX_VALUE;
        float myMinFloat = Float.MIN_VALUE;
        System.out.println(myMaxFloat);
        System.out.println(myMinFloat);

        double myMaxDouble = Double.MAX_VALUE;
        double myMinDouble = Double.MIN_VALUE;
        System.out.println(myMaxDouble);
        System.out.println(myMinDouble);

        int myInt = 5/2;
        float myFloat = 5F/3;
        double myDouble = 5.00/3.00;
        System.out.println("My int value is "+myInt);
        System.out.println("My float value is "+myFloat);
        System.out.println("My double value is "+myDouble);

        double poundsNum=8.56;
        double kgNum=poundsNum*0.45359237d;
        System.out.println(kgNum);

        double num1= 0.555678678d;
        double num2= 1.55347655d;
        System.out.println(num1);
        System.out.println(num2);
    }
}
