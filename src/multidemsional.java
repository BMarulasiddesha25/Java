public class multidemsional {
    public static void main(String[] args) {
        int p = 0;
        int count = 0;
        int arr[][][] = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {

                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    for (int l = 1; l < arr[k].length; l++) {

                        if (arr[i][j][k] % l == 0)       //if(arr[i][j] %2==0) this for the even numbers
                            p++;                         //sum= (arr[i] [j][k])sum+i;

                        if (p == 2) {
                            count++;
                            p=0;
                        }
                    }
                    p = 0;
                }
            }
        }
        System.out.println(count);
    }
}



