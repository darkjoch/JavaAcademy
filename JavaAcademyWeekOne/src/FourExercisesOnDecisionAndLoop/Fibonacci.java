package FourExercisesOnDecisionAndLoop;

public class Fibonacci {
    public static void main(String[] args) {
        final int N_MAX = 20;
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int sum = fnMinus1 + fnMinus2;
        double average;
        System.out.println("The first " + N_MAX + " Fibonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " ");

        while (n <= N_MAX){
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");
            fnMinus1 = fnMinus2;
            fnMinus2 = fn;
            sum += fn;
            n++;
        }
        average = (double) sum / (double) N_MAX;
        System.out.print("\nThe average is " + average);

    }
}
