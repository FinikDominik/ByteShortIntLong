package academy.learnprograming;

public class Main {
    public static void main(String[] args) {

//        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

//        The int keyword is a data type that can store whole numbers from -2147483648 to 2147483647.

/*
        int myMaxIntTest = 2147483648;
        int myMaxIntTest = 2_147_483_648;
*/

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

//        The byte keyword is a data type that can store whole numbers from -128 to 127.

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

//        The short keyword is a data type that can store whole numbers from -32768 to 32767.

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

//        The long keyword is a data type that can store whole numbers from -9223372036854775808 to 9223372036854775808.

        long bigLongLiteralValue = 2_147_483_649L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        
//        Size of Primitive Types and width :

//        Byte = 8 bits width 8
//        short = 16 bits width 16
//        int = 32 bits width 32
//        long = 63 bits width 63

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

//        without (byte) there - java work with this like Integer by  default, if we put there (byte), java treat with this value following the parentheses' byte parentheses as a byte.
    }
}