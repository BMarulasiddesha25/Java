public class withreturnwithoutargs {
    public static void main(String[] args) {
        System.out.println(mul());
        System.out.println(div(5,3));
    }

    public static int mul() {
        int a=5;
        int b=5;
        return a*b;

    }
    public static int div(int a,int b){
        return a/b;
    }
}
