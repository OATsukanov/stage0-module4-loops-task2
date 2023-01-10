package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int i = 0;
        while (i <= printToInclusive) {

            System.out.println(factorial(i));
            i++;
        }

    }

    public static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }

}
