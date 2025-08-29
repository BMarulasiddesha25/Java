public class methodoverriding {
    public static void main(String[] args) {
        demo1 w = new demo1();
        w.method();
        demo2 w2 = new demo2();
        w2.method();
        demo3 w3 = new demo3();
        w3.method();
    }
}
class demo1{
     void method(){
        System.out.println("taru");
    }
}
class demo2 extends demo1{
    void method(){
        System.out.println("taruu");
    }
}
class demo3 extends demo2{
    void method(){
        System.out.println("taruuu");
    }
}
