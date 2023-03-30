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


    public int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {

        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Invalid Range Exception - inferior limit must be lower than superior limit");
        }

        int count = 0;

        for (int i = inferiorLimit; i < superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        return count;
    }

    class InvalidRangeException extends Exception {
        //exceptie definita, am pus ca inner class pentru al vedea mai usor
        public InvalidRangeException(String message) {
            super(message);
        }
    }
}
