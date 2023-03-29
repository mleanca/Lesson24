package Lesson24Ex2And3Of3;

public class Numbers {

    final int dividend = 100;

    public void divideBy(int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be equal to 0");
        } else {
            System.out.println(dividend + " / " + divisor + " = " + (dividend / divisor));
        }
    }


//    public int countDivisibileBy7Numbers(int inferiorLimit, int superiorLimit) {
//        if (inferiorLimit > superiorLimit) {
//            throw new InvalidRangeException("Lower limit must not exceed than superior limit");
//        } else {
//
//        }
//    }
//
//    public InvalidRangeException

}