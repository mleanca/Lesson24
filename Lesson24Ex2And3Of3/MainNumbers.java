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
    }
}
