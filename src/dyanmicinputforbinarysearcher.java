import java.util.*;
public class dyanmicinputforbinarysearcher {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> o=new ArrayList<>();
        System.out.println("Enter the number");
        int ele=in.nextInt();
        for(int i=1;i<ele;i++)
        {
            System.out.println("Enter the number"+i);
            int x=in.nextInt();
            o.add(x);

        }
        System.out.println(o);
    }
}
