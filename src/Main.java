import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("the number is not prime");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}