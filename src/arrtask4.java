public class arrtask4 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int e = 0;
        int o = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                e++;
            else
                o++;
        }
        System.out.println("even: " + e);
        System.out.println("odd: " + o);
    }
}



