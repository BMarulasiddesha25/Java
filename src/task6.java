public class task6 {
    public static void main(String[] args) {
        int a=1235776,b,sum=0;
        while(a!=0) {
            b=a%10;
            if(b%2!=0)
                sum=sum+b;
            a=a/10;
        }
        System.out.println(sum);
    }



}
