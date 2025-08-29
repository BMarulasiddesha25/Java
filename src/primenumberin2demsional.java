public class primenumberin2demsional {
    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int p = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                for (int k = 1; k < a[i][j]; k++) {
                    if (a[i][j] % k == 0) {
                        p++;
                    }
                }
                if (p == 2) {
                    count++;
                }
                p = 0;

            }
            System.out.println(count);

        }
    }
}





