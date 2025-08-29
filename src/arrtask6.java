import java.sql.SQLOutput;

public class arrtask6 {
    public static void main(String[] args) {
        int sum = 0;int sume=0;
        int arr[] = {1, 2, 3, 4};
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0)
            sum = sum + arr[j];
            else
            sume = sume +arr[j];

            }
        System.out.println(" even number"+sum);
        System.out.println("sum of odd" +sume);
    }
}
