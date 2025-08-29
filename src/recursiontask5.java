public class recursiontask5 {
        public static void main(String[] args) {
            dis(0);
        }
        public static void dis(int n) {

            if (n==11) {
                return;
            } else
            if (n % 2 != 0)
                System.out.println(n);
            n++;
            dis(n);

        }
    }






