public class MathOperators {

    public static void main(String[] args) {
        // extended assignment operators
        int x = 12;
        x += 5;   // x = x + 5
        System.out.println("x is now " + x);

        int y = 10;
        y /= 2;    // y = y / 2;
        System.out.println("y is now " + y);

        // increment / decrement operators
        int a = 6;
        a++;
        System.out.println("a is now " + a);  // a will be 7
        int b = 20;
        b--;
        System.out.println("b is now " + b);  // b is now 19

        // Math methods
        int m = Math.abs(-9);    // m will contain 9
        double n = Math.abs(-10.5);   // n will contain 10.5
        System.out.println("m will contain " + m);
        System.out.println("n will contain " + n);

        double result = Math.sqrt(81);
        System.out.println("Sqrt of 81 will be " + result);

        int biggerNumber = Math.max(50, 30);
        System.out.println("Bigger number between 50 and 30 is: " + biggerNumber);

    }
}
