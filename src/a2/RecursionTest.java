package a2;

public class RecursionTest {

    private static void recurse(int i) {
       // System.out.println(i);
        try {
            recurse(i+1);
        } catch (StackOverflowError e) {
            System.out.print("Recursion depth on this system is " + i + ".");
        }
    }

    public static void main(String[] args) {
        RecursionTest.recurse(0);
    }
}
