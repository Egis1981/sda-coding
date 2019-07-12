package FlowControlLoopsAndArrays;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your text: ");
            String text = sc.next();
            System.out.println(text);

            if (text.equalsIgnoreCase("continue")) {
                continue;
            } else if (text.equalsIgnoreCase("quit")) {
                System.out.println("Good Bye!");
                break;
            }
        }
    }
}

