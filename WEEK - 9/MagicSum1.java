import java.util.Scanner;

class MagicSum1 {

    public static boolean hasEight(int x) {
        while (x > 0) {
            if (x % 10 == 8)
                return true;
            x /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {

            System.out.print("Enter a positive integer (or -1 to end): ");
            int n = sc.nextInt();

            if (n == -1)
                break;

            if (hasEight(n))
                sum += n;

            // Move to previous line
            System.out.print("\033[1A");

            // Clear the entire line
            System.out.print("\033[2K");

            // Return to the beginning of the line
            System.out.print("\r");
            System.out.flush();
        }

        System.out.println("The magic sum is: " + sum);

        sc.close();
    }
}