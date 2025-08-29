public class recursiontask1 {
    public static void main(String[] args) {
        display(0);
    }
    public static void display(int n) {
        {
            if (n == 5)
                return;
            else {
                System.out.println("B MARULASIDDESHA");
                n++;
                display(n);
            }
        }
    }
}

