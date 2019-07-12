package FlowControlLoopsAndArrays;

import java.util.Random;
import java.util.Scanner;

public class Ex9 {
    public static int[] randomArray() {
        Random rnd = new Random();
        int n = rnd.nextInt(5);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextInt(5);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    public static int maxNumber(int[] array) {
        int M = 0;                      //Prisiminti!!!
        for (int number : array) {
            if (M < number) {
                M = number;
            }
        }
        return M;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {      //b * 5
            int[] array = randomArray(); //a
            printArray(array);          //b
            System.out.printf("Max number is: %d", maxNumber(array));
        }
    }
}