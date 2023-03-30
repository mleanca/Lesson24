package Lesson24Ex2And3Of3;

public class MainNumbers {

    public static void main(String[] args) {

        Numbers divisor = new Numbers();
        divisor.divideBy(1);
        divisor.divideBy(10);
        divisor.divideBy(50);
        divisor.divideBy(0);

        //100 / 1 = 100
        //100 / 10 = 10
        //100 / 50 = 2
        //Exception in thread "main" java.lang.IllegalArgumentException: Divisor cannot be equal to 0
        //	at Lesson24Ex2Of3.Numbers.divideBy(Numbers.java:9)
        //	at Lesson24Ex2Of3.MainNumbers.main(MainNumbers.java:14)
        
        
        
        Numbers count1 = new Numbers();
        try {
            System.out.println("Count of numbers divisible by 7 from 1 to 100: " + count1.countDivisibleBy7Numbers(1, 100));
        } catch (Numbers.InvalidRangeException e) {
            System.out.println(e.getMessage());
        }

        Numbers count2 = new Numbers();
        try {
            System.out.println("Count of numbers divisible by 7 from 100 to 1: " + count2.countDivisibleBy7Numbers(100, 1));
        } catch (Numbers.InvalidRangeException e) {
            System.out.println(e.getMessage());
        }
        //Count of numbers divisible by 7 from 1 to 100: 14
        //Invalid Range Exception - inferior limit must be lower than superior limit
        
    }
}
