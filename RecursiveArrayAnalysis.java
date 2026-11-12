import java.util.Scanner;

public class RecursiveArrayAnalysis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arraySize = input.nextInt();

        if (arraySize <= 0) {
            input.close();
            return;
        }

        int[] arrayHolder = new int[arraySize];

        for (int i = 0; i < arrayHolder.length; i++) {
            if (input.hasNextInt()) {
                arrayHolder[i] = input.nextInt();
            }
        }

        int resultSum = arraySum(arrayHolder, 0);
        int resultMax = findMaximum(arrayHolder, 0);
        int resultEven = countEven(arrayHolder, 0);

        System.out.println("Array Sum: " + resultSum);
        System.out.println("Largest Element: " + resultMax);
        System.out.println("Number of Even Elements: " + resultEven);

    }

    public static int arraySum(int[] values, int index) {
        if (index == values.length) {
            return 0;
        }
        return values[index] + arraySum(values, index + 1);
    }

    public static int findMaximum(int[] values, int index) {
        if (index == values.length - 1) {
            return values[index];
        }
        int maxRest = findMaximum(values, index + 1);
        if (values[index] > maxRest) {
            return values[index];
        }
        return maxRest;
    }

    public static int countEven(int[] values, int index) {
        if (index == values.length) {
            return 0;
        }
        if (values[index] % 2 == 0) {
            return 1 + countEven(values, index + 1);
        }
        return countEven(values, index + 1);
    }
}
