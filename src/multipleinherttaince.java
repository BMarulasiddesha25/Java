public class multipleinherttaince {
    public static void main(String[] args) {
        Son o=new Son();
        o.a();
        o.b();
        o.c();

    }
}
interface Father {
    void a();
}
interface Mother {
    void b();
}
class Son implements Father,Mother {
    @Override
    public void a() {
        System.out.println("siddu");
    }
    @Override
    public void b() {
        System.out.println("rock");
    }
    public void c() {
        System.out.println("siddu rockk");
    }

}
