package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        if (printToInclusive > 0) {
            int i = 0;
            while (i <= printToInclusive) {
                if (isPrime(i) == true) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }

    public static boolean isPrime(int i) {

        if (i == 0 || i == 1) {
            return false;
        } else if (i == 2 || i == 3 || i == 5) {
            return true;
        } else if (i%2 == 0 || i%3 == 0 || i%5 == 0) {
            return false;
        } else {
            return true;
        }

    }

}
