public class methodusingarray {
    public static void main(String[] args) {
        dis1();
        dis2();
        dis3();
    }

    public static void dis1() {
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void dis2() {
        int arr2[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void dis3() {
        int arr3[][][] = {
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
                }
        };
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[j].length; k++) {
                    System.out.print(arr3[i][j][k]+" ");

                }
                System.out.println();
            }
            System.out.println();
        }


    }

}









