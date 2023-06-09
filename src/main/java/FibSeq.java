package src.main.java;

public class FibSeq {

    public static void main(String[] args) {
        int nthNumberInFibSeq = 10;
        System.out.println("The " + nthNumberInFibSeq + " number in the Fibonacci sequence is "
                + FibToTheNthCalculator(nthNumberInFibSeq));
    }

    /**
     * Returns the nth number of the Fibonacci Sequence as an int or 1 if the position given is < 1.
     *
     * @param nth A position in the Fibonacci Sequence.
     * @return The number in the nth position of the Fibonacci Sequence
     */
    static int FibToTheNthCalculator(int nth) {
        if (nth <= 1) {
            return nth;
        }

        return (FibToTheNthCalculator(nth - 1)) + (FibToTheNthCalculator(nth - 2));
    }
}
