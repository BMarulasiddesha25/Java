public class recursiontask4 {
        public static void main(String[] args) {
            dis(11);
        }
        public static void dis(int n) {

            if (n==0) {
                return;
            } else
            if (n % 2 == 0)
                System.out.println(n);
            n--;
            dis(n);

        }
    }






