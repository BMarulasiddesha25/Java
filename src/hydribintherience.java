import org.w3c.dom.ls.LSOutput;

public class hydribintherience {
    public static void main(String[] args) {
        grandfather o=new grandfather();
        son1 y=new son1();
        son2 z=new son2();
        o.home();
        y.land();

    }
}
class grandfather{
    void home()
    {
        System.out.println("land");
    }
}
class son1 extends grandfather{
    void land()
    {
        System.out.println("land owner");
    }
}
class son2 extends grandfather{
    void land2()
    {
        System.out.println("land buyer");
    }
}
class grandson1 extends son1{
    void land3()
    {
        System.out.println("land user");
    }
}
class grandson2 extends son1{
    void land4()
    {
        System.out.println("land buyer user2");
    }
}
class grandson3 extends son2{
    void land5()
    {
        System.out.println("kkkkk");
    }
}
