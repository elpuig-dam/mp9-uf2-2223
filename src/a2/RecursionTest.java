package a2;

public class RecursionTest {

    public RecursionTest() {
        System.out.println("init");
    }

    private void recurse(int i) {
       // System.out.println(i);
        try {
            recurse(i+1);
        } catch (StackOverflowError e) {
            System.out.print("Recursion depth on this system is " + i + ".");
        }
    }

    public static void main(String[] args) {
        RecursionTest rec = new RecursionTest();
        rec.recurse(0);
    }
}
