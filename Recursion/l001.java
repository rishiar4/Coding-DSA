public class l001 {

    public static void printIncreasing(int num1, int num2) {
        if(num1 == num2 + 1) {
            return;
        }

        System.out.print(num1 + " ");
        printIncreasing(num1+1, num2);
    }

    public static void printDecreasing(int num1, int num2) {
        if(num1 == num2 + 1) {
            return;
        }

        printDecreasing(num1+1, num2);
        System.out.print(num1 + " ");
    }

    public static void main(String[] args) {
        int num1 = 1, num2 = 10;
        // printIncreasing(num1, num2);
        printDecreasing(num1, num2);
    }
}