import java.util.*;
public class binarysearchexample {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int s=0;int tar=50;int dummy=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(tar>arr[mid])
                s=mid+1;
            else if(tar<arr[mid])
                e=mid-1;
            else if(tar==arr[mid])
                dummy=1;
            else{
                dummy=0;
               // System.out.println("found=" +" "+ mid);
            break;}
        }
    }
}
