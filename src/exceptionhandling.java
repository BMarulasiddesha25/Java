public class exceptionhandling {
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3};
        System.out.println("array1");
        try{
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("array2");
        System.out.println("array3");
    }
}