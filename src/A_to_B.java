public class A_to_B {
    public static void main(String[] args) {
        int a = 7, b = 3, c;
        c = a;
        a = b;
        b = c;
        System.out.printf("a: %d b: %d\n", a, b);
    }
}
