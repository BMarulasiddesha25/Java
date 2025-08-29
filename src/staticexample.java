public class staticexample {
    public static void main(String[] args) {
        Demo o1=new Demo();
        o1.dis1();
        dis2();
        Demo.dis3();
        staticexample o2=new staticexample();
        o2.dis4();
    }
    public static void dis2(){
        System.out.println("dis 2");
    }
    public void dis4(){
        System.out.println("dis4");
    }
}
class Demo{
   public void dis1(){
        System.out.println("dis1");
    }
    public static void dis3(){
        System.out.println("dis3");
    }
}
