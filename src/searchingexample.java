import java.util.*;
public class searchingexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        int dummy = 0;
        for (int i = 0; i < n; i++) {
            if (tar == arr[i]) {
                dummy = 1;
                break;
            }
        }
        if (dummy == 1)
            System.out.println("found");
        else
            System.out.println("not found");
        }
    }
