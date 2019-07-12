package FlowControlLoopsAndArrays;

public class Ex5_c {

    public static void main(String[] args) {

        drawPyramid(9, 25);
        drawPyramid(11, 25);
        drawPyramid(15, 25);
    }

    public static void drawPyramid(int size, int width) {

        for (int i = 0; i < size; i++) {
            if (i < (size / 2)) {
                continue;
            }
            for (int k = 0; k < (width - size) / 2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size; j++) {
                if (i == (size - 1)) {
                    System.out.print("*");
                } else if (i == j || (j == (size - 1 - i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}