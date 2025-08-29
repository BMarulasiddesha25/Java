

public class task4 {
    public static void main(String[] args) {
        int a=123456,b,sum=0;
        while(a!=0){
            b=a%10;
            sum=sum+b;
            a=a/10;
        }
        System.out.println(sum);
        }
    }