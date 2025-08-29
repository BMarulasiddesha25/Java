import org.w3c.dom.ls.LSOutput;

public class throwinexpectation {
    public static void main(String[] args) {
    try{
    check(0);
      }
    catch(Exception e1)
        {
            System.out.println(e1);
        }
}
public static void check(int n) {
    if (n == 0)
        throw new ArithmeticException("n is 0");
        else if (n == 1)
            throw new ArrayIndexOutOfBoundsException("n is 1");
            else
                System.out.println("no");
            }
        }

