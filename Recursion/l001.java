public class l001 {

    public static void printIncreasing(int num1, int num2) {
        if (num1 == num2 + 1) {
            return;
        }

        System.out.println(num1);

        printIncreasing(num1 + 1, num2);
    }

    public static void printDecreasing(int num1, int num2) {
        if (num1 == num2 + 1) {
            return;
        }

        printDecreasing(num1 + 1, num2);

        System.out.println(num1);
    }

    public static void printOddEven(int num1, int num2) {
        if (num1 == num2 + 1) {
            return;
        }

        if (num1 % 2 == 0) {
            System.out.println(num1);
        }

        printOddEven(num1 + 1, num2);

        if (num1 % 2 != 0) {
            System.out.println(num1);
        }

    }

    public static int fact(int num1) {
        return num1 == 0 ? 1 : fact(num1 - 1) * num1;
    }

    public static int power(int a, int b) {
        return b == 0 ? 1 : power(a, b - 1) * a;
    }

    public static int powerBtr(int a, int b) {
        if (b == 0) {
            return 1;
        }
        
        int ans = powerBtr(a, b / 2);

        ans *= ans;

        return b % 2 != 0 ? ans * a : ans;
    }

    public static void main(String[] args) {
        int num1 = 1, num2 = 10;
        // printIncreasing(num1, num2);
        // printDecreasing(num1, num2);
        // printOddEven(num1, num2);
        // System.out.println(fact(num2));
        System.out.println(power(10, 5));
        System.out.println(powerBtr(10, 5));
    }
}