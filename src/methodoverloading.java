public class methodoverloading {
    public static void main(String[] args) {
        demo w = new demo();
        w.method(1);
        w.method(5,4);
        w.method(1,2,3);
    }
}
class demo {
     void method(int a){
        System.out.println("a");
    }
    void method(int a,int b){
        System.out.println("a+b");
    }
    void method(int a,int b,int c){
         System.out.println("a+b+c");
    }
}
