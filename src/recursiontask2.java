public class recursiontask2 {
    public static void main(String[] args) {
        dis(1);
        }
    public static void dis(int n){

            if(n==11) {
                return;
            }
            else
                System.out.println(n);
                n++;
                dis(n);
            }
        }


