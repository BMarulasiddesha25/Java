import java.util.Scanner;

public class searchexmple2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int tar=10;int dummy=0,index=0;
         for(int i=0;i<arr.length;i++){
             if(tar==arr[i])
             {
                 dummy=1;
                 index=i;
                 break;
             }
         }
         if(dummy==1)
             System.out.println("found");
         else
             System.out.println("not found");
    }
}
