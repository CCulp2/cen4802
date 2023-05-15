public class FibSeq {

    public static void main(String[] args) {
        System.out.println(FibToTheNthCalculator(10));
    }

    static int FibToTheNthCalculator(int nth) {
        if (nth <= 1) {
            return nth;
        }

        return (FibToTheNthCalculator(nth - 1)) + (FibToTheNthCalculator(nth - 2));
    }
}
