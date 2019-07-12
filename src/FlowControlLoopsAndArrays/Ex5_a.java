package FlowControlLoopsAndArrays;

public class Ex5_a {
    public static void main(String[] args) {
        int size = 5;
       for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
           /*            //Tusciaviduris trikampis
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == (size - 1) || ((j == 0) || (j == i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();*/
        }
    }
}
