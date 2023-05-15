public class FibSeq {

    public static void main(String[] args) {
        int nthNumberInFibSeq = 10;
        System.out.println("The " + nthNumberInFibSeq + " number in the Fibonacci sequence is "
                + FibToTheNthCalculator(nthNumberInFibSeq));
    }

    static int FibToTheNthCalculator(int nth) {
        if (nth <= 1) {
            return nth;
        }

        return (FibToTheNthCalculator(nth - 1)) + (FibToTheNthCalculator(nth - 2));
    }
}
