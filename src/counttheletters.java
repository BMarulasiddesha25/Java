import org.w3c.dom.ls.LSOutput;

public class counttheletters {
    public static void main(String[] args) {
        String str = "Mister 123 @gmail.com";
        int captial = 0;int small = 0;int z=0;int w=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                captial++;
            }
               else if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
                {
                    small++;
                }
               else if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
            {
                z++;
            }
               else if(str.charAt(i)==32)
            {
                w++;
            }
                }

            System.out.println("Small: " + small);
            System.out.println("cap: " + captial);
            System.out.println("number: "+""+z);
            System.out.println("special: "+" "+w);
        }
        }





