public class evenin2demsional {
    public static void main(String[] args) {
        int sum=0;
        int a[][]= {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for(int k=0;k<a.length;k++){
            for(int j=0;j<a[k].length;j++) {
                if (a[k][j] % 2 == 0)
                    sum = sum + a[k][j];
            }
            }
            System.out.print(sum);
        System.out.println();
        }
    }

