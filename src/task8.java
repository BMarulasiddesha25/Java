public class task8 {
    public static void main(String[] args) {
        int n = 3, c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("given number is  prime number");
        } else {
            System.out.println("given number is not a prime  number");
        }
    }
}
