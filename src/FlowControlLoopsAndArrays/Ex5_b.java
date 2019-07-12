package FlowControlLoopsAndArrays;

public class Ex5_b {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || (i == (size - 1))) { // pirma arba paskutine eilute
                    System.out.print("*");
                } else if (j == 0||(j==(size-1))  // sienos
                        ||(i==j)||(j==(size-1-i))) { //istrizaines
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}